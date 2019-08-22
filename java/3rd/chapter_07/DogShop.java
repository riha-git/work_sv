package Shop;

import DogPac.Dog;

public class DogShop
{
        public static void main(String[] args)
        {
                Dog dog = new Dog();
                buyDog(dog);

                dog = new Dog("ゴールデンレトリバー", "オス", 0);
                buyDog(dog);
        }

        public static void buyDog(Dog tDog)
        {
               System.out.println(
                                        tDog.getSyurui()
                                        + "の"
                                        + tDog.getSeibetsu()
                                        + "、"
                                        + tDog.getToshi()
                                        + "歳を買いました。"
                                );
        }
}
