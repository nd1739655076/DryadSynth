use std::fs;
use std::io::{Read, Write};
use std::net::TcpStream;

fn main() -> std::io::Result<()> {
    let input = fs::read("max2.sl")?;
    let mut stream = TcpStream::connect("127.0.0.1:7777")?;
    println!("Connected to DryadSynth RPC, sending {} bytes", input.len());
    stream.write_all(&(input.len() as u32).to_be_bytes())?;
    stream.write_all(&input)?;
    let mut len_buf = [0u8; 4];
    stream.read_exact(&mut len_buf)?;
    let resp_len = u32::from_be_bytes(len_buf) as usize;
    let mut resp = vec![0u8; resp_len];
    stream.read_exact(&mut resp)?;
    println!("Received {} bytes", resp.len());
    println!("--- Solver output (raw) ---\n{}",
             String::from_utf8_lossy(&resp));

    Ok(())
}
