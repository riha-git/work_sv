public class ClassMondai4
{
        public static void main(String[] args)
        {
                Seiseki4 i = new Seiseki4("鈴木", 90, 80, 90);
                String name = i.getName();
                int sum = i.getGoukei();
                System.out.println(name + "さんの成績：" + sum);
        }
}

