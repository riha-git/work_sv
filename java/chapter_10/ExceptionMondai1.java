public class ExceptionMondai1
{
        public static void main(String[] args)
        {
                try
                {
                        int num = Integer.parseInt(args[0]);

                        // 上の処理が例外エラーの場合、下のtryスコープ中の処理は実行されない
                        int kekka = 10 * num;
                        System.out.println(kekka);
                }
                catch(NumberFormatException e)
                {

                        System.out.println("例外発生");
                }
        }
}
