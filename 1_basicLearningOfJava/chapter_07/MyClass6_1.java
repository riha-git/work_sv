package Pac4_1;
//
public class MyClass6_1
{
	// 同じクラス、同じパッケージ、サブクラスのみアクセス可能
	// フィールド
	protected int a;

        protected int add(int x, int y)
        {
          int result = x + y;
          return result;
        }

	// メソッド
	protected void access()
	{
                int a = this.a;
		int b = 1;
		int c = add(a, b);
		System.out.println(c);
	}

}
	

