import java.util.List;
import java.util.ArrayList;

public class NotBeanSample2
{
        public static void main(String[] args)
        {
                List<String> nameList = new ArrayList<String>();
                List<String> furiganaList = new ArrayList<String>();
                List<Integer> ageList = new ArrayList<Integer>();

                nameList.add("佐藤");
                furiganaList.add("サトウ");
                ageList.add(19);

                nameList.add("伊藤");
                furiganaList.add("イトウ");
                ageList.add(30);

                nameList.add("鈴木");
                furiganaList.add("スズキ");
                ageList.add(25);

                for(int i = 0; i < nameList.size(); i++)
                {
                        System.out.println(nameList.get(i));
                        System.out.println(furiganaList.get(i));
                        System.out.println(ageList.get(i));
                }
        }
}
