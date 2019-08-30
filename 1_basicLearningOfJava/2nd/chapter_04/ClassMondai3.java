public class ClassMondai3
{
        public static void main(String[] args)
        {
                Seiseki3 i = new Seiseki3();
                i.setName("鈴木");
                String name = Seiseki3.getName();
                int sum = Seiseki3.getGoukei(90,80,90);
                System.out.println(name + "さんの成績：" + sum);
        }
}

