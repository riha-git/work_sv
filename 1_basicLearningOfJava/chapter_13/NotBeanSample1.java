import java.util.List;
import java.util.ArrayList;

public class NotBeanSample1
{
        public static void main(String[] args)
        {
                List<String> nameList = new ArrayList<String>();

                nameList.add("佐藤");
                nameList.add("伊藤");
                nameList.add("鈴木");

                for(String name: nameList)
                {
                        System.out.println(name);
                }
        }
}
