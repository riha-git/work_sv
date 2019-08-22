package CatPac;
import PetPac.Pet;

public class Cat extends Pet
{
        public Cat()
        {
                super("スコティッシュフォールド", "メス", 0);
        }

        public Cat(String syurui, String seibetsu, int toshi)
        {
                super(syurui, seibetsu, toshi);
        }

        @Override
        public void eat()
        {
                System.out.println("お魚を食べました");
        }

        @Override
        public void play()
        {
                System.out.println("ねずみで遊びました");
        }
}
