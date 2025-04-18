use std::io::{Read, Write};
use std::net::TcpStream;

use prost::Message;

pub mod sygus {
    include!(concat!(env!("OUT_DIR"), "/sygus.rs"));
}
use sygus::{SygusProblem, SygusSolution};

fn main() -> std::io::Result<()> {
    let mut stream = TcpStream::connect("127.0.0.1:24961")?;
    println!("Connected to server");

    let problem = SygusProblem {
        logic: "LIA".to_string(),
        program: "(set-logic LIA)\n(synth-fun max2 ...)".to_string(),
    };
    let mut req_buf = Vec::new();
    problem.encode(&mut req_buf).unwrap();

    let len = req_buf.len() as u32;
    stream.write_all(&len.to_be_bytes())?;
    stream.write_all(&req_buf)?;
    println!("Sent request of {} bytes", len);

    let mut len_buf = [0u8; 4];
    stream.read_exact(&mut len_buf)?;
    let resp_len = u32::from_be_bytes(len_buf) as usize;

    let mut resp_buf = vec![0u8; resp_len];
    stream.read_exact(&mut resp_buf)?;
    println!("Received response of {} bytes", resp_len);

    let solution = SygusSolution::decode(&resp_buf[..]).unwrap();
    println!("Solver success: {}", solution.success);
    println!("Answer: {}", solution.answer);
    println!("ErrorMsg: {}", solution.error_msg);

    Ok(())
}
