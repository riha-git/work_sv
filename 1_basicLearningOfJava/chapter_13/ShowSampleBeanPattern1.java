import java.util.List;
import java.util.ArrayList;

public class ShowSampleBeanPattern1
{
        public static void main(String[] args)
        {
                List<SampleBean> infoList = new ArrayList<SampleBean>();

                SampleBean bean = new SampleBean();
                bean.setName("佐藤");
                bean.setFurigana("サトウ");
                bean.setAge(19);
                infoList.add(bean);

                bean = new SampleBean();
                bean.setName("伊藤");
                bean.setFurigana("イトウ");
                bean.setAge(30);
                infoList.add(bean);

                bean = new SampleBean();
                bean.setName("鈴木");
                bean.setFurigana("スズキ");
                bean.setAge(25);
                infoList.add(bean);

                for(SampleBean bn: infoList)
                {
                        System.out.println("名前: " + bn.getName());
                        System.out.println("ふりがな: " + bn.getFurigana());
                        System.out.println("年齢: " + bn.getAge());
                }
        }
}
