public class ClassMondai3
{
	public static void main(String[] args)
	{
		Seiseki3 sk3 = new Seiseki3("鈴木", 40, 50, 60);
		String name = sk3.getName();
		int sum = sk3.getGoukei();
		System.out.println(name + "さんの成績:");
		System.out.println("合計は、" + sum + "点です。");
	}
}
