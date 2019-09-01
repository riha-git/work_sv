package inheritance;

public class Mondai3_1
{
        public static void main(String[] args)
        {
                French french = new French();
                System.out.println("【フレンチ】");
                french.appetizer();
                french.maindish();
                french.dessert();

                System.out.println();

                Italian italian = new Italian();
                System.out.println("【イタリアン】");
                italian.appetizer();
                italian.maindish();
                italian.dessert();
        }
}
