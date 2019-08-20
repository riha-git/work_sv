public class MyStatic3
{
        public static void main(String[] args)
        {
                MyStatic3 i = new MyStatic3();

                // インスタンスメソッド呼び出し
                i.myTemp1();

                // クラスメソッド呼び出し
                // クラス名.としなくても、同じクラス内であれば直接呼べる
                myTemp2();
        }

        void myTemp1()
        {
                System.out.println("インスタンスメソッド");
        }

        static void myTemp2()
        {
                System.out.println("クラスメソッド");
        }
}
