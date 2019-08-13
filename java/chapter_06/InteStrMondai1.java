public class InteStrMondai1
{
	public static void main(String[] args)
	{
		// Q1
		// int型の250を内部に持つIntegerクラスを生成し、
		// Integer型の参照変数temp1に代入
		
		//java9~非推奨
		//Integer q1 = new Integer(250);
		//Integwe temp1 = q1;
		Integer q1 = Integer.valueOf(250);
		System.out.println("Q1: " + q1);

		// Q2
		// IntegerクラスのparseIntメソッドを利用して、
		// String型の"20"をint型に変換
		int q2 = Integer.parseInt("20");
		System.out.println("Q2: " + q2);

		// Q3
		// IntegerクラスのparseIntメソッドを利用して、
		// 16進数表記のFFをint型(10進数)に変換
		int q3 = Integer.parseInt("FF", 16);
		System.out.println("Q3: " + q3);

		// Q4
		// StringクラスのvalueOfメソッドを使用して、
		// int型の250をString型に変換
		String q4 = String.valueOf(250);
		System.out.println("Q3: " + q4);

		// Q5
		// Stringクラスのequalsメソッドを使用して、
		// 2つの文字列が等しいか否か判定
		String temp1 = "おはよう";
		String temp2 = "おはよう";
		if(temp1.equals(temp2))
		{
			// true
			System.out.println("Q5: " + "同じ");
		}
		else
		{
			// false
			System.out.println("Q5: " + "違う");
		}

		// Q6
		// StringクラスのindexOfメソッドを使用して、
		// 文字列の中に"@"が含まれているか判定
		String mail = "test@test.co.jp";
		if(mail.indexOf("@") != -1)
		{
			// true
			System.out.println("Q6: " + "含む");
		}
		else
		{
			// false
			System.out.println("Q6: " + "含まない");
		}

		// Q7
		// Stringクラスのsubstringメソッドを使用して、
		// 文字列から月の値を取得
		String thedate = "2010.06.11.";
		System.out.println("Q7: " + thedate.substring(0,4));

		// Q8
		// Stringクラスのsplitメソッドを使用して、
		// "aa"を区切り文字として分割
		String animal = "わんaaにゃーaaこけこっこーaaブヒaaモーaヒヒ―ン";
		String str[] = animal.split("aa");
		System.out.println("Q8: ");
		for(String txt: str)
		{
			System.out.println(txt);
		}
	}
}
