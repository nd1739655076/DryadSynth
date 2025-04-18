fn main() {
    prost_build::compile_protos(
        &["../dryadsynth/proto/sygus.proto"],
        &["../dryadsynth/proto"],
    ).unwrap();
}
