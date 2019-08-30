import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTest1
{
        public static void main(String[] args)
        {
                // String配列生成・代入
                final String[] data = {"shimizu", "tanaka", "sasaki", "suzuki"};
                
                // 配列をString型のListに変換
                List<String> list = Arrays.asList(data);

                // 結果を格納するList
                List<String> outputList = new ArrayList<String>();

                // 「s」から始まる要素だけ結果に格納
                for(String name: list)
                {
                        if(name.startsWith("s"))
                        {
                                outputList.add(name);
                        }
                }

                for(String str: outputList)
                {
                        System.out.println(str);
                }
        }
}
