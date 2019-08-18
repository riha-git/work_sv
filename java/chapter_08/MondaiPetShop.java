package MondaiShop;
import PetPac.*;
import CatPac.*;
import DogPac.*;

public class MondaiPetShop
{
        public static void main(String[] args)
        {
                Pet myPet = new Pet();
                MondaiPetShop.buyPet(myPet);

                System.out.println("-------");
                
                MondaiCat myCat = new MondaiCat();
                MondaiPetShop.buyPet(myCat);

                myCat = new MondaiCat("アメリカンショートヘア", "オス", 0);
                MondaiPetShop.buyPet(myCat);

                System.out.println("-------");
                
                MondaiDog myDog = new MondaiDog();
                MondaiPetShop.buyPet(myDog);

                myDog = new MondaiDog("ゴールデンレトリバー", "オス", 0);
                MondaiPetShop.buyPet(myDog);

        }

        private static void buyPet(Pet tPet)
        {
                System.out.println(
                                        tPet.getSyurui()
                                        + "の"
                                        + tPet.getSeibetsu()
                                        + "、"
                                        + tPet.getToshi()
                                        + "歳を買いました"
                                  );
        }
}
