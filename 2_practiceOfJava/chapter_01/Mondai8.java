public class Mondai8
{
        public static void main(String[] args)
        {
                // 変数の宣言、値の代入
                String triangle = "△";
                String blank = " ";
                int height = 10;
                for (int i = 0; i < height; i++)
                {
                        for (int j = 1; j < height - i; j++)
                        {
                                System.out.print(blank);
                        }
                        for (int j = 0; j < i * 2 + 1; j++)
                        {
                                System.out.print(triangle);
                        }
                        System.out.println();
                }
        }
}
