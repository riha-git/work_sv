public class MyClass
{
	public static void main(String[] args)
	{
		MySub mysub = new MySub();

		// 継承したフィールドにアクセス
		System.out.println(mysub.x);

		// 継承したメソッドにアクセス
		System.out.println(mysub.getX());

		// サブクラスで定義したフィールドにアクセス
		System.out.println(mysub.y);

		// サブクラスで定義したメソッドにアクセス
		System.out.println(mysub.getY());
	}
}
