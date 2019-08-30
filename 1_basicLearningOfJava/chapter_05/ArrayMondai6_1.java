public class ArrayMondai6_1
{
	public static void main(String[] args)
	{
		int seiseki[] = new int[]{65, 80, 75, 100, 40};
		int sum = 0;
		int ave = 0;
		for(int i = 0; i < seiseki.length; i++)
		{
			sum += seiseki[i];
		}
		ave = sum/seiseki.length;

		System.out.println("合計点：" + sum);
		System.out.println("平均点：" + ave);
	}
}
