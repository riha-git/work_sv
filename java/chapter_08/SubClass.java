public class SubClass extends MyExtends
{
        void change()
        {
                // 親クラスでfinalフィールドで定義しされているためエラー
                x = 10;
        }

        // 親クラスでfinalメソッドで定義されているためエラー
        void myTemp()
        {
        }
}
