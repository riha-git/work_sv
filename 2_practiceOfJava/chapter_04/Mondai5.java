package usesclass;

public class Mondai5
{
        public static void main(String[] args)
        {
                String ipAddress = "192.168.0.225";
                String ip[] = ipAddress.split("\\.");

                for(String str: ip)
                {
                        System.out.println(str);
                }
        }
}
