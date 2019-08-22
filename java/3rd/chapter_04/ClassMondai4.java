public class ClassMondai4
{
        public static void main(String[] args)
        {
                Seiseki4 i = new Seiseki4();

                Seiseki4.name = "鈴木";

                System.out.println(Seiseki4.getName() + "さんの成績:");
                System.out.println(Seiseki4.printGoukei(90, 80, 70));
        }
}
