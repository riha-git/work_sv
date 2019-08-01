public class Mondai11_3
{
	public static void main(String[] args)
	{
		// 任意の時刻設定
		int[] arr = {-10, 1, 7, 8, 11, 12, 13, 15, 16, 17, 18, 19, 20, 21, 22, 25};

		int result;
		for(int hour: arr)
		{
			result = errorChk(hour);

			// error case
			if(result != 0)
			{
				System.out.println("不正値");
				continue;
			}
		
			// normal case
			switch(hour)
			{
				case 8:
				case 9:
				case 10:
				case 11:
					System.out.println("おはようございます！今日も一日頑張りましょう。");
					break;
				case 12:
				case 13:
				case 14:
				case 15:
					System.out.println("こんにちは！居眠りしないように！");
					break;
				case 16:
				case 17:
				case 18:
					System.out.println("あと少し頑張りましょう。");
					break;
				case 19:
				case 20:
				case 21:
					System.out.println("お疲れ様。また明日！");
					break;
				default:
					System.out.println("頑張り過ぎです。休みましょう。");
			}
		}
	}

	// 不正値チェック処理
	static public int errorChk(int chk)
	{		
		int chk_result;
		if((chk < 0) || (chk > 24))
		{
			System.out.println("不正値");
			chk_result = -1;	
		}
		else
		{
			chk_result = 0;
		}
		return(chk_result);
	}
}
