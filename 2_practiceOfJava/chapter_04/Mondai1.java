package usesclass;
import java.util.Calendar;

public class Mondai1
{
        public static void main(String[] args)
        {
                Calendar cal = Calendar.getInstance();
                int year = 2014;
                int month = 12;
                int day = 31;
                cal.set(year, month - 1, day);
                String week = "";
                switch (cal.get(Calendar.DAY_OF_WEEK))
                {
                        case Calendar.SUNDAY:
                                week = "日曜日";
                                break;
                        case Calendar.MONDAY:
                                week = "月曜日";
                                break;
                        case Calendar.TUESDAY:
                                week = "火曜日";
                                break;
                        case Calendar.WEDNESDAY:
                                week = "水曜日";
                                break;
                        case Calendar.THURSDAY:
                                week = "木曜日";
                                break;
                        case Calendar.FRIDAY:
                                week = "金曜日";
                                break;
                        case Calendar.SATURDAY:
                                week = "土曜日";
                                break;
                }
                System.out.println(year + "年" + month + "月" + day + "日は" + week + "です。");
        }
}
