public class Mondai8_1
{
	public static void main(String[] args)
	{
		int x, y;
		int arr[] = new int[5];
		x = 200;
		y = 2;
		// 加算
		arr[0] = x + y;
		// 減算
		arr[1] = x - y;
		// 乗算
		arr[2] = x * y;
		// 除算
		arr[3] = x / y;
		// 剰余
		arr[4] = x % y;
		
		for(int result: arr)
		{
			System.out.println(result);
		}
	}
}
