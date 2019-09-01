package inheritance;

public class FrenchAfter extends French
{
        public void dessert()
        {
                super.dessert();
                System.out.println("食後にワインを飲みます。");
        }
}
