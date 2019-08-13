package Pac5_1;

// MyClass7_1と同じパッケージ
// MyClass7_1のフィールドとメソッドにアクセス可能
public class MyClass7_2
{
        public static void main(String[] args)
        {
                MyClass7_1 my = new MyClass7_1();
                my.a = 1;
                my.b = 3;
                my.add();
        }
}
