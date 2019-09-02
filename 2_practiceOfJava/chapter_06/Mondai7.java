package io;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;



public class Mondai7
{
        public static void main(String[] args)
        {
                BufferedReader in = null;
                BufferedWriter out = null;

                try
                {
                        String name = "";
                        int count = 0;

                        in = new BufferedReader(new InputStreamReader(System.in));
                        System.out.println("名前>");
                        name = in.readLine();
                        System.out.println("回数");
                        count = Integer.parseInt(in.readLine());

                        out = new BufferedWriter(new FileWriter("./temp/io/mondai7.txt"));
                        for(int i = 0; i < count; i++)
                        {
                                out.write(name);
                                out.newLine();
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
                        if(out != null)
                        {
                                try
                                {
                                        out.close();
                                }
                                catch(IOException e)
                                {
                                        e.printStackTrace();
                                }
                        }

                }
        }
}
