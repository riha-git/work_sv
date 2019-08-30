package Shop;

public class CatShop
{
        public static void main(String[] args)
        {
                Cat myCat = new Cat();
                CatShop.buyCat (myCat);

                myCat = new Cat("アメリカンショートヘア", "オス", 1);
                CatShop.buyCat (myCat);
        }

        static void buyCat(Cat tCat)
        {
                System.out.println(
                                        tCat.getSyurui()
                                        + "の"
                                        + tCat.getSeibetsu()
                                        + "、"
                                        + tCat.getToshi()
                                        + "歳を買いました。"
                                   );
        }
}

