package usesclass;
import java.util.Calendar;

public class Mondai7
{
        public static void main(String[] args)
        {
                Calendar cal = Calendar.getInstance();
                cal.set(Calendar.YEAR, 2015);
                System.out.println(
                                        cal.get(Calendar.YEAR)
                                        + "年の日数は、"
                                        + cal.getActualMaximum(Calendar.DAY_OF_YEAR)
                                        + "日"
                                  );
                cal.set(Calendar.YEAR, 2016);
                System.out.println(
                                        cal.get(Calendar.YEAR)
                                        + "年の日数は、"
                                        + cal.getActualMaximum(Calendar.DAY_OF_YEAR)
                                        + "日"
                                  );
        }
}

