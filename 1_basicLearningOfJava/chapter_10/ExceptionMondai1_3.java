public class ExceptionMondai1_3
{
        public static void main(String[] args)
        {
                try
                {
                        int num = Integer.parseInt(args[0]);
                        if(num >= 1000)
                        {
                                throw new MyErrException1();
                        }

                        // 上の処理が例外エラーの場合、下のtryスコープ中の処理は実行されない
                        int kekka = 10 * num;
                        System.out.println(kekka);
                }

                // int型変換の例外処理
                catch(NumberFormatException e)
                {
                        System.out.println("数字以外の文字列です、数字を入力してください");
                }

                // null時の例外処理
                catch(java.lang.ArrayIndexOutOfBoundsException e)
                {
                        System.out.println("nullです、数字を入力してください");
                }

                // 1000以上の数字入力時の例外処理
                catch(MyErrException1 e)
                {

                        System.out.println("1000未満の数字を入力してください");
                }
        }
}
