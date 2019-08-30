public class MyException4
{
        public static void main(String[] args)
        {
                int a = 0;

                if(a == 0)
                {
                        try
                        {
                                myErrTest();
                        }
                        catch(MyErrException e)
                        {
                                System.out.println("MyErrException発生");
                        }
                }
        }

        public static void myErrTest() throws MyErrException
        {
                throw new MyErrException();
        }
}
