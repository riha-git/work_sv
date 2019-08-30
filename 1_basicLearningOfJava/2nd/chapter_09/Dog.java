package DogPac;
import PetPac.Pet;

public class Dog extends Pet
{
        public Dog()
        {
                super("トイプードル", "メス", 0);
        }

        public Dog(String syurui, String seibetsu, int toshi)
        {
                super(syurui, seibetsu, toshi);
        }

        @Override
        public void eat()
        {
                System.out.println("お肉を食べました");
        }

        @Override
        public void play()
        {
                System.out.println("公園で遊びました");
        }
}
