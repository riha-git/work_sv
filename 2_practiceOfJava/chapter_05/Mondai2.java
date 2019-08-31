package encapsulation;
import encapsulation.person.Person;

public class Mondai2
{
        public static void main(String[] args)
        {
                Person person = new Person();
                person.greet();
                person = new Person("鈴木", 28);
                person.greet();
        }
}
