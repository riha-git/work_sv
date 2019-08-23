public class MyException3
{
        public static void main(String[] args)
        {
                int a = 0;

                if(a == 0)
                {
                        try
                        {
                                // 意図的な例外発生処理
                                // 独自例外クラス呼び出し
                                throw new MyErrException();
                        }
                        catch(MyErrException e)
                        {
                                System.out.println("MyException発生");
                        }
                }
        }
}
