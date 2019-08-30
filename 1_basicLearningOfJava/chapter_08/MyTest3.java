public class MyTest3 extends MyTest2
{
        MyTest3()
        {
                // MyTest2には、引数なしのコンストラクタが存在ない
                // -> MyTest2では、親クラスのMyTest1のコンストラクタが暗黙的に呼び出されている
                // MyTest2の引数付きコンストラクタを明示的に呼び出し
                super(3);
                System.out.println("MyTest3のコンストラクタ");
        }
}
