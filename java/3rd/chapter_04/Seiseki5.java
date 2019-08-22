public class Seiseki5
{
        private String name;
        private int kokugo;
        private int sugaku;
        private int eigo;

        public Seiseki5(String name, int kokugo, int sugaku, int eigo)
        {
                this.name = name;
                this.kokugo = kokugo;
                this.sugaku = sugaku;
                this.eigo = eigo;
        }

        public String getName()
        {
                return name;
        }

        public int getGoukei()
        {
                int sum = kokugo + sugaku + eigo;
                return sum;
        }
}
