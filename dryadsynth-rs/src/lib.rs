pub mod sygus {
    include!(concat!(env!("OUT_DIR"), "/sygus.rs"));
}

use prost::Message;
use sygus::{SygusProblem, SygusSolution};

// Encode `.sl` into protobuf binary
pub fn encode_problem(logic: &str, program: &str) -> Vec<u8> {
    let problem = SygusProblem {
        logic: logic.to_string(),
        program: program.to_string(),
    };
    let mut buf = Vec::new();
    problem.encode(&mut buf).unwrap();
    buf
}

// Decode result from Java server
pub fn decode_solution(buf: &[u8]) -> SygusSolution {
    SygusSolution::decode(buf).unwrap()
}
