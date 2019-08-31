public class Mondai4
{
        public static void main(String[] args)
        {
                int kakezan[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
                for(int sahen = kakezan.length; sahen > 0; sahen--)
                {
                        for(int uhen: kakezan)
                        {
                               System.out.print((sahen * uhen)); 
                               System.out.print(" ");
                        }
                        System.out.println();
                }
        }
}
