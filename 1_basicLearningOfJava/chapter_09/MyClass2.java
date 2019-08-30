public class MyClass2
{
        void myTemp()
        {
        }

        // 戻り値のみ違うメソッドはオーバーロードできないためerror
        int myTemp()
        {
                return 10;
        }
}
