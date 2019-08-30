public class Seiseki2
{
        private String name;
        private int kokugo;
        private int sugaku;
        private int eigo;
        
        public Seiseki2()
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

        public int printGoukei(int kokugo, int sugaku, int eigo)
        {
                int sum = kokugo + sugaku + eigo;
                return sum;
        }
}
