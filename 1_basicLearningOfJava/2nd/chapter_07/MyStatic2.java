public class MyStatic2
{
        public static void main(String[] args)
        {
                // クラス変数の仕様確認
                // 常にクラス内の変数が使用される
                _MyStatic2 m = new _MyStatic2();
                _MyStatic2 y = new _MyStatic2();

                m.a = 10;
                y.a = 5;
        
                m.MyTemp();
        }
}

class _MyStatic2
{
        static int a;
        static void MyTemp()
        {
                System.out.println(a);
        }
}
