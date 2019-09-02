package usesclass;

public class Mondai4
{
        public static void main(String[] args)
        {
                String mail = "sample@test.jp";
                int index1 = mail.indexOf("@");
                int index2 = mail.indexOf(".");

                if ((index1 == -1)||(index2 == -1))
                {
                        System.out.println("メールアドレスの形式ではありません。");
                }
                else if(index1 > index2)
                {
                        System.out.println("メールアドレスの形式ではありません。");
                }
                else
                {
                        System.out.println("正しいです。");
                }
        }
}
