package Pac4_2;
import Pac4_1.MyClass6_1;

// MyClass6_1に別のパッケージからアクセス
// コンパイルエラー
public class MyClass6_3
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
