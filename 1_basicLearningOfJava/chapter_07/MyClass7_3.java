package Pac5_2;
import Pac5_1.*;

// MyClass7_1と別のパッケージ
// MyClass7_1のフィールドとメソッドにアクセス不可
// コンパイルエラー
public class MyClass7_3
{
        public static void main(String[] args)
        {
                MyClass7_1 my = new MyClass7_1();
                my.a = 1;
                my.b = 3;
                my.add();
        }
}
