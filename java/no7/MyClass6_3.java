package Pac4_2;

// MyClass6_1に違うパッケージからアクセス
public class MyClass6_3
{
	MyClass6_1 my = new MyClass6_1();

	public static void main(String[] arg)
	{
		// フィールドにアクセス
		System.out.println("＜同じクラスからアクセス＞フィールドprotectedな変数:" + my.a);
		// メソッドにアクセス
		int b = add(2, 3);
		System.out.println("＜同じクラスからアクセス＞protectedなメソッド:" + my.b);
	}
}
	

