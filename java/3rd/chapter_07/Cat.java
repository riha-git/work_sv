package CatPac;

public class Cat
{
        private String syurui;
        private String seibetsu;
        private int toshi;

        public Cat()
        {
                syurui = "スコティッシュフォールド";
                seibetsu = "メス";
                toshi = 0;
        }

        public Cat(String syurui, String seibetsu, int toshi)
        {
                this.syurui = syurui;
                this.seibetsu = seibetsu;
                this.toshi = toshi;
        }

        public String getSyurui()
        {
                return syurui;
        }

        public String getSeibetsu()
        {
                return seibetsu;
        }

        public int getToshi()
        {
                return toshi;
        }
}
