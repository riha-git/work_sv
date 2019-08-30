public class Seiseki4
{
        String name;
        int kokugo;
        int sugaku;
        int eigo;

        public Seiseki4()
        {
                name = "山田";
                kokugo = 100;
                sugaku = 100;
                eigo = 100;
        }

        public Seiseki4(String tName, int tKokugo, int tSugaku, int tEigo)
        {
                name = tName;
                kokugo = tKokugo;
                sugaku = tSugaku;
                eigo = tEigo;
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
