public class ArrayMondai6_1
{
	public static void main(String[] args)
	{
		int seiseki[] = new int[]{65, 80,75, 100, 40};
		int sum = 0;
		int count = 1;
		int ave = 0;
		for(int i: seiseki)
		{
			sum += i;
			count++;
		}
		ave = sum/count;

		System.out.println("合計点：" + sum);
		System.out.println("平均点：" + ave);
	}
}
