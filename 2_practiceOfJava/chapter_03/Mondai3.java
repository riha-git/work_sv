public class Mondai3
{
        public static void main(String[] args)
        {
                int seiseki[] = {40, 20, 75, 100, 39};
                String testUsers[] = {"田中", "佐藤", "中沢", "吉本", "品川"};
                int pass = 0;
                int fail = 0;
                final int BORDER = 40;
                for(int i = 0; i < seiseki.length; i++)
                {
                        if(seiseki[i] >= BORDER)
                        {
                                System.out.println(testUsers[i] + "さんは" + seiseki[i] + "で合格です。");
                                pass++;
                        }
                        else
                        {
                                System.out.println(testUsers[i] + "さんは" + seiseki[i] + "で不合格です。");
                                fail++;
                        }
                }

                System.out.println();
                System.out.println("合格: " + pass + "人");
                System.out.println("不合格: " + fail + "人");
        }
}
