public class AverageTest
{
        public static void main(String[] args)
        {
                AverageTest m = new AverageTest();
                int result = m.average(40, 80, 70);
                System.out.println("平均:" + result);
        }

        private int average(int firstargs, int secargs, int thirdargs)
        {
                int avr = (firstargs + secargs + thirdargs)/3;
                return avr;
        }
}
