import java.util.Calendar;

public class CalendarMondai1
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();

		cal.add(Calendar.YEAR, -5);
		int year  = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day   = cal.get(Calendar.DATE);

		System.out.println("5年前の今日は、" + year + "年" + month + "月" + day + "日です。");
	}
}
