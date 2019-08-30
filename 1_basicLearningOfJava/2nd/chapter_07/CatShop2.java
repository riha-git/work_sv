package Shop;
import CatPac.Cat2;

public class CatShop2
{
        public static void main(String[] args)
        {
                // 別パッケージからCat2クラスのメンバにアクセス
                Cat2 myCat = new Cat2();
                CatShop2.buyCat(myCat);

                myCat = new Cat2("アメリカンショートヘア", "オス", 1);
                CatShop2.buyCat(myCat);
        }

        static void buyCat(Cat2 tCat)
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

