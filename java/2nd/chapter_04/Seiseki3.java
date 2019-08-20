public class Seiseki3
{
        static String name;
        int kokugo;
        int sugaku;
        int eigo;

        public Seiseki3()
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

        static String getName()
        {
                return name;
        }

        static int getGoukei(int tKokugo, int tSugaku, int tEigo)
        {
                int sum = tKokugo + tSugaku + tEigo;
                return sum;
        }
}
