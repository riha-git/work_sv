public class MyTest2 extends MyTest1
{
        MyTest2(int x)
        {
                // 暗黙的にsuper()が挿入され、MyTest1の引数なしコンストラクタが呼び出される
                // super();
                System.out.println("MyTest2の引数付きコンストラクタ");
        }
}
