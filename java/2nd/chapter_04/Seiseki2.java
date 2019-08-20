public class Seiseki2
{
        String name;
        int kokugo;
        int sugaku;
        int eigo;

        public Seiseki2()
        {
                name = "山田";
                kokugo = 100;
                sugaku = 100;
                eigo = 100;
        }

        public void setName(String tName)
        {
                name = tName;
        }

        public String getName()
        {
                return name;
        }

        public int getGoukei(int tKokugo, int tSugaku, int tEigo)
        {
                int sum = tKokugo + tSugaku + tEigo;
                return sum;
        }
}
