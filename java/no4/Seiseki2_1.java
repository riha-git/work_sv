public class Seiseki2_1
{
	// フィールド
	static String name;

	// メソッド
	void setName(String tName)
	{
		name = tName;
	}

	static String getName()
	{
		return name;
	}

	static int printGoukei(int kokugo, int sugaku, int eigo)
	{
		int sum = kokugo + sugaku + eigo;
		return sum;
	}

}
