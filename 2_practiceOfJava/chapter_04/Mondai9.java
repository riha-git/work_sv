package usesclass;
public class Mondai9
{
        public static void main(String[] args)
        {
                String str = "abcdabcdeababcdabcd";
                String target = "a";

                // 検索を開始する位置
                int fromIndex = 0;
                // 検索で対象文字列が見つかった位置
                int index = -1;
                // 出現回数
                int sum = 0;

                while((index = str.indexOf(target, fromIndex)) != -1)
                {
                        sum++;
                        fromIndex = index + 1;
                        System.out.println( (index + 1) + "文字目に「" + target + "」が出現");
                }
                
                System.out.println();
                System.out.println("「" + target + "」の出現回数:" + sum + "回");
        }
}
