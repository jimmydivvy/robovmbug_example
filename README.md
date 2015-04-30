Simple sample project to illustrate an issue compiling a project using Argonaut with RoboVM

Execute `./gradlew compileScala launchIPhoneSimulator --stacktrace`
    
will show

  Caused by: java.io.FileNotFoundException:
  /Users/james/.robovm/cache/ios/x86/release/Users/james/.gradle/caches/modules-2/files-2.1/io.argonaut/argonaut_2.11/6.0.4/372a4ecf2e42f3517afd534e2f27b624643d8d67/argonaut_2.11-6.0.4.jar/argonaut/GeneratedDecodeJsons$$anonfun$Tuple10DecodeJson$1$$anonfun$apply$53$$anonfun$apply$54$$anonfun$apply$55$$anonfun$apply$56$$anonfun$apply$57$$anonfun$apply$58$$anonfun$apply$59$$anonfun$apply$60$$anonfun$apply$61$$anonfun$apply$62$$anonfun$apply$63.class.info
  (File name too long)
      at org.robovm.compiler.clazz.Clazz.saveClazzInfo(Clazz.java:107)
      at
  org.robovm.compiler.ClassCompiler.compile(ClassCompiler.java:848)
      at
  org.robovm.compiler.ClassCompiler.compile(ClassCompiler.java:285)
      at org.robovm.compiler.AppCompiler.compile(AppCompiler.java:242)
      at org.robovm.compiler.AppCompiler.compile(AppCompiler.java:331)
      at org.robovm.compiler.AppCompiler.compile(AppCompiler.java:375)
      at
  org.robovm.gradle.tasks.AbstractRoboVMTask.build(AbstractRoboVMTask.java:96)
