package DogPac;

public class Dog2
{
        private String syurui;
        private String seibetsu;
        private int toshi;
        
        public Dog2()
        {
                syurui = "トイプードル";
                seibetsu = "メス";
                toshi = 0;
        }

        public Dog2(String syurui, String seibetsu, int toshi)
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
