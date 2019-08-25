import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOTest5
{
        public static void main(String[] args)
        {
                System.out.println("「!」+ Enterで終了");

                try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
                {
                        String str = "";

                        while(!str.equals("!"))
                        {
                                System.out.println("この後に入力 >");
                                str = br.readLine();
                                System.out.println("入力した値：" + str);
                        }

                }
                catch(IOException e)
                {
                        e.printStackTrace();
                }
        }
}
