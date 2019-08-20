public class ClassMondai2
{
        public static void main(String[] args)
        {
                Seiseki2 i = new Seiseki2();
                i.setName("鈴木");
                String name = i.getName();
                int sum = i.getGoukei(90,80,90);
                System.out.println(name + "さんの成績：" + sum);
        }
}

