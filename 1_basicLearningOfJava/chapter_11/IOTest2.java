import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class IOTest2
{
        public static void main(String[] args)
        {
                System.out.println("temp1.txtからバッファに読み込む");
                BufferedReader br = null;

                try
                {
                        br = new BufferedReader(new FileReader("temp1.txt"));
                        String str = null;

                        while((str = br.readLine()) != null)
                        {
                                System.out.println(str);
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
