public class ClassMondai2_1
{
	public static void main(String[] args)
	{
		Seiseki2_1.name = "鈴木";
		String name = Seiseki2_1.getName();
		int sum = Seiseki2_1.printGoukei(40, 50, 60);
		System.out.println(name + "さんの成績：");
		System.out.println("合計は、" + sum + "点です。");
		
	}
}
