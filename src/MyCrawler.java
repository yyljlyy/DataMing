import cn.edu.hfut.dmic.contentextractor.ContentExtractor;
import cn.edu.hfut.dmic.webcollector.crawler.DeepCrawler;
import cn.edu.hfut.dmic.webcollector.model.Links;
import cn.edu.hfut.dmic.webcollector.model.Page;
import cn.edu.hfut.dmic.webcollector.util.RegexRule;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.jsoup.nodes.Document;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.net.URI;

public class MyCrawler extends DeepCrawler {

    RegexRule regexRule = new RegexRule();


    public MyCrawler(String crawlPath) {
        super(crawlPath);
        regexRule.addRule("http://.*.qq.com/.*");
        regexRule.addRule("-.*jpg.*");
    }

    @Override
    public Links visitAndGetNextLinks(Page page) {
        Document doc = page.getDoc();
        String title = doc.title();
        String url = page.getUrl();
        String content = null;
        try {
            content = ContentExtractor.getContentByUrl(url);
            if(content != null){
                System.out.println("URL:\n" + url + "\n  标题:\n" + title + "\n内容:\n" + content);
                String topic = "news-"+title;
                FileWriter fw = new FileWriter("D:\\data\\"+topic+".txt");
                fw.write(content);
                HadoopHdfs.upfile(topic);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Links nextLinks = new Links();
        nextLinks.addAllFromDocument(doc, regexRule);
        return nextLinks;
    }

    public static void main(String[] args) throws Exception {
        MyCrawler crawler = new MyCrawler("D:\\data");
        crawler.setThreads(50);
        crawler.addSeed("http://news.qq.com/");
        crawler.setResumable(false);
        crawler.setResumable(false);
        crawler.start(5);
    }

}