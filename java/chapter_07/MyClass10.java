package Pac7;

public class MyClass10
{
        public static void main(String[] args)
        {
                MyClass9 my = new MyClass9();

                // public変数にアクセス
                int x = my.a;

                // protected変数にアクセス
                int y = my.b;

                // アクセス修飾子なし変数にアクセス
                int z = my.c;

                // private修飾子なし変数にアクセス
                // コンパイルエラー
                int w = my.d;
        }
}
