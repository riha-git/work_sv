package usesclass;
public class Mondai10
{
        public static void main(String[] args)
        {
                for(String num1 : args)
                {
                        for(String num2 : args)
                        {
                                int result = Integer.parseInt(num1) * Integer.parseInt(num2);                        
                                System.out.print(result);
                                if(result < 10)
                                {
                                        System.out.print("  ");
                                }
                                else
                                {
                                        System.out.print(" ");
                                }
                        }
                        System.out.println();
                }
        }
}
