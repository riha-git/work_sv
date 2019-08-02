public class Mondai13_4
{
	public static void main(String[] args)
	{
		final int CONST_SUM = 55;
		int num = 1;
		int sum = 0;

		while(num <= 10)
		{
			sum += num;
			if(sum == CONST_SUM)
			{
				System.out.println("合計は、" + sum + "です");
			}
			num++;
		}
	}
}
