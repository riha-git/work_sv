public class MyTest2 extends MyTest1
{
        // 引数なしコンストラクタ
        public MyTest2()
        {
                // 暗黙的にsuper()が挿入される
                // super();
                System.out.println("MyTest2の引数なしコンストラクタ");
        }

        // 引数付きコンストラクタ
        public MyTest2(int x)
        {
                // 暗黙的にsuper()が挿入される
                // super();
                System.out.println("MyTest2の引数つきコンストラクタ");
        }
}
