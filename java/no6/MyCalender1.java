import java.util.Calendar;

public class MyCalender1
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		// int get(int field);
		// int field: Calendar classのfield値(static int XXXといった定義)

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);

		int week = cal.get(Calendar.DAY_OF_WEEK);

		int hout = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);

		System.out.println(year + "年" + month + "月" + date + "日");
		System.out.println(hout + "時" + min + "分" + sec + "秒");

		switch(week)
		{
			case Calendar.SUNDAY:
				System.out.println("日曜日");
				break;
			case Calendar.MONDAY:
				System.out.println("月曜日");
				break;
			case Calendar.TUESDAY:
				System.out.println("火曜日");
				break;
			case Calendar.WEDNESDAY:
				System.out.println("水曜日");
				break;
			case Calendar.THURSDAY:
				System.out.println("木曜日");
				break;
			case Calendar.FRIDAY:
				System.out.println("金曜日");
				break;
			case Calendar.SATURDAY:
				System.out.println("土曜日");
				break;
			default:
				break;
		}
	}
}
