import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOTest6
{
        public static void main(String[] args)
        {
                System.out.println("「!」+ Enterで終了");

                // Java9から
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                try(br)
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
