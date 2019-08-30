public class MyTest5 extends MyTest4
{
        public MyTest5()
        {
                this(3);
                super.myMsg();
                this.myMsg();
                this.myMsg(0);
        }

        public MyTest5(int x)
        {
                System.out.println("MyTest5の引数ありコンストラクタ");
        }

        @Override
        public void myMsg()
        {
                System.out.println("MyTest5の引数なしメソッド");
        }

        public void myMsg(int x)
        {
                System.out.println("MyTest5の引数ありメソッド");
        }
}
