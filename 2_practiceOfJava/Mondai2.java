package exception;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mondai2
{
        public static void main(String[] args)
        {
                try
                {
                        output(args[0]);
                }
                catch(ParseException e)
                {
                        System.out.println("日付の変換に失敗しました。コマンドライン引数はyyyy/MM/ddの形式で指定してください。");
                }
                catch(ArrayIndexOutOfBoundsException e)
                {
                        System.out.println("コマンドライン引数が指定されていません。");
                }
                catch(Exception e)
                {
                        System.out.println("予期せぬエラーが発生しました。");
                }
        }

        private static void output(String dateStr) throws ParseException
        {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                Date date = sdf.parse(dateStr);
                Calendar cal = Calendar.getInstance();
                cal.setTime(date);
                String week = "";

                switch(cal.get(Calendar.DAY_OF_WEEK))
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
                System.out.println(sdf.format(date) + "は" + week + "です。");
        }
}
