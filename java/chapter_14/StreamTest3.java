import java.util.Arrays;
import java.util.List;

public class StreamTest3
{
        public static void main(String[] args)
        {
                // String配列生成・代入
                final String[] data = {"shimizu", "tanaka", "sasaki", "suzuki"};
                
                // 配列をString型のListに変換
                List<String> list = Arrays.asList(data);

                // 「s」から始まる要素を抽出
                list.stream().filter(name -> name.startsWith("s")).forEach(System.out::println);
        }
}
