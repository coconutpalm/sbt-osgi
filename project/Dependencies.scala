import sbt._

object Library {

  // Versions
  val bndVersion = "3.2.0"
  val specs2Version = "1.14"

  // Libraries
  val bndLib = "biz.aQute.bnd" % "biz.aQute.bndlib" % bndVersion
  val specs2 = "org.specs2" %% "specs2" % specs2Version
}

object Dependencies {

  import Library._

  val sbtOsgi = List(
    bndLib,
    specs2  % "test"
  )
}
