package CatPac;
import PetPac.*;

public class MondaiCat extends Pet
{
        public MondaiCat()
        {
                super.syurui = "スコティッシュフォールド";
                super.seibetsu = "メス";
                super.toshi = 0;
        }

        public MondaiCat(String tSyurui, String tSeibetsu, int tToshi)
        {
                super.syurui = tSyurui;
                super.seibetsu = tSeibetsu;
                super.toshi = tToshi;
        }
}
