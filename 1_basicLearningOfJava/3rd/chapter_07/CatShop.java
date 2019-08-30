package Shop;

import CatPac.Cat;

public class CatShop
{
        public static void main(String[] args)
        {
                Cat cat = new Cat();
                buyCat(cat);

                cat = new Cat("アメリカンショートヘア", "オス", 0);
                buyCat(cat);
        }

        public static void buyCat(Cat tCat)
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
