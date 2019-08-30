package Pac5_1;

// 別パッケージからアクセス可能なクラス
public class MyClass7_1
{
        // アクセス修飾子なし
        // 同じパッケージからのみアクセス可能
        // フィールド
        int a, b;

        // メソッド
        void add()
        {
                int a = this.a;
                int b = this.b;
                System.out.println(a + b);
        }
}
