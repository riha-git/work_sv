package Pac4_1;
//import Pac4_1.MyClass6_1;

// MyClass6_1に同じパッケージからアクセス
public class MyClass6_2
{
	public static void main(String[] arg)
	{
		MyClass6_1 my = new MyClass6_1();

		// フィールドにアクセス
		my.a = 1;
		// メソッドにアクセス
		my.access();
	}
}
