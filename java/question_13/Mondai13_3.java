public class Mondai13_3
{
	public static void main(String[] args)
	{
		final int CONST_SUM = 55;
		int sum = 0;

		for(int num = 1; num <= 10; num++)
		{
			sum += num;
			if(sum == CONST_SUM)
			{
				System.out.println("合計は、" + sum +"です");
			}
		}
	}
}
