import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HashMondai4
{
        public static void main(String[] args)
        {
                System.out.println("「!」で終了する");
                BufferedReader br = null;

                try
                {
                        Map<String, String> fruits = new HashMap<String, String>();
                        String str = "";
                        String txt = new String("");
                        br = new BufferedReader(new InputStreamReader(System.in));

                        fruits.put("りんご", "apple");
                        fruits.put("バナナ", "banana");
                        fruits.put("なし", "pear");
                        fruits.put("もも", "peach");

                        while(!str.equals("!"))
                        {
                                str = br.readLine();
                                if(str.equals("!"))
                                {
                                        break;
                                }

                                if(str.equals(""))
                                {
                                        continue;
                                }

                                txt = fruits.get(str);
                                if(txt == null)
                                {
                                        System.out.println("存在しません");
                                        continue;
                                }

                                System.out.println(txt);
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
