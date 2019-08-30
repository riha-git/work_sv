public class LambdaTest4
{
        public static void main(String[] args)
        {
                Hello hello = name -> "Hello" + name;
                System.out.println(hello.sayHello("Tanaka"));
        }
}
