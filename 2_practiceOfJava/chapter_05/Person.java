package encapsulation.person;

public class Person
{
        private String name;
        private int age;

        public Person()
        {
                name = "山田太郎";
                age = 22;
        }

        public Person(String tName, int tAge)
        {
                name = tName;
                age = tAge;
        }

        public void greet()
        {
                System.out.println("私の名前は" + name + "です。年齢は" + age + "です。");
        }
}
