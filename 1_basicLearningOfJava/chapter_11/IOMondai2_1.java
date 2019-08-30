import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOMondai2_1
{
        public static void main(String[] args)
        {
                System.out.println("「!」で終了する");
                BufferedReader br = null;

                try
                {
                        String fruits[] = new String[4];
                        String str = "";
                        int i = 0;

                        br = new BufferedReader(new InputStreamReader(System.in));
                        while(i < fruits.length)
                        {
                                str = br.readLine();
                                if(str.equals("!"))
                                {
                                        break;
                                }
                                fruits[i] = str;
                                i++;
                        }

                        for(String fruit: fruits)
                        {
                                System.out.println(fruit);
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
