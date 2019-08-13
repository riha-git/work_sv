public class Seiseki3
{
	String name;
	int kokugo, sugaku, eigo;

	Seiseki3(String tName, int tKokugo, int tSugaku, int tEigo)
	{
		name = tName;
		kokugo = tKokugo;
		sugaku = tSugaku;
		eigo = tEigo;
	}

	String getName()
	{
		return name;
	}

	int getGoukei()
	{
		int sum = kokugo + sugaku + eigo;
		return sum;
	}
}
