package DogPac;
import PetPac.*;

public class MondaiDog extends Pet
{
        public MondaiDog()
        {
                super.syurui = "トイプードル";
                super.seibetsu = "メス";
                super.toshi = 0;
        }

        public MondaiDog(String tSyurui, String tSeibetsu, int tToshi)
        {
                super.syurui = tSyurui;
                super.seibetsu = tSeibetsu;
                super.toshi = tToshi;
        }
}
