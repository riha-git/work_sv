import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HashMondai2
{
        public static void main(String[] args)
        {
                System.out.println("「!」で終了する");
                BufferedReader br = null;

                try
                {
                        List<String> fruits = new ArrayList<String>();
                        String str = "";
                        br = new BufferedReader(new InputStreamReader(System.in));

                        while(!str.equals("!"))
                        {
                                str = br.readLine();
                                if(str.equals("!"))
                                {
                                        break;
                                }
                                fruits.add(str);
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
