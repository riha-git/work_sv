package CatPac;

public class Cat2
{
        private String syurui;
        private String seibetsu;
        private int toshi;
        
        public Cat2()
        {
                syurui = "スコティッシュフォールド";
                seibetsu = "メス";
                toshi = 0;
        }

        public Cat2(String syurui, String seibetsu, int toshi)
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
