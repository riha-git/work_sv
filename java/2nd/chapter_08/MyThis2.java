public class MyThis2
{
        int x = 1;

        void print(int x)
        {
                System.out.println("フィールド変数x:" + this.x);
                System.out.println("ローカル変数x:" + x);

                // フィールド変数にローカル変数を加算
                this.x += x;

                System.out.println("加算後のフィールド変数x:" + this.x);
         }
}

