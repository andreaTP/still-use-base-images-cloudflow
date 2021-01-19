import sbtdocker.Instructions

lazy val akkaRuntime =  (project in file("."))
    .enablePlugins(CloudflowApplicationPlugin, CloudflowFlinkPlugin)
    .settings(
      name := "flink-runtime",
      version := "2.0.22",
      verifyBlueprint := {},
      baseDockerInstructions := baseDockerInstructions.value.dropRight(3)
    )
