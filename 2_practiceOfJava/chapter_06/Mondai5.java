package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mondai5
{
        public static void main(String[] args)
        {
                BufferedReader in = null;

                try
                {
                        in = new BufferedReader(new InputStreamReader(System.in));
                        String str = "";

                        System.out.println("成績>");
                        str = in.readLine();

                        if(Integer.parseInt(str) < 40)
                        {
                                System.out.println("不合格です。");
                        }
                        else
                        {
                                System.out.println("合格です。");
                        }
                }
                catch(Exception e)
                {
                        e.printStackTrace();
                }
                finally
                {
                        if(in != null)
                        {
                                try
                                {
                                        in.close();
                                }
                                catch(Exception e)
                                {
                                        e.printStackTrace();
                                }
                        }
               }
        }
}
