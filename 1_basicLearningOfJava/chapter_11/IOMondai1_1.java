import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOMondai1_1
{
        public static void main(String[] args)
        {
                BufferedReader br = null;
                BufferedWriter bw = null;

                try
                {
                        // ファイル読み込みストリーム
                        br = new BufferedReader(new FileReader("mondaitemp1.txt"));

                        // ファイル書き込みストリーム
                        bw = new BufferedWriter(new FileWriter("mondaikekka1.txt"));

                        // 初期化
                        String str = "";

                        // ファイル読み込み
                        while((str = br.readLine()) != null)
                        {
                                bw.write(str);
                                bw.newLine();        // 改行
                        }
                }
                catch(IOException e)
                {
                        e.printStackTrace();
                }
                finally
                {
                        if(br != null)
                        {
                                try
                                {
                                        br.close();
                                }
                                catch(IOException e)
                                {
                                        e.printStackTrace();
                                }
                        }

                        if(bw != null)
                        {
                                try
                                {
                                        bw.close();
                                }
                                catch(IOException e)
                                {
                                        e.printStackTrace();
                                }
                        }

                }
        }
}
