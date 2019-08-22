package Shop;

import PetPac.Pet;
import CatPac.Cat;
import DogPac.Dog;

public class PetShop
{
        public static void main(String[] args)
        {
                Pet pet = new Pet();
                PetShop.buyPet(pet);

                System.out.println("--------");

                Cat cat = new Cat();
                PetShop.buyPet(cat);
                cat = new Cat("アメリカンショートヘア", "オス", 1);
                PetShop.buyPet(cat);

                System.out.println("--------");

                Dog dog = new Dog();
                PetShop.buyPet(dog);
                dog = new Dog("ゴールデンレトリバー", "オス", 1);
                PetShop.buyPet(dog);
        }

        private static void buyPet(Pet tPet)
        {
                System.out.println(
                                        tPet.getSyurui()
                                        + "の"
                                        + tPet.getSyurui()
                                        + "、"
                                        + tPet.getToshi()
                                        + "歳を買いました。"
                                   );
                tPet.eat();
                tPet.play();
        }
}
