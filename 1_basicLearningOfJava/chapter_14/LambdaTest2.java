public class LambdaTest2
{
        public static void main(String[] args)
        {
                //HelloImpl hello = new HelloImpl();

                Hello hello = (String name) ->
                {
                        return "Hello" + name;
                };
                System.out.println(hello.sayHello("Tanaka"));
        }
}
