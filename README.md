# 2018-01-MeetupDemo
Haskell Android Demo Application for the haskell.sg Meetup Talk

This is a very(!) simple haskell library. The intention is to demostrate the
necessary glue code to have an android application calling haskell and
displaying the result.  It follows closely the sample C++ JNI demo template
that Android Studio generates.

## Building

With the cross compiler and toolchain in place, running the `Makefile`
(`make all`) in the `app` directory should generate the necessary static
libraries for `x86_64` (Simulartor), `armveabi-v7a` (arm32), and
`arm64-v8a` (aarch64) in the `hs-libs` folder.  

## Installing

With the static libraries generated, hitting the Run button in Android
Studio should install the application on the Simulator or Device.

---

Slides from the presentation: [speakerdeck.com/angerman/building-android-apps-with-haskell](https://speakerdeck.com/angerman/building-android-apps-with-haskell)
