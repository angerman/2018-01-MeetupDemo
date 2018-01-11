all : hs-libs/armeabi-v7a/libHSmeetupdemo.a hs-libs/arm64-v8a/libHSmeetupdemo.a hs-libs/x86_64/libHSmeetupdemo.a
.PHONY : all

hs-libs/armeabi-v7a/libHSmeetupdemo.a: src/main/hs/Lib.hs
	armv7-linux-androideabi-ghc \
    -fllvmng -staticlib -fPIC \
    -o hs-libs/armeabi-v7a/libHSmeetupdemo.a \
		-odir build/hs/armv7 -hidir build/hs/armv7 \
		src/main/hs/Lib.hs

hs-libs/arm64-v8a/libHSmeetupdemo.a: src/main/hs/Lib.hs
	aarch64-linux-android-ghc \
    -fllvmng -staticlib -fPIC \
    -o hs-libs/arm64-v8a/libHSmeetupdemo.a \
		-odir build/hs/arm64 -hidir build/hs/arm64 \
		src/main/hs/Lib.hs

hs-libs/x86_64/libHSmeetupdemo.a: src/main/hs/Lib.hs
	x86_64-linux-android-ghc \
    -fllvmng -staticlib -fPIC \
    -o hs-libs/x86_64/libHSmeetupdemo.a \
		-odir build/hs/x86_64 -hidir build/hs/x86_64 \
		src/main/hs/Lib.hs
