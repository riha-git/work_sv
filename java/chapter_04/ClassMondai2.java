public class ClassMondai2
{
	public static void main(String[] args)
	{
		Seiseki2 sk2 = new Seiseki2();
		sk2.setName("鈴木");
		String name = sk2.getName();
		int sum = sk2.printGoukei(40, 50, 60);
		System.out.println(name + "さんの成績：");
		System.out.println("合計は、" + sum + "点です。");
		
	}
}
