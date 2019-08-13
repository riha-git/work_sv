public class MyInteger1
{
	public static void main(String[] args)
	{

		// Integerクラスの静的メソッド

		// memo
		// 文字列（数字）を数値に変換
		int n = 10;
		String str = "20";
		int m = Integer.parseInt(str);
		//int m = str; // error
		int sum = n + m;
		System.out.println(sum);

		// imitate
		// 文字列（数字）を数値（整数）に変換
		System.out.println(Integer.parseInt("20"));

		// 16進数から10進数に変換
		System.out.println(Integer.parseInt("1E", 16));

		// 文字列（数字）をIntegerに変換
		// 文字列をIntegerクラスのオブジェクトに変換
		System.out.println(Integer.valueOf("90"));

		// 文字列を16進数から10進数に変換
		System.out.println(Integer.valueOf("64", 16));
	}
}
