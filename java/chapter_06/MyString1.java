public class MyString1
{
	public static void main(String[] args)
	{
		//int型からString型へ変換
		int i = 100;
		System.out.println(String.valueOf(i));

		//long型からString型へ変換
		long l = 2147483648L;
		System.out.println(String.valueOf(l));

		//float型からString型へ変換
		float f = 3.14f;
		System.out.println(String.valueOf(f));

		//double型からString型へ変換
		double d = 3.14;
		System.out.println(String.valueOf(d));
	}
}
