// Exceptionクラスを継承して、独自の例外クラス（Exceptionのサブクラス）を作成
public class MyErrException extends Exception
{
        // コンストラクタ
        MyErrException()
        {
                System.out.println("オリジナル例外");
        }
}
