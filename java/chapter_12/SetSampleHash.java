import java.util.HashSet;
import java.util.Set;

public class SetSampleHash
{
        public static void main(String[] args)
        {
                Set<String> set = new HashSet<String>();

                set.add("あ");
                set.add("い");
                set.add("う");

                for(String str: set)
                {
                        System.out.println(str);
                }
        }
}
