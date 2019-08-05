public class ArrayMondai9_1
{
	public static void main(String args[])
	{
		String[] score = new String[args.length];


		for(int i = (args.length - 1); i >= 0; i--)
		{
			score[i] = args[i];
		}

		for(String str: score)
		{
			System.out.println(str);
		}
	}

}
