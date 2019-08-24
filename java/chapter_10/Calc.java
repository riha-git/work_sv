public class Calc
{
        public String getBaisu(String str) throws NumberFormatException, MyErrException2
        {
                int num = Integer.parseInt(str);
                if(num >= 1000)
                {
                        throw new MyErrException2();
                }

                String result = String.valueOf(num * 10);

                return result;
        }
}
