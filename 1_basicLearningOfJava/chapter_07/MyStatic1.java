public class MyStatic1
{
        public static void main(String[] args)
        {
                _MyStatic1.a = 10;
                _MyStatic1.temp();
        }
}

class _MyStatic1
{
        static int a;
        static void temp()
        {
                System.out.println(a);
        }
}
