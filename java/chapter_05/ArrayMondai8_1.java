public class ArrayMondai8_1
{
	public static void main(String[] args)
	{
		String students[] = {"山田", "佐藤", "鈴木"};
		int seiseki[][] = {
					{65, 80, 75},	// 山田さんの国語、数学、英語の点数
					{100, 90, 90},	// 佐藤さんの国語、数学、英語の点数
					{40, 30, 0}	// 鈴木さんの国語、数学、英語の点数
				  };
		int sum;
		String name;
		for(int i = 0; i < seiseki.length; i++)
		{
			name = students[i];
			sum = 0;

			for(int n = 0; n < seiseki[i].length; n++)
			{
				sum += seiseki[i][n];
			}

			System.out.println(name + "さんの合計点：" + sum);
		}
	}
}
