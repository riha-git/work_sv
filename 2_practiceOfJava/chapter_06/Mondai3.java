package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mondai3
{
        public static void main(String[] args)
        {
                BufferedReader in = null;
                BufferedWriter out = null;
                
                try
                {
                        in = new BufferedReader(new InputStreamReader(System.in));
                        out = new BufferedWriter(new FileWriter("./temp/io/mondai.txt"));

                        System.out.println("名前>");
                        out.write("名前>" + in.readLine());
                        out.newLine();

                        System.out.println("年齢>");
                        out.write("年齢>" + in.readLine());
                        out.newLine();

                        System.out.println("所属>");
                        out.write("所属>" + in.readLine());
                        out.newLine();

                        System.out.println("管理技術>");
                        out.write("管理技術>" + in.readLine());
                        out.newLine();
                } 
                catch(IOException e)
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


