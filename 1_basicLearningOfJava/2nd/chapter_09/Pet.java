package PetPac;

public class Pet implements PetInterface
{
        private String syurui;
        private String seibetsu;
        private int toshi;

        public Pet()
        {
                syurui = "なぞの生物";
                seibetsu = "性別不明";
                toshi = 0;
        }

        public Pet(String syurui, String seibetsu, int toshi)
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

        @Override
        public void eat()
        {
                System.out.println("ごはんを食べました");
        }

        @Override
        public void play()
        {
                System.out.println("遊びました");
        }
}
