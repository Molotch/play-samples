enablePlugins(BuildInfoPlugin)
val playGrpcV = "0.8.1"
buildInfoKeys := Seq[BuildInfoKey]("playGrpcVersion" -> playGrpcV)
buildInfoPackage := "play.scala.grpc.sample"


addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.2")

// #grpc_sbt_plugin
// project/plugins.sbt
addSbtPlugin("com.lightbend.akka.grpc" %% "sbt-akka-grpc" % "0.7.3")
libraryDependencies += "com.lightbend.play" %% "play-grpc-generators" % playGrpcV
// #grpc_sbt_plugin
