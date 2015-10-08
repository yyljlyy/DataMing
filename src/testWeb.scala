import cn.edu.hfut.dmic.contentextractor.{News, ContentExtractor}
import cn.edu.hfut.dmic.webcollector.net.HttpRequest

/**
 * Created by yyljl_000 on 2015/10/7.
 */
object testWeb {
  def main(args: Array[String]) {
      val url = "http://news.qq.com/"
      print(getUrls(url));
  }

  def getUrls(url:String): News ={
    val news:News = ContentExtractor.getNewsByUrl(url);

    return news
  }

  def getText(url:String): String = {
    val html:String = ContentExtractor.getContentByUrl(url);
    return html;
  }

}
