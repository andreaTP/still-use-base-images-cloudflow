lazy val helloWorld =  (project in file("."))
    .enablePlugins(CloudflowApplicationPlugin, CloudflowFlinkPlugin)
    .settings(
      scalaVersion := "2.12.13",
      name := "hello-world",
      version := "0.0.1",
      cloudflowAkkaBaseImage := Some("flink-runtime:2.0.22")
    )

ThisBuild / cloudflowDockerRegistry := sys.env.get("DOCKER_REGISTRY")
ThisBuild / cloudflowDockerRepository := sys.env.get("DOCKER_REPOSITORY")
