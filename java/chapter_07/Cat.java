package Shop;

public class Cat
{
        // フィールド
        // 変数
        private String syurui;
        private String seibetsu;
        private int toshi;

        // コンストラクタ
        Cat()
        {
                this.syurui = "スコティッシュフォールド";
                this.seibetsu = "メス";
                this.toshi = 0;
        }

        Cat(String tSyurui, String tSeibetsu, int tToshi)
        {
                this.syurui = tSyurui;
                this.seibetsu = tSeibetsu;
                this.toshi = tToshi;
        }

        // メソッド
        protected String getSyurui()
        {
                return this.syurui;
        }

        protected String getSeibetsu()
        {
                return this.seibetsu;
        }

        protected int getToshi()
        {
                return this.toshi;
        }
}
