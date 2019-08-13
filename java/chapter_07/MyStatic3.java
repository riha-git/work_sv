public class MyStatic3
{
        public static void main(String[] args)
        {
                myTemp();
        }

        static void myTemp()
        {
                System.out.println("クラスメソッド");
        }

        // error
        /*
        void myTemp()
        {
                System.out.println("インスタンスメソッド");
        }
        */
}

