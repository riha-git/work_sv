package CatPac;
import PetPac.*;

public class Cat extends Pet implements PetInterface
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
                System.out.println("大きな魚を食べました。");
        }

        @Override
        public void play()
        {
                System.out.println("ねずみのおもちゃで遊びました。");
        }
}
