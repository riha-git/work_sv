public class BeanMondai1_1
{
        public static void main(String[] args)
        {
                InfoBean info = new InfoBean();

                info.setName("山崎");
                info.setAddress("東京都千代田区");
                info.setJob("javaプログラマ");
                info.setAge(20);

                System.out.println(info.getName());
                System.out.println(info.getAddress());
                System.out.println(info.getJob());
                System.out.println(info.getAge());
        }
}
                
