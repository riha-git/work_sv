public class Seiseki2
{
	// フィールド
	String name;

	// メソッド
	void setName(String tName)
	{
		name = tName;
	}

	String getName()
	{
		return name;
	}

	int printGoukei(int kokugo, int sugaku, int eigo)
	{
		int sum = kokugo + sugaku + eigo;
		return sum;
	}

}
