public class MyInteger2
{
	public static void main(String[] args)
	{
		// Integerクラスのインスタンスメソッド

		Integer myI1 = new Integer(100);
		Integer myI2 = new Integer(100);

		// 参照型からプリミティブ型への変換
		int i = myI1.intValue();
		long l = myI1.longValue();
		float f = myI1.floatValue();
		double d = myI1.doubleValue();
		String st = myI1.toString();

		// 非推奨のためコンパイルできなかった
		/*--------------------------------------------------------------------------
		 >javac -Xlint:deprecation -encoding UTF-8 MyInteger2.java
		 MyInteger2.java:7: 警告:[deprecation] IntegerのInteger(int)は推奨されません
                 Integer myI1 = new Integer(100);
                               ^
		 MyInteger2.java:8: 警告:[deprecation] IntegerのInteger(int)は推奨されません
                 Integer myI2 = new Integer(100);

		 引用
		 Integer(int value)
			非推奨。 
			このコンストラクタを使用することはめったに適切ではありません。 
			静的ファクトリvalueOf(int)は、より良い選択肢です。
			スペースと時間のパフォーマンスが大幅に向上する可能性が高いためです。
		 Integer(String s)	
			非推奨。 
			このコンストラクタを使用することはめったに適切ではありません。 
			文字列をintプリミティブに変換するにはparseInt(String)を使用し、
			文字列をIntegerオブジェクトに変換するにはvalueOf(String)を使用します。
		--------------------------------------------------------------------------*/
	}
}
