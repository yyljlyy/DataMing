import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.javascript.configuration.WebBrowser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by yyljl_000 on 2015/10/9.
 */
public class spider {

    public static void main(String[] args) throws IOException {
        String url = "http://www.iteye.com/";
        List<Url> list = getUrl();
        for (Url urls : list) {
            System.out.println("标题:" + urls.getTitle());
            System.out.println("内容:" + getContent(urls.getUrl()));
            System.out.println("地址:" + urls.getUrl());
        }
    }

    public static String getContent(String url) throws IOException {
        Document doc = Jsoup.connect(url).get();
        Elements ps = doc.getElementsByClass("news_content");
        String context = "";
        for (Element p : ps) {
            context += p.text();
        }
        return context;
    }

    public static List<Url> getUrl() throws IOException {
        List<Url> list = new ArrayList<Url>();
        for (int j = 0; j < 11; j++) {
            Document doc = Jsoup.connect("http://news.csdn.net/news/" + j).get();
            Elements linkStrs = doc.getElementsByClass("unit").select("h1");
            for (Element linkStr : linkStrs) {
                Url urls = new Url();
                String url = linkStr.getElementsByTag("a").attr("abs:href");
                String title = linkStr.getElementsByTag("a").text();
                urls.setUrl(url);
                urls.setTitle(title);
                list.add(urls);
            }
        }
        return list;
    }

}
