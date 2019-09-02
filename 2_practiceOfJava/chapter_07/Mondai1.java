package collection;

import java.util.ArrayList;
import java.util.List;

public class Mondai1
{
        public static void main(String[] args)
        {
                List<String> dinners = new ArrayList<String>();

                dinners.add("ハンバーグ");
                dinners.add("オムライス");
                dinners.add("サラダ");
                dinners.add("カレー");
                dinners.add("ステーキ");

                for(int i = 0; i < dinners.size(); i++)
                {
                        System.out.print(dinners.get(i));
                        if(i != dinners.size() -1)
                        {
                                System.out.print(",");
                        }

                        System.out.println();
                }
        }
}

