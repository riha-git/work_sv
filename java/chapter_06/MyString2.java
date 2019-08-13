public class MyString2
{
	public static void main(String[] args)
	{

		String myS = "ABCDEF";

		// 2文字目を返す
		System.out.println(myS.charAt(1));
		// mySを"ABCDEG"と辞書式に比較
		System.out.println(myS.compareTo("ABCDEG"));
		// "ABCDEG"をmySと辞書式に比較
		System.out.println("ABCDEG".compareTo(myS));
		// mySを"abcdef"と比較
		System.out.println(myS.equals("abcdef"));
		// 改行
		System.out.println("");
		// mySに"AABBCCDDEEFF"を代入
		myS = "AABBCCDDEEFF";
		// 文頭から"C"が現れる位置番号
		System.out.println(myS.indexOf('C'));
		// 5番目から"C"が現れる位置番号
		System.out.println(myS.indexOf('C', 5));
		// 文頭から"CD"が現れる位置番号
		System.out.println(myS.indexOf("CD"));
		// 6番目から"CD"が現れる位置番号
		System.out.println(myS.indexOf("CD", 6));
		// 文末から"C"が現れる位置番号
		System.out.println(myS.lastIndexOf('C'));
		// 4番目から文頭に向かって"C"が現れる位置番号
		System.out.println(myS.lastIndexOf('C', 4));
		// 文末から"CD"が現れる位置番号
		System.out.println(myS.lastIndexOf("CD"));
		// 6番目から文頭に向かって"CD"が現れる位置番号
		System.out.println(myS.lastIndexOf("CD", 6));
		// 改行
		System.out.println("");
		// mySに"りんご, もも, みかん, なし, すいか, いちご"を代入
		myS = "りんご,もも,みかん,なし,すいか,いちご";
		// mySの","を区切り文字として分割
		String[] str = myS.split(",");
		for(String val: str)
		{
			System.out.println(val);
		}
	}
}
