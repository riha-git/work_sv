public class ClassMondai1
{
	public static void main(String[] args)
	{
		Seiseki1 sk1 = new Seiseki1();

		String name = sk1.getName();
		System.out.println(name + "さんの成績:");

		sk1.printGoukei();
	}
}
