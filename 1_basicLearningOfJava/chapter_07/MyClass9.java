package Pac7;

public class MyClass9
{
        // 他パッケージからもアクセス可
        public int a;

        // 同じクラス、同じパッケージ、サブクラスのみアクセス可
        protected int b;

        // 同じクラス、同じパッケージのみアクセス可
        int c;

        // 同じクラスのみアクセス可
        private int d;

        public void testAccess()
        {
                // 全てのフィールドは本クラスからアクセス可
                a = 0;
                b = 0;
                c = 0;
                d = 0;
        }
}
