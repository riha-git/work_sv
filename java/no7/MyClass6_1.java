package Pac4_1;
//
public class MyClass6_1
{
	// 同じクラス、同じパッケージ、サブクラスのみアクセス可能
	// フィールド
	protected int a;

	// メソッド
	protected int add(int x, int y)
	{
		return x + y;
	}

	protected void access()
	{
		int b = 1;
		int c = add(this.a, b);
		System.out.println(c);
	}

}
	

