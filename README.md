Fails with library SNAPSHOTs as of April 21 2015.

Error message:
```
▶ ./gradlew --stacktrace compileJava
:compileJava
<project path>/dagger-issue172/src/main/java/dagger/issue172/SuperInterface.java:8: error: cannot find symbol
    TestObjectFactory factory();
    ^
  symbol:   class TestObjectFactory
  location: interface SuperInterface
:compileJava FAILED

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':compileJava'.
> java.lang.IllegalArgumentException: TestObjectFactory cannot be represented as a Class<?>.

* Try:
Run with --info or --debug option to get more log output.

* Exception is:
org.gradle.api.tasks.TaskExecutionException: Execution failed for task ':compileJava'.
        at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeActions(ExecuteActionsTaskExecuter.java:69)
        at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:46)
        at org.gradle.api.internal.tasks.execution.PostExecutionAnalysisTaskExecuter.execute(PostExecutionAnalysisTaskExecuter.java:35)
        at org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter.execute(SkipUpToDateTaskExecuter.java:64)
        at org.gradle.api.internal.tasks.execution.ValidatingTaskExecuter.execute(ValidatingTaskExecuter.java:58)
        at org.gradle.api.internal.tasks.execution.SkipEmptySourceFilesTaskExecuter.execute(SkipEmptySourceFilesTaskExecuter.java:42)
        at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:52)
        at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:53)
        at org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter.execute(ExecuteAtMostOnceTaskExecuter.java:43)
        at org.gradle.api.internal.AbstractTask.executeWithoutThrowingTaskFailure(AbstractTask.java:305)
        at org.gradle.execution.taskgraph.AbstractTaskPlanExecutor$TaskExecutorWorker.executeTask(AbstractTaskPlanExecutor.java:79)
        at org.gradle.execution.taskgraph.AbstractTaskPlanExecutor$TaskExecutorWorker.processTask(AbstractTaskPlanExecutor.java:63)
        at org.gradle.execution.taskgraph.AbstractTaskPlanExecutor$TaskExecutorWorker.run(AbstractTaskPlanExecutor.java:51)
        at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor.process(DefaultTaskPlanExecutor.java:23)
        at org.gradle.execution.taskgraph.DefaultTaskGraphExecuter.execute(DefaultTaskGraphExecuter.java:88)
        at org.gradle.execution.SelectedTaskExecutionAction.execute(SelectedTaskExecutionAction.java:29)
        at org.gradle.execution.DefaultBuildExecuter.execute(DefaultBuildExecuter.java:62)
        at org.gradle.execution.DefaultBuildExecuter.access$200(DefaultBuildExecuter.java:23)
        at org.gradle.execution.DefaultBuildExecuter$2.proceed(DefaultBuildExecuter.java:68)
        at org.gradle.execution.DryRunBuildExecutionAction.execute(DryRunBuildExecutionAction.java:32)
        at org.gradle.execution.DefaultBuildExecuter.execute(DefaultBuildExecuter.java:62)
        at org.gradle.execution.DefaultBuildExecuter.execute(DefaultBuildExecuter.java:55)
        at org.gradle.initialization.DefaultGradleLauncher.doBuildStages(DefaultGradleLauncher.java:149)
        at org.gradle.initialization.DefaultGradleLauncher.doBuild(DefaultGradleLauncher.java:106)
        at org.gradle.initialization.DefaultGradleLauncher.run(DefaultGradleLauncher.java:86)
        at org.gradle.launcher.exec.InProcessBuildActionExecuter$DefaultBuildController.run(InProcessBuildActionExecuter.java:80)
        at org.gradle.launcher.cli.ExecuteBuildAction.run(ExecuteBuildAction.java:33)
        at org.gradle.launcher.cli.ExecuteBuildAction.run(ExecuteBuildAction.java:24)
        at org.gradle.launcher.exec.InProcessBuildActionExecuter.execute(InProcessBuildActionExecuter.java:36)
        at org.gradle.launcher.exec.InProcessBuildActionExecuter.execute(InProcessBuildActionExecuter.java:26)
        at org.gradle.launcher.daemon.server.exec.ExecuteBuild.doBuild(ExecuteBuild.java:47)
        at org.gradle.launcher.daemon.server.exec.BuildCommandOnly.execute(BuildCommandOnly.java:34)
        at org.gradle.launcher.daemon.server.exec.DaemonCommandExecution.proceed(DaemonCommandExecution.java:119)
        at org.gradle.launcher.daemon.server.exec.WatchForDisconnection.execute(WatchForDisconnection.java:35)
        at org.gradle.launcher.daemon.server.exec.DaemonCommandExecution.proceed(DaemonCommandExecution.java:119)
        at org.gradle.launcher.daemon.server.exec.ResetDeprecationLogger.execute(ResetDeprecationLogger.java:24)
        at org.gradle.launcher.daemon.server.exec.DaemonCommandExecution.proceed(DaemonCommandExecution.java:119)
        at org.gradle.launcher.daemon.server.exec.StartStopIfBuildAndStop.execute(StartStopIfBuildAndStop.java:33)
        at org.gradle.launcher.daemon.server.exec.DaemonCommandExecution.proceed(DaemonCommandExecution.java:119)
        at org.gradle.launcher.daemon.server.exec.ForwardClientInput$2.call(ForwardClientInput.java:71)
        at org.gradle.launcher.daemon.server.exec.ForwardClientInput$2.call(ForwardClientInput.java:69)
        at org.gradle.util.Swapper.swap(Swapper.java:38)
        at org.gradle.launcher.daemon.server.exec.ForwardClientInput.execute(ForwardClientInput.java:69)
        at org.gradle.launcher.daemon.server.exec.DaemonCommandExecution.proceed(DaemonCommandExecution.java:119)
        at org.gradle.launcher.daemon.server.exec.LogToClient.doBuild(LogToClient.java:60)
        at org.gradle.launcher.daemon.server.exec.BuildCommandOnly.execute(BuildCommandOnly.java:34)
        at org.gradle.launcher.daemon.server.exec.DaemonCommandExecution.proceed(DaemonCommandExecution.java:119)
        at org.gradle.launcher.daemon.server.exec.EstablishBuildEnvironment.doBuild(EstablishBuildEnvironment.java:70)
        at org.gradle.launcher.daemon.server.exec.BuildCommandOnly.execute(BuildCommandOnly.java:34)
        at org.gradle.launcher.daemon.server.exec.DaemonCommandExecution.proceed(DaemonCommandExecution.java:119)
        at org.gradle.launcher.daemon.server.exec.DaemonHygieneAction.execute(DaemonHygieneAction.java:39)
        at org.gradle.launcher.daemon.server.exec.DaemonCommandExecution.proceed(DaemonCommandExecution.java:119)
        at org.gradle.launcher.daemon.server.exec.StartBuildOrRespondWithBusy$1.run(StartBuildOrRespondWithBusy.java:46)
        at org.gradle.launcher.daemon.server.DaemonStateCoordinator$1.run(DaemonStateCoordinator.java:246)
        at org.gradle.internal.concurrent.DefaultExecutorFactory$StoppableExecutorImpl$1.run(DefaultExecutorFactory.java:64)
Caused by: java.lang.RuntimeException: java.lang.IllegalArgumentException: TestObjectFactory cannot be represented as a Class<?>.
        at com.sun.tools.javac.main.Main.compile(Main.java:553)
        at com.sun.tools.javac.api.JavacTaskImpl.doCall(JavacTaskImpl.java:129)
        at com.sun.tools.javac.api.JavacTaskImpl.call(JavacTaskImpl.java:138)
        at org.gradle.api.internal.tasks.compile.JdkJavaCompiler.execute(JdkJavaCompiler.java:42)
        at org.gradle.api.internal.tasks.compile.JdkJavaCompiler.execute(JdkJavaCompiler.java:35)
        at org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler.delegateAndHandleErrors(NormalizingJavaCompiler.java:97)
        at org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler.execute(NormalizingJavaCompiler.java:50)
        at org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler.execute(NormalizingJavaCompiler.java:36)
        at org.gradle.api.internal.tasks.compile.CleaningJavaCompilerSupport.execute(CleaningJavaCompilerSupport.java:34)
        at org.gradle.api.internal.tasks.compile.CleaningJavaCompilerSupport.execute(CleaningJavaCompilerSupport.java:25)
        at org.gradle.api.tasks.compile.JavaCompile.performCompilation(JavaCompile.java:158)
        at org.gradle.api.tasks.compile.JavaCompile.compile(JavaCompile.java:138)
        at org.gradle.api.tasks.compile.JavaCompile.compile(JavaCompile.java:92)
        at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:63)
        at org.gradle.api.internal.project.taskfactory.AnnotationProcessingTaskFactory$IncrementalTaskAction.doExecute(AnnotationProcessingTaskFactory.java:235)
        at org.gradle.api.internal.project.taskfactory.AnnotationProcessingTaskFactory$StandardTaskAction.execute(AnnotationProcessingTaskFactory.java:211)
        at org.gradle.api.internal.project.taskfactory.AnnotationProcessingTaskFactory$IncrementalTaskAction.execute(AnnotationProcessingTaskFactory.java:222)
        at org.gradle.api.internal.project.taskfactory.AnnotationProcessingTaskFactory$StandardTaskAction.execute(AnnotationProcessingTaskFactory.java:200)
        at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeAction(ExecuteActionsTaskExecuter.java:80)
        at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeActions(ExecuteActionsTaskExecuter.java:61)
        ... 54 more
Caused by: java.lang.IllegalArgumentException: TestObjectFactory cannot be represented as a Class<?>.
        at dagger.shaded.auto.common.MoreTypes$16.defaultAction(MoreTypes.java:658)
        at dagger.shaded.auto.common.MoreTypes$16.defaultAction(MoreTypes.java:656)
        at com.sun.tools.javac.code.Type$ErrorType.accept(Type.java:1837)
        at dagger.shaded.auto.common.MoreTypes.isTypeOf(MoreTypes.java:656)
        at dagger.internal.codegen.DependencyRequest$Factory.extractKindAndType(DependencyRequest.java:271)
        at dagger.internal.codegen.DependencyRequest$Factory.newDependencyRequest(DependencyRequest.java:239)
        at dagger.internal.codegen.DependencyRequest$Factory.forComponentProvisionMethod(DependencyRequest.java:175)
        at dagger.internal.codegen.ComponentDescriptor$Factory.getDescriptorForComponentMethod(ComponentDescriptor.java:256)
        at dagger.internal.codegen.ComponentDescriptor$Factory.create(ComponentDescriptor.java:198)
        at dagger.internal.codegen.ComponentDescriptor$Factory.forComponent(ComponentDescriptor.java:154)
        at dagger.internal.codegen.ComponentProcessingStep.process(ComponentProcessingStep.java:74)
        at dagger.shaded.auto.common.BasicAnnotationProcessor.process(BasicAnnotationProcessor.java:228)
        at com.sun.tools.javac.processing.JavacProcessingEnvironment.callProcessor(JavacProcessingEnvironment.java:794)
        at com.sun.tools.javac.processing.JavacProcessingEnvironment.discoverAndRunProcs(JavacProcessingEnvironment.java:705)
        at com.sun.tools.javac.processing.JavacProcessingEnvironment.access$1800(JavacProcessingEnvironment.java:91)
        at com.sun.tools.javac.processing.JavacProcessingEnvironment$Round.run(JavacProcessingEnvironment.java:1035)
        at com.sun.tools.javac.processing.JavacProcessingEnvironment.doProcessing(JavacProcessingEnvironment.java:1176)
        at com.sun.tools.javac.main.JavaCompiler.processAnnotations(JavaCompiler.java:1170)
        at com.sun.tools.javac.main.JavaCompiler.compile(JavaCompiler.java:856)
        at com.sun.tools.javac.main.Main.compile(Main.java:523)
        ... 73 more


BUILD FAILED
```