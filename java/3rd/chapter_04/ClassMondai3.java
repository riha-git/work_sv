public class ClassMondai3
{
        public static void main(String[] args)
        {
                Seiseki3 i = new Seiseki3();

                i.setName("鈴木");

                System.out.println(i.getName() + "さんの成績:");
                System.out.println(i.printGoukei(90, 80, 70));
        }
}
