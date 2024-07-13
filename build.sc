import mill._
import mill.scalalib._

trait MainModule extends ScalaModule {
  def scalaVersion = "3.4.2"
}

object hello3 extends MainModule {
  object test extends ScalaTests with TestModule.Munit {
    def ivyDeps = Agg(
      ivy"org.scalameta::munit::1.0.0"
    )
  }
}

