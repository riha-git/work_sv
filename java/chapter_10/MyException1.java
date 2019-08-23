public class MyException1
{
        public static void main(String[] args)
        {
                int a, b, c;
                a = 3;
                b = 0;

                try
                {
                        // 例外が発生する可能性のある処理をtryで括る
                        // 例外が発生したらcatchブロックを探し、
                        // 無ければプログラムが強制終了され、メッセージが表示される
                        c = a/b;
                }
                catch(ArithmeticException e)
                {
                        System.out.println("例外発生");
                        return; // returnしないと下の処理が実行される
                }
                finally
                {
                        // 例外発生しても実行される
                        System.out.println("finally");
                }
                System.out.println("正常終了");
        }
}
