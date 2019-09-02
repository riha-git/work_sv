package usesclass;

public class Mondai3
{
        public static void main(String[] args)
        {
                String thedate = "2015-01-01";
                String arr[] = thedate.split("-");
                String year = arr[0];
                String month = arr[1];
                String day = arr[2];
                System.out.println(year + "年" + month + "月" + day + "日");
        }
}
