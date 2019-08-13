import java.util.Calendar;

public class MyCalendar2
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();

		// void set(int field, int value);
		// 指定された値をCalendar objectのfieldに設定
		cal.set(Calendar.YEAR, 2020);
		System.out.println(cal.get(Calendar.YEAR) + "年");


		// 年月日をCalendar objectのfieldに設定
		// set(int year, int month, int date)
		cal.set(2020, 8, 7);
		makeVals(cal);


		// 日の減算
		cal.add(Calendar.DATE, -4);
		makeVals(cal);
	}

	static void makeVals(Calendar cal)
	{
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DATE);
		int[] array = {year, month, day};
		System.out.println(array[0] + "年" + array[1] + "月" + array[2] + "日");

		return;
	}
}
