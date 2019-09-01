package inheritance;

public class Italian extends Dinner
{
        public void appetizer()
        {
                super.printAppetizer("カプレーゼ");
        }

        public void maindish()
        {
                super.printMaindish("ホタテのベネチア風");
        }

        public void dessert()
        {
                super.printDessert("ティラミス");
        }
}
