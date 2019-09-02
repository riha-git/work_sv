package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Mondai4
{
        public static void main(String[] args)
        {
                BufferedReader in = null;
                
                try
                {
                        in = new BufferedReader(new FileReader("./temp/io/mondai.txt"));

                        String str = null;
                        while((str = in.readLine()) != null)
                        {
                                System.out.println(str);
                        }
                } 
                catch(FileNotFoundException e)
                {
                        System.out.println("ファイルが存在しません。");
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
                }
        }
}


