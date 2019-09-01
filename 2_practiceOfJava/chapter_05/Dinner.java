package inheritance;

public class Dinner
{
        protected void printAppetizer(String appetizer)
        {
                System.out.println("前菜は" + appetizer + "です。");
        }

        protected void printMaindish(String maindish)
        {
                System.out.println("メインは" + maindish + "です。");
        }

        protected void printDessert(String dessert)
        {
                System.out.println("デザートは" + dessert + "です。");
        }
}
