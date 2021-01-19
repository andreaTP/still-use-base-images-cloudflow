import sbtdocker.Instructions

lazy val akkaRuntime =  (project in file("."))
    .enablePlugins(CloudflowApplicationPlugin, CloudflowAkkaPlugin)
    .settings(
      name := "akka-runtime",
      version := "2.0.22",
      verifyBlueprint := {},
      baseDockerInstructions := baseDockerInstructions.value.dropRight(2)
    )
