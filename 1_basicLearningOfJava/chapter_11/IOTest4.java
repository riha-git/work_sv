import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOTest4
{
        public static void main(String[] args)
        {
                System.out.println("入力された内容をtemp2.txtに読み込む");
                BufferedReader br = null;
                BufferedWriter bw = null;

                try
                {
                        br = new BufferedReader(new InputStreamReader(System.in));
                        String str = "";
                        System.out.println("この後に入力 >");
                        str = br.readLine();

                        bw = new BufferedWriter(new FileWriter("temp3.txt", true));
                        bw.write("\n" + str);
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

                        if(bw != null)
                        {
                                try
                                {
                                        bw.close();
                                }
                                catch(IOException e)
                                {
                                        e.printStackTrace();
                                }
                        }

                }
        }
}
