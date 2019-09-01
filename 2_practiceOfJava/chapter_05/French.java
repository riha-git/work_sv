package inheritance;

public class French extends Dinner
{
        public void appetizer()
        {
                super.printAppetizer("レバームース");
        }

        public void maindish()
        {
                super.printMaindish("フォアグラ");
        }

        public void dessert()
        {
                super.printDessert("チョコレートムース");
        }
}
