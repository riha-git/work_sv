public class Seiseki1
{
        private String name;
        private int kokugo;
        private int sugaku;
        private int eigo;
        
        public Seiseki1()
        {
                name = "山田";
                kokugo = 100;
                sugaku = 100;
                eigo = 100;
        }

        public String getName()
        {
                return name;
        }

        public int printGoukei()
        {
                int sum = kokugo + sugaku + eigo;
                return sum;
        }
}
