public class Mondai5
{
        public static void main(String[] args)
        {
                
                int sum = 0;
                int i = 0;
                while(i < 10)
                {
                        i++;
                        if(i%2 != 0)
                        {
                                continue;
                        }

                        sum += i;
                 }

                 // ここで加算すると、if文を通ったときに到達せずに無限ループとなる
                 //i++;

                 System.out.println(sum);
        }
}
