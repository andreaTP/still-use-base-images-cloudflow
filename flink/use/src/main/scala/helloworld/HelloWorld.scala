package helloworld

import cloudflow.flink.FlinkStreamlet
import org.apache.flink.streaming.api.scala._
import cloudflow.streamlets.{StreamletShape, StringConfigParameter}
import cloudflow.flink._

class HelloWorldShape extends FlinkStreamlet {
  val shape = StreamletShape.empty

  def createLogic() = new FlinkStreamletLogic {
    override def buildExecutionGraph: Unit = {
      println("hello-world")
    }
  }

}
