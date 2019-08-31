public class Mondai2
{
        public static void main(String[] args)
        {
                int seiseki[] = {40, 20, 75, 100, 39};
                int pass = 0;
                int fail = 0;
                final int BORDER = 40;
                for(int data: seiseki)
                {
                        if(data >= BORDER)
                        {
                                pass++;
                        }
                        else
                        {
                                fail++;
                        }
                }

                System.out.println("合格: " + pass + "人");
                System.out.println("不合格: " + fail + "人");
        }
}
