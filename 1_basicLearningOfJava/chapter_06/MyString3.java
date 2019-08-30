public class MyString3
{
	public static void main(String[] args)
	{
		String myS = "ABCDEF";
		//String myS = new String("ABCDEF");
		// 文字列の長さ
		System.out.println(myS.length());
		// BをDで置換
		System.out.println(myS.replace("B", "D"));
		// 文頭がABであるかどうか
		System.out.println(myS.startsWith("AB"));
		// 2番目を基点にBCで始まるかどうか
		System.out.println(myS.startsWith("BC", 1));
		// 3番目から文末までを取得
		System.out.println(myS.substring(2));
		// 3, 4番目の文字を取得
		System.out.println(myS.substring(2, 4));
		// 両端のスペースを削除
		myS = " ABC DEF ";
		System.out.println(myS.trim());
	}
}
