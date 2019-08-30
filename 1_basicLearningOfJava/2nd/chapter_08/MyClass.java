public class MyClass
{
        public static void main(String[] args)
        {
                MySuper s = new MySuper();
                System.out.println("スーパークラス:" + s.getX());
                MySub m = new MySub();
                System.out.println("サブクラスからスーパークラスにアクセス:" + m.getX());
                System.out.println("サブクラス:" + m.getY());
        }
}

