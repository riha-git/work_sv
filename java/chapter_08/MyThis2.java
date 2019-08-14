public class MyThis2
{
        // フィールド変数（クラス変数）
        int x = 1;

        void print(int x)
        {
                // 引数にクラス変数
                System.out.println(this.x);

                // 引数にローカル変数
                System.out.println(x);

                // フィールド変数にローカル変数を加算
                this.x = this.x + x;
                System.out.println(this.x);
        }
}
