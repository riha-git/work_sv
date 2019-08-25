import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOTest1
{
        public static void main(String[] args)
        {
                System.out.println("「!」+ Enterで終了");
                String str = "";
                BufferedReader br = null;

                try
                {
                        br = new BufferedReader(new InputStreamReader(System.in));

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
                finally
                {
                        if(br != null)
                        {
                                try
                                {
                                        br.close();
                                }
                                catch(IOException e)
                                {
                                        e.printStackTrace();
                                }
                        }
                }
        }
}
