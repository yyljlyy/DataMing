import scala.math.random
import org.apache.spark.{SparkContext, SparkConf}

/**
 * Created by yyljl_000 on 2015/10/5.
 */
object testSpark {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("Spark Pi").setMaster("spark://10.211.55.101:7077")
    .setJars(List("D:\\yyljlyy\\DataMing\\out\\artifacts\\DataMing_jar\\DataMing.jar"))
    val spark = new SparkContext(conf)
    val slices = if (args.length > 0) args(0).toInt else 2
    val n = 100000 * slices
    val count = spark.parallelize(1 to n, slices).map { i =>
      val x = random * 2 - 1
      val y = random * 2 - 1
      if (x * x + y * y < 1) 1 else 0
    }.reduce(_ + _)
    println("Pi is roughly " + 4.0 * count / n)
    spark.stop()
  }
}
