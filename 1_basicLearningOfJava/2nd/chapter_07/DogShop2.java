package Shop;
import DogPac.Dog2;

public class DogShop2
{
        public static void main(String[] args)
        {
                Dog2 myDog = new Dog2();
                DogShop2.buyDog(myDog);

                myDog = new Dog2("ゴールデンレトリバー", "オス", 1);
                DogShop2.buyDog(myDog);
        }

        static void buyDog(Dog2 tDog)
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

