package Shop;

public class Dog
{
        // フィールド
        // 変数
        private String syurui;
        private String seibetsu;
        private int toshi;

        // コンストラクタ
        public Dog()
        {
                this.syurui = "トイプードル";
                this.seibetsu = "メス";
                this.toshi = 0;
        }

        public Dog(String tSyurui, String tSeibetsu, int tToshi)
        {
                this.syurui = tSyurui;
                this.seibetsu = tSeibetsu;
                this.toshi = tToshi;
        }

        // メソッド
        public String getSyurui()
        {
                return this.syurui;
        }

        public String getSeibetsu()
        {
                return this.seibetsu;
        }

        public int getToshi()
        {
                return this.toshi;
        }
}
