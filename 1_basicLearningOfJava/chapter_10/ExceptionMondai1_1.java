public class ExceptionMondai1_1
{
        public static void main(String[] args)
        {
                int num = 0;
                int kekka = 10 * num;
                try
                {
                        num = Integer.parseInt(args[0]);
                }
                catch(NumberFormatException e)
                {

                        System.out.println("例外発生");
                        return;
                }
                System.out.println(kekka);
        }
}
