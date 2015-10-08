import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by yyljl_000 on 2015/10/7.
 */
public class testHdfs {
    public static void main(String[] args) {
        FileSystem fs = null;
        try {
            fs = FileSystem.get(new URI("hdfs://10.211.55.101:8020"), new Configuration(), "root");
            Boolean out = fs.delete(new Path("/news-三句话读懂习近平的家国情怀.txt"), false);
            fs.delete(new Path("/news-三句话读懂习近平的家国情怀.txt"), false);
            fs.delete(new Path("/news-中国老人被指在日本碰瓷 日方就通告错误道歉.txt"), false);
            fs.delete(new Path("/news-中国首家管家学校学员毕业 年收入至少3万英镑.txt"), false);
            fs.delete(new Path("/news-习主席访美打造中美国际合作新亮点.txt"), false);
            fs.delete(new Path("/news-今日话题历史版_腾讯网.txt"), false);
            fs.delete(new Path("/news-出口负增长都是人民币惹的祸？_腾讯财经_腾讯网.txt"), false);
            fs.delete(new Path("/news-刘亦菲宋承宪：将加分恩爱秀酝酿成内伤_娱乐观_腾讯娱乐.txt"), false);
            fs.delete(new Path("/news-刘仲敬：秩序是文明的关键词_文化_腾讯网.txt"), false);
            fs.delete(new Path("/news-北京兰博基尼司机连撞8车弃车逃逸 已被警方控制.txt"), false);
            fs.delete(new Path("/news-北京6家机构入选首批养老工程试点_频道_腾讯网.txt"), false);
            fs.delete(new Path("/news-名医堂第118期：关注脊椎健康 预防比治疗更重要_健康频道_腾讯网.txt"), false);
            fs.delete(new Path("/news-名医堂第120期：名医堂：打一场漂亮的面部色斑“狙击战”_健康频道_腾讯网.txt"), false);
            fs.delete(new Path("/news-名医堂第121期：名医堂：淋巴瘤患病年轻化 早期筛查很重要_健康频道_腾讯网.txt"), false);
            fs.delete(new Path("/news-国民党将召开全代会讨论是否废止洪秀柱参选.txt"), false);
            fs.delete(new Path("/news-外国摄影师镜头中的朝鲜女性：传统和时尚交融.txt"), false);
            fs.delete(new Path("/news-媒体：面对TPP怎么办 连横破合纵.txt"), false);
            fs.delete(new Path("/news-安倍称期待中国加入TPP 有益亚太地区稳定.txt"), false);
            fs.delete(new Path("/news-屠呦呦旧居被改造成高档商品房 标价1.5亿元.txt"), false);
            fs.delete(new Path("/news-巴西监狱暴动 上千犯人打砸劫持人质(图).txt"), false);
            fs.delete(new Path("/news-广西交警微信开展农村交通安全管理 吸引大批农民入群_频道_腾讯网.txt"), false);
            fs.delete(new Path("/news-张者：知识分子的挣扎与突围_文化_腾讯网.txt"), false);
            fs.delete(new Path("/news-徐峥，选择和观众站在一起的学习型导演_娱乐观_腾讯娱乐.txt"), false);
            fs.delete(new Path("/news-斯诺登称愿意有条件回美国坐牢 美方尚未回应.txt"), false);
            fs.delete(new Path("/news-新闻中心_腾讯网.txt"), false);
            fs.delete(new Path("/news-日加科学家获物理学诺奖 成果挑战杨振宁理论.txt"), false);
            fs.delete(new Path("/news-日本及加拿大学者共获2015年诺贝尔物理奖.txt"), false);
            fs.delete(new Path("/news-桃花源董事会及理事会成立大会_公益_腾讯网.txt"), false);
            fs.delete(new Path("/news-汇率贬值会带来房价下跌吗？_腾讯财经_腾讯网.txt"), false);
            fs.delete(new Path("/news-河南女生被同学围殴扇耳光 打人女生边笑边爆粗.txt"), false);
            fs.delete(new Path("/news-洪秀柱表达参选决心 不会接受条件交换.txt"), false);
            fs.delete(new Path("/news-浙江温州试点业委会具法人资格 首次控告开发商.txt"), false);
            fs.delete(new Path("/news-湖北开往上海大巴在安徽霍山坠桥 致7死31伤.txt"), false);
            fs.delete(new Path("/news-湖南将合并农业三项补贴 着重补贴耕地地力保护_频道_腾讯网.txt"), false);
            fs.delete(new Path("/news-湘赣边区域合作交流会第二次联席会推22大项目_频道_腾讯网.txt"), false);
            fs.delete(new Path("/news-澳门“情趣馆”尺度大开 创意3D画展少儿不宜.txt"), false);
            fs.delete(new Path("/news-看出来哪点独家了吗？_腾讯时尚.txt"), false);
            fs.delete(new Path("/news-组图：俄军在叙利亚低调部署“无形利剑”_新闻_腾讯网.txt"), false);
            fs.delete(new Path("/news-组图：男子全身脱“皮”似木乃伊.txt"), false);
            fs.delete(new Path("/news-给你100万闲钱，你该买个啥？_腾讯时尚.txt"), false);
            fs.delete(new Path("/news-美军承认误炸阿富汗医院：是为支持阿富汗政府军.txt"), false);
            fs.delete(new Path("/news-美国瑞典等3名科学家因DNA研究获诺贝尔化学奖.txt"), false);
            fs.delete(new Path("/news-老人跪着吊死在小区树上 儿子被围观者扔鸡蛋.txt"), false);
            fs.delete(new Path("/news-腾讯客服-产品专区.txt"), false);
            fs.delete(new Path("/news-英国价值2亿元古董名车比赛中被撞毁.txt"), false);
            fs.delete(new Path("/news-记者暗访实拍：青岛旅游打出租 中途遭倒卖.txt"), false);
            fs.delete(new Path("/news-诺奖如何跳出“欧洲中心”这个坑_文化_腾讯网.txt"), false);
            if (out) {
                System.out.println("test success!");
            } else {
                System.out.println("test false!");
            }
            FileStatus[] hadfiles = fs.listStatus(new Path("/"));
            for (FileStatus fss : hadfiles) {
                System.out.println(fss.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }
}
