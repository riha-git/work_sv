package collection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Mondai5
{
        public static void main(String[] args)
        {
                BufferedReader br = null;
                Map<String, Integer> list = new LinkedHashMap<String, Integer>();

                try
                {
                        br = new BufferedReader(new FileReader("./mondai5.txt"));
                        String str = "";
                        String name = "";
                        int amount = 0;
                        while((str = br.readLine()) != null)
                        {
                                String vals[] = str.split(",");
                                name = vals[0];
                                amount = Integer.parseInt(vals[2]);

                                if(list.containsKey(name))
                                {
                                        list.put(name, list.get(name) + amount);
                                }
                                else
                                {
                                        list.put(name, amount);
                                }
                        }

                        for(String tName : list.keySet())
                        {
                                System.out.println(tName + "さんの合計出費額は" + list.get(tName) + "円です。");
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
