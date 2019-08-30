public class MyTest3 extends MyTest2
{
        public MyTest3()
        {
                // MyTest2の引数なしコンストラクタ呼び出し
                //super();      

                // MyTest2の引数付きコンストラクタ呼び出し
                super(3);      

                System.out.println("MyTest3のコンストラクタ");
        }
}
