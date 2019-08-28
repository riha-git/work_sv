import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest2
{
        public static void main(String[] args)
        {
                // String配列生成・代入
                final String[] data = {"shimizu", "tanaka", "sasaki", "suzuki"};
                
                // 配列をString型のListに変換
                List<String> list = Arrays.asList(data);

                // Listをもとに、Streamを生成
                Stream<String> stream = list.stream();

                // 「s」から始まる要素を抽出
                Stream<String> nameStream = stream.filter((String name) ->
                {
                        return name.startsWith("s");
                });

                // 結果を格納するList
                List<String> outputList = nameStream.collect(Collectors.toList());

                for(String str: outputList)
                {
                        System.out.println(str);
                }
        }
}
