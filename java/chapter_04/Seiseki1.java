public class Seiseki1
{
	// フィールド
	String name;
	int kokugo, sugaku, eigo;

	// コンストラクタ（初期化）
	Seiseki1()
	{
		name = "山田";
		kokugo = 100;
		sugaku = 100;
		eigo = 100;
	}

	// メソッド
	String getName()
	{
		return name;
	}

	void printGoukei()
	{
		int sum = kokugo + sugaku + eigo;
		System.out.println("合計は、" + sum + "です。");
	}
}
