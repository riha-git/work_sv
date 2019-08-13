public class ArrayMondai7_2
{
	public static void main(String[] args)
	{
		int seiseki[] = new int[]{65, 80, 75, 100, 40};
		int max_val = seiseki[0];
		for(int compare_val: seiseki)
		{
			if(compare_val > max_val)
			{
				max_val = compare_val;
			}
		}

		System.out.println("最高点：" + max_val);
	}
}
