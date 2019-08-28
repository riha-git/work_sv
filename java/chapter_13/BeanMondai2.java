import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BeanMondai2
{

        public static void main(String[] args)
        {
                BufferedReader br = null;
                List<InfoBean> list = new ArrayList<InfoBean>();

                try
                {
                        br = new BufferedReader(new FileReader("mondaibean.txt"));
                        InfoBean info = new InfoBean();
                        String str = null;

                        while((str = br.readLine()) != null)
                        {
                                String[] tmp = str.split(",", -1);
                                info.setName(tmp[0]);
                                info.setAddress(tmp[1]);
                                info.setJob(tmp[2]);
                                info.setAge(Integer.parseInt(tmp[3]));

                                list.add(info);
                                info = new InfoBean();
                        }

                        for(InfoBean bn: list)
                        {
                                System.out.println(
                                                bn.getName()
                                                + "\t"
                                                + bn.getAddress()
                                                + "\t"
                                                + bn.getJob()
                                                + "\t"
                                                + bn.getAge()
                                          );
                        }
                }
                catch(Exception e)
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
                }
        }
}
