package DogPac;
import PetPac.*;

public class Dog extends Pet implements PetInterface
{
        public Dog()
        {
                super("ゴールデンレトリバー", "メス", 0);
        }
                
        public Dog(String syurui, String seibetsu, int toshi)
        {
                super(syurui, seibetsu, toshi);
        }

        @Override
        public void eat()
        {
                System.out.println("大好きな肉を食べました。");
        }

        @Override
        public void play()
        {
                System.out.println("公園で走って遊びました。");
        }
}
