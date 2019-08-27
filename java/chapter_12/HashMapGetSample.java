import java.util.HashMap;
import java.util.Map;

public class HashMapGetSample
{
        public static void main(String[] args)
        {
                Map<String, String> map = new HashMap<String, String>();
                map.put("大阪府", "大阪市");
                map.put("兵庫県", "兵庫市");
                map.put("滋賀県", "大津市");

                String val = map.get("兵庫県");
                System.out.println("key: 兵庫県, val: " + val);

                val = map.get("東京都");
                System.out.println("key: 存在しないkey, val: " + val);
        }
}
