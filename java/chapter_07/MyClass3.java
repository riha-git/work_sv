package Pac1;

public class MyClass3
{
	public static void main(String[] args)
	{
		// public がついているクラスは、
		// 全クラスからアクセス可能
		MyClass1 my1 = new MyClass1();

		// なにもついていないクラスは、
		// 同一パッケージ内からアクセス可能
		MyClass2 my2 = new MyClass2();
	}
}
