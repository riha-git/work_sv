public class MainOverload1
{
        public static void main(String[] args)
        {
                MySub1 m = new MySub1();
                // super class
                m.myTemp();
                // sub class
                m.myTemp(0);
        }
}
