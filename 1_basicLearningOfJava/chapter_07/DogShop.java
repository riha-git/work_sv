package Shop;

public class DogShop
{
        public static void main(String[] args)
        {
                Dog myDog = new Dog();
                DogShop.buyDog(myDog);

                myDog = new Dog("ゴールデンレトリバー", "オス", 0);
                DogShop.buyDog(myDog);
        }

        static void buyDog(Dog tDog)
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
