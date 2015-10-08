

import java.net.URI

import org.ansj.app.keyword.KeyWordComputer
import org.ansj.splitWord.analysis.{NlpAnalysis, ToAnalysis}
import org.apache.hadoop.conf._
import org.apache.hadoop.fs._
import org.apache.hadoop.fs.Path._
import org.apache.hadoop.io.{Text, LongWritable}
import org.apache.hadoop.mapred.TextInputFormat
import org.apache.spark.{SparkContext, SparkConf}

import scala.io.Source

/**
 * Created by yyljl_000 on 2015/10/6.
 */
object testAnsj {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("wordcount").setMaster("spark://10.211.55.101:7077")
    val spark = new SparkContext(conf)
    val file = spark.textFile("hdfs://10.211.55.101:8020/data/test.txt")
    val data1 = file.map(line => line.split(" "));//map是一对一
    val data2 = file.flatMap(line => line.split(" "));//flatMap是一对多
    println(data2)
  }
}
