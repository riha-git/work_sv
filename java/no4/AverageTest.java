public class AverageTest
{
	public static void main(String[] args)
	{
		AverageTest aveTest = new AverageTest();
		int avr = aveTest.average(40, 80, 70); 
		System.out.println(avr);
	}

	// 平均値算出処理
	// private: 同一クラスからアクセス可能
	private int average(int firstargs, int secondargs, int thirdargs)
	{
		int avr = (firstargs + secondargs + thirdargs) / 3;
		return avr;
	}
}
