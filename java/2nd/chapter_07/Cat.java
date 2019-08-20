package Shop;

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

        String getSyurui()
        {
                return syurui;
        }

        String getSeibetsu()
        {
                return seibetsu;
        }

        int getToshi()
        {
                return toshi;
        }
}
