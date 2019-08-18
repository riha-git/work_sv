package PetPac;

public class Pet
{
        // フィールド
        protected String syurui;
        protected String seibetsu;
        protected int toshi;

        // コンストラクタ
        public Pet()
        {
                this.syurui = "なぞの生物";
                this.seibetsu = "性別不明";
                this.toshi = 0;
        }

        public Pet(String syurui, String seibetsu, int toshi)
        {
                this.syurui = syurui;
                this.seibetsu = seibetsu;
                this.toshi = toshi;
        }

        // メソッド
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
