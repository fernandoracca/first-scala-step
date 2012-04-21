olvers ++= Seq(
        Classpaths.typesafeResolver,
        "sbt-idea-repo" at "http://mpeltonen.github.com/maven/",
        Resolver.url("sbt-plugin-releases", url("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)
)

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.0.0")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.0.0")

addSbtPlugin("com.eed3si9n" % "sbt-man" % "0.1.0")
