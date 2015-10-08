import java.io.{FileInputStream, OutputStream}
import java.net.URI

import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.{FileSystem, Path}
import org.apache.hadoop.io.IOUtils

/**
 * Created by yyljl_000 on 2015/10/8.
 */
object HdfsTest {
  def main(args: Array[String]) {
    val fs: FileSystem = FileSystem.get(URI.create("hdfs://10.211.55.101:8020"), new Configuration, "root")
    fs.mkdirs(new Path("/data"))
    fs.copyFromLocalFile(new Path("D:\\data\\test.txt"),new Path("/data/test.txt"))
    println("test success!")
  }
}
