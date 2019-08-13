package Pac2;
import Pac1.*;

public class MyClass4
{
	public static void main(String[] args)
	{
		MyClass1 my1 = new MyClass1();
		// アクセス修飾子なしのクラスは、同一パッケージ内からアクセス可能
		// したがって、本パッケージのクラスからはアクセスできない
		//MyClass2 my2 = new MyClass2();
		/*
		 * MyClass4.java:9: エラー: シンボルを見つけられません
		 * MyClass2 my2 = new MyClass2();
		 * 		  ^
		 * シンボル:   クラス MyClass2
		 * 場所: クラス MyClass4
		 * MyClass4.java:9: エラー: シンボルを見つけられません
		 * MyClass2 my2 = new MyClass2();
		 * 		      ^
		 * シンボル:   クラス MyClass2
		 * 場所: クラス MyClass4
		 * エラー2個
		 */
	}
}
