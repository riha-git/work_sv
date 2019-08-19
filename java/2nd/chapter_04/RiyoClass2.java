public class RiyoClass2
{
        public static void main(String[] args)
        {
                ClassStudy1 m = new ClassStudy1();
                int y = m.x;
                int z = m.getSum();
                System.out.println("フィールドxの値の代入値:" + y);
                System.out.println("メンバメソッドの戻り値の代入値:" + z);
        }
}
