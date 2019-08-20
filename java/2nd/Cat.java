package Shop;

public class Cat
{
        private String syurui;
        private String seibetsu;
        private int toshi;
        
        public Cat()
        {
                this.syurui = "スコティッシュフォールド";
                this.seibetsu = "メス";
                this.toshi = 0;
        }

        public Cat(String syurui, String seibetsu, int toshi)
        {
                this.syurui = syurui;
                this.seibetsu = seibetsu;
                this.toshi = toshi;
        }

        String getSyurui()
        {
                return this.syurui;
        }

        String getSeibetsu()
        {
                return this.syurui;
        }

        int getToshi()
        {
                return this.toshi;
        }
}
