public class Mondai11_1
{
	public static void main(String[] args)
	{
		// 任意の年齢を代入
		int[] arr = {0, 19, 20, 21};
		for(int age: arr)
		{
			// error case
			if(age <= 0)
			{
				System.out.println("不正値");
				continue;
			}

			// normal case
			if(age < 20)
			{
				System.out.println("まだ子供です。");	
			}
			else
			{
				System.out.println("りっぱな大人です。");	
			}
		}
		
	}
}
