public class MySub1 extends MySuper1
{
        int x = 1;

        void print()
        {
                // 親クラスのクラス変数
                System.out.println(super.x);

                // 子クラス（自身）のクラス変数
                System.out.println(this.x);

                // 親クラスのクラスメソッド
                super.print();
        }
}
