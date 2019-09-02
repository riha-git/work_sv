package collection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Mondai6
{
        public static void main(String[] args)
        {
                BufferedReader br = null;
                Map<String, Integer> list = new LinkedHashMap<String, Integer>();

                try
                {
                        br = new BufferedReader(new FileReader("./mondai5.txt"));
                        String str = "";
                        String month = "";
                        int amount = 0;
                        while((str = br.readLine()) != null)
                        {
                                String vals[] = str.split(",");
                                month = vals[3].substring(0, 7);
                                amount = Integer.parseInt(vals[2]);

                                if(list.containsKey(month))
                                {
                                        list.put(month, list.get(month) + amount);
                                }
                                else
                                {
                                        list.put(month, amount);
                                }
                        }

                        for(String tMonth : list.keySet())
                        {
                                System.out.println(tMonth + "\t" + list.get(tMonth));
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
