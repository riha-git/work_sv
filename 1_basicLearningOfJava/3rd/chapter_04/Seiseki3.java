public class Seiseki3
{
        private String name;
        private int kokugo;
        private int sugaku;
        private int eigo;
        
        public Seiseki3()
        {
                name = "山田";
                kokugo = 100;
                sugaku = 100;
                eigo = 100;
        }

        public void setName(String name)
        {
                this.name = name;
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
