package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mondai2
{
        public static void main(String[] args)
        {
                List<Integer> vals = new ArrayList<Integer>();
                List<Integer> arr2 = new ArrayList<Integer>();
                List<Integer> arr3 = new ArrayList<Integer>();
                List<Integer> arr5 = new ArrayList<Integer>();

                Random random = new Random();
                for(int i = 0; i < 30; i++)
                {
                        int val = random.nextInt(100);
                        vals.add(val);
                }

                for(int val: vals)
                {
                        // 2の倍数
                        if(val%2 == 0)
                        {
                                arr2.add(val);
                        }
                        // 3の倍数
                        if(val%3 == 0)
                        {
                                arr3.add(val);
                        }
                        // 5の倍数
                        if(val%5 == 0)
                        {
                                arr5.add(val);
                        }
                }

                System.out.println("all: " + vals);
                System.out.println("2の倍数: " + arr2);
                System.out.println("3の倍数: " + arr3);
                System.out.println("5の倍数: " + arr5);
        }
}
