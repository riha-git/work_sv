package Shop;

import PetPac.Pet;
import CatPac.Cat;
import DogPac.Dog;

public class PetShop
{
        public static void main(String[] args)
        {
                Pet myPet = new Pet();
                buyPet(myPet);

                System.out.println("-----------");

                Cat myCat = new Cat();
                buyPet(myCat);

                myCat = new Cat("アメリカンショートヘア", "オス", 1);
                buyPet(myCat);

                System.out.println("-----------");

                Dog myDog = new Dog();
                buyPet(myDog);

                myDog = new Dog("ゴールデンレトリーバー", "オス", 1);
                buyPet(myDog);
        }

        private static void buyPet(Pet tPet)
        {
                System.out.println(
                                        tPet.getSyurui()
                                        + "の"
                                        + tPet.getSeibetsu()
                                        + "、"
                                        + tPet.getToshi()
                                        + "を買いました"
                                  );
        }
}
