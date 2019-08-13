package Pac6_1;

// クラス内部でのみアクセス可
public class MyClass8_1
{
        private int a = 10;

        private int add(int x)
        {
                // privateな変数にアクセス
                int a = this.a;
                return (x + a);
        }

        public int minus(int x)
        {
                // privateなメソッドにアクセス
                int a = add(x);
                int y = 100;
                return (y - a);
        }
}
