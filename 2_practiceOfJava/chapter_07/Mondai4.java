package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class Mondai4
{
        public static void main(String[] args)
        {
                Map<String, String> map = new LinkedHashMap<String, String>();

                map.put("朝食", "トースト");
                map.put("昼食", "かつ丼");
                map.put("夕食", "鳥のから揚げ");
                map.put("夜食", "ラーメン");

                map.remove("夜食");
                map.put("昼食", "パスタ");

                for(String key: map.keySet())
                {
                        System.out.println(key + "は、" + map.get(key) + "を食べました");
                }
        }
}
