package Pac8;

// 別のパッケージのクラスをインポート
import Pac7.MyClass9;

public class MyClass11
{
        public static void main(String[] args)
        {
                MyClass9 my = new MyClass9();

                // public変数にアクセス
                int x = my.a;

                // protected変数にアクセス
                // コンパイルエラー
                int y = my.b;

                // アクセス修飾子なし変数にアクセス
                // コンパイルエラー
                int z = my.c;

                // private修飾子なし変数にアクセス
                // コンパイルエラー
                int w = my.d;
        }
}
