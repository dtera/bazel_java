package javacpp.heu;

@SuppressWarnings("ALL")
public class Constants {
  public static final String[] links = {"phe_kit", "decryptor", "encryptor", "evaluator", "key_generator", "public_key", "secret_key", "ciphertext",
    "lookup_table", "paillier_float", "pb_utils", "phe", "schema", "serializable_types", "legacy_coding", "blake3_c",
    "spdlog", "gflags", "benchmark", "mcl", "libsodium", "tommath", "FourQ", "crypto", "ssl", "base", "log_severity",
    "malloc_internal", "raw_logging_internal", "spinlock_wait", "throw_delegate", "debugging_internal",
    "decode_rust_punycode", "demangle_internal", "demangle_rust", "stacktrace", "symbolize", "utf8_for_code_point",
    "int128", "internal", "string_view", "strings", "bad_optional_access", "gtest", "gtest_main", "protobuf",
    "protobuf_lite", "gmp", "secparam", "buffer", "exception", "int128", "curve_meta", "ec_point", "spi",
    "FourQ_group", "ed25519_group", "sodium_group", "x25519_group", "util", "common", "montgomery", "weierstrass",
    "blake3", "hash_utils", "ssl_hash", "montgomery_math", "mpint", "tommath_ext_features", "tommath_ext_types",
    "parallel", "thread_pool", "item", "arg_impl", "argument", "util", "zlib"};

  public static final String[] linkPaths = {"gmp/lib/libgmp.a", "libgflags.a", "spdlog/lib/libspdlog.a", "liblibsodium.a",
    "libzlib.a", "libbenchmark.a", "interconnection/runtime/libphe.a", "openssl/lib/libcrypto.a", "openssl/lib/libssl.a",
    "mcl-cmake/lib/libmcl.a", "libprotobuf.a", "libprotobuf_lite.a", "yacl/crypto/hash/libblake3.a",
    "yacl/crypto/hash/libssl_hash.a", "yacl/crypto/hash/libhash_utils.a", "yacl/crypto/ecc/toy/libmontgomery.a",
    "yacl/crypto/ecc/toy/libcommon.a", "yacl/crypto/ecc/toy/libweierstrass.a", "yacl/crypto/ecc/libcurve_meta.a",
    "yacl/crypto/ecc/FourQlib/libFourQ_group.a", "yacl/crypto/ecc/mcl/libutil.a", "yacl/crypto/ecc/libspi.a",
    "yacl/crypto/ecc/libec_point.a", "yacl/crypto/ecc/libsodium/libed25519_group.a",
    "yacl/crypto/ecc/libsodium/libx25519_group.a", "yacl/crypto/ecc/libsodium/libsodium_group.a", "yacl/libsecparam.a",
    "yacl/utils/libparallel.a", "yacl/utils/libthread_pool.a", "yacl/utils/spi/libitem.a",
    "yacl/utils/spi/argument/libargument.a", "yacl/utils/spi/argument/libutil.a", "yacl/utils/spi/argument/libarg_impl.a",
    "yacl/math/mpint/libmpint.a", "yacl/math/mpint/libmontgomery_math.a", "yacl/math/mpint/libtommath_ext_types.a",
    "yacl/math/mpint/libtommath_ext_features.a", "yacl/base/libexception.a", "yacl/base/libint128.a",
    "yacl/base/libbuffer.a", "libblake3_c.a", "libgtest_main.a", "libgtest.a", "FourQlib/lib/libFourQ.a",
    "libtommath/lib/libtommath.a", "heu/library/algorithms/dgk/libkey_generator.a",
    "heu/library/algorithms/dgk/libsecret_key.a", "heu/library/algorithms/dgk/libdecryptor.a",
    "heu/library/algorithms/dgk/libpublic_key.a", "heu/library/algorithms/dgk/libencryptor.a",
    "heu/library/algorithms/dgk/libevaluator.a", "heu/library/algorithms/elgamal/libciphertext.a",
    "heu/library/algorithms/elgamal/libkey_generator.a", "heu/library/algorithms/elgamal/libsecret_key.a",
    "heu/library/algorithms/elgamal/utils/liblookup_table.a", "heu/library/algorithms/elgamal/libdecryptor.a",
    "heu/library/algorithms/elgamal/libpublic_key.a", "heu/library/algorithms/elgamal/libencryptor.a",
    "heu/library/algorithms/elgamal/libevaluator.a", "heu/library/algorithms/mock/libkey_generator.a",
    "heu/library/algorithms/mock/libdecryptor.a", "heu/library/algorithms/mock/libencryptor.a",
    "heu/library/algorithms/mock/libevaluator.a", "heu/library/algorithms/paillier_float/libpaillier_float.a",
    "heu/library/algorithms/dj/libkey_generator.a", "heu/library/algorithms/dj/libsecret_key.a",
    "heu/library/algorithms/dj/libdecryptor.a", "heu/library/algorithms/dj/libpublic_key.a",
    "heu/library/algorithms/dj/libencryptor.a", "heu/library/algorithms/dj/libevaluator.a",
    "heu/library/algorithms/paillier_zahlen/libkey_generator.a", "heu/library/algorithms/paillier_zahlen/libsecret_key.a",
    "heu/library/algorithms/paillier_zahlen/libdecryptor.a", "heu/library/algorithms/paillier_zahlen/libpublic_key.a",
    "heu/library/algorithms/paillier_zahlen/libencryptor.a", "heu/library/algorithms/paillier_zahlen/libevaluator.a",
    "heu/library/algorithms/paillier_ic/libciphertext.a", "heu/library/algorithms/paillier_ic/libkey_generator.a",
    "heu/library/algorithms/paillier_ic/libpb_utils.a", "heu/library/algorithms/paillier_ic/libdecryptor.a",
    "heu/library/algorithms/paillier_ic/libpublic_key.a", "heu/library/algorithms/paillier_ic/libencryptor.a",
    "heu/library/algorithms/paillier_ic/libevaluator.a", "heu/library/algorithms/ou/libkey_generator.a",
    "heu/library/algorithms/ou/libdecryptor.a", "heu/library/algorithms/ou/libpublic_key.a",
    "heu/library/algorithms/ou/libencryptor.a", "heu/library/algorithms/ou/libevaluator.a", "heu/library/phe/libphe.a",
    "heu/library/phe/encoding/liblegacy_coding.a", "heu/library/phe/libdecryptor.a", "heu/library/phe/libencryptor.a",
    "heu/library/phe/libevaluator.a", "heu/library/phe/base/libschema.a", "heu/library/phe/base/libserializable_types.a",
    "absl/strings/libstring_view.a", "absl/strings/libinternal.a", "absl/strings/libstrings.a",
    "absl/types/libbad_optional_access.a", "absl/debugging/libstacktrace.a", "absl/debugging/libdemangle_rust.a",
    "absl/debugging/libutf8_for_code_point.a", "absl/debugging/libdecode_rust_punycode.a",
    "absl/debugging/libdebugging_internal.a", "absl/debugging/libdemangle_internal.a", "absl/debugging/libsymbolize.a",
    "absl/numeric/libint128.a", "absl/base/libthrow_delegate.a", "absl/base/liblog_severity.a", "absl/base/libbase.a",
    "absl/base/libmalloc_internal.a", "absl/base/libraw_logging_internal.a", "absl/base/libspinlock_wait.a"};
}