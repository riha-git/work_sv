public class LambdaTest3
{
        public static void main(String[] args)
        {
                Hello hello = new Hello()
                {
                        @Override
                        public String sayHello(String name)
                        {
                                return "Hello" + name;
                        }
                };
                System.out.println(hello.sayHello("Tanaka"));
        }
}
