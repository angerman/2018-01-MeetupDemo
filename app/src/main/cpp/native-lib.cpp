#include <jni.h>
#include <string>

extern "C" {
   extern void hs_init(int * argc, char ** argv[]);
   extern char *hs_hello();
}
extern "C"
JNIEXPORT void

JNICALL
Java_com_zw3rk_meetupdemo_MainActivity_hsInit(JNIEnv *env, jobject /* this */) {
    hs_init(NULL,NULL);
}

extern "C"
JNIEXPORT jstring

JNICALL
Java_com_zw3rk_meetupdemo_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    return env->NewStringUTF(hs_hello());
}

