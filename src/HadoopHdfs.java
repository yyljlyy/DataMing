import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by yyljl_000 on 2015/10/7.
 */
public class HadoopHdfs {

    public static void upfile(String topic) throws Exception {
        FileSystem fs = FileSystem.get(URI.create("hdfs://10.211.55.101:8020"), new Configuration(), "root");
        FileInputStream in = new FileInputStream("D:\\data\\"+topic+".txt");
        OutputStream out = fs.create(new Path("/"+topic+".txt"));
        IOUtils.copyBytes(in, out, 4096, true);
        System.out.println("test success!");
    }
}
