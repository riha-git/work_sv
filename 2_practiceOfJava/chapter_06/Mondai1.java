package exception;

public class Mondai1
{
        public static void main(String[] args)
        {
                if(args.length == 0)
                {
                        System.out.println("コマンドライン引数が指定されていません");
                        return;
                }

                try
                {
                        if(args[0].equals("A"))
                        {
                                float f = 2/0;
                                System.out.println(f);
                        }
                        else if(args[0].equals("B"))
                        {
                                int f[] = new int[10];
                                System.out.println(f[10]);
                        }
                        else if(args[0].equals("C"))
                        {
                                String f = null;
                                System.out.println(f.charAt(0));
                        }
                }
                catch(ArithmeticException e)
                {
                        System.out.println("ArithmeticException が発生しました。");
                }
                catch(ArrayIndexOutOfBoundsException e)
                {
                        System.out.println("ArrayIndexOutOfBoundsException が発生しました。");
                }
                catch(NullPointerException e)
                {
                        System.out.println("NullPointerException が発生しました。");
                }
        }
}
