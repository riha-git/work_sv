import java.util.List;
import java.util.ArrayList;


public class BeanMondai1_2
{
        public static void main(String[] args)
        {
                List<InfoBean> infoList = new ArrayList<InfoBean>();
                InfoBean info = new InfoBean();

                info.setName("佐藤");
                info.setAddress("東京都練馬区");
                info.setJob("Javaプログラマ");
                info.setAge(19);
                infoList.add(info);

                info = new InfoBean();
                info.setName("伊藤");
                info.setAddress("東京都千代田区");
                info.setJob("PHPプログラマ");
                info.setAge(30);
                infoList.add(info);

                info = new InfoBean();
                info.setName("鈴木");
                info.setAddress("東京都墨田区");
                info.setJob("Javaプログラマ");
                info.setAge(25);
                infoList.add(info);

                info = new InfoBean();
                info.setName("山崎");
                info.setAddress("東京都千代田区");
                info.setJob("Javaプログラマ");
                info.setAge(20);
                infoList.add(info);


                for(InfoBean bn: infoList)
                {
                        System.out.println(
                                                bn.getName()
                                                + "\t"
                                                + bn.getAddress()
                                                + "\t"
                                                + bn.getJob()
                                                + "\t"
                                                + bn.getAge()
                                          );
                }
        }
}
                
