public class MyStatic2
{
        public static void main(String[] args)
        {
                _MyStatic2 m = new _MyStatic2();
                _MyStatic2 y = new _MyStatic2();
        
                m.a = 10;

                // static変数はインスタンス生成してもそのインスタンスに変数が生成されない
                m.myTemp();
                y.a = 5;

                // static変数はインスタンス生成してもそのインスタンスに変数が生成されない
                m.myTemp();
                _MyStatic2.a = 0;

                // static変数はインスタンス生成してもそのインスタンスに変数が生成されない
                m.myTemp();
        }
}

class _MyStatic2
{
        static int a;
        static void myTemp()
        {
                System.out.println(a);
        }
}
