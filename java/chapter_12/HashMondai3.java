import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class HashMondai3
{
        public static void main(String[] args)
        {
                System.out.println("「!」で終了する");
                BufferedReader br = null;
                BufferedWriter bw = null;

                try
                {
                        List<String> fruits = new ArrayList<String>();
                        String str = "";
                        br = new BufferedReader(new InputStreamReader(System.in));
                        bw = new BufferedWriter(new FileWriter("kekka3.txt"));

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
                                bw.write(fruit);
                                bw.newLine();
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
