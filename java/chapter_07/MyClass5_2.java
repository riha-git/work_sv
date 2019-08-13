package Pac3_2;
import Pac3_1.MyClass5_1;

public class MyClass5_2
{
	public static void main(String[] args)
	{
		// Pac3_1.MyClass5_1のフィールド変数にアクセス
		MyClass5_1 my = new MyClass5_1();
		System.out.println(my.a);
	
		// Pac3_1.MyClass5_1のメソッドにアクセス
		my.method(2, 3);
	}
}
