public class MyTest5 extends MyTest4
{
        MyTest5()
        {
                // 親のコンストラクタ呼び出し
                // super();

                // 自分の引数付きコンストラクタ呼び出し
                // 同じクラスの異なるコンストラクタを呼び出し可能
                this(5);

                // 親のメソッド呼び出し
                super.myMsg();

                // 自分のメソッド呼び出し
                this.myMsg();
        }

        MyTest5(int x)
        {
                System.out.println("MyTest5の引数ありコンストラクタ");
        }

        void myMsg()
        {
                System.out.println("MyTest5のmyMsgメソッド");
        }
}
