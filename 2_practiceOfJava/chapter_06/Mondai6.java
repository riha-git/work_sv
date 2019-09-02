package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Mondai6
{
        public static void main(String[] args)
        {
                BufferedReader in = null;

                try
                {
                        in = new BufferedReader(new FileReader("./temp/io/mondai6.txt"));

                        String str = null;
                        while((str = in.readLine()) != null)
                        {
                                String id = str.substring(0, 6);
                                String name = str.substring(6);
                                System.out.println(name + "さんは" + id + "です");
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
                                catch(IOException e)
                                {
                                        e.printStackTrace();
                                }
                        }
                }
        }
}
