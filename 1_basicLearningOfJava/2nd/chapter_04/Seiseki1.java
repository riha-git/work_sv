public class Seiseki1
{
        private String name;
        private int kokugo;
        private int sugaku;
        private int eigo;

        public Seiseki1()
        {
                this.name = "山田";
                this.kokugo = 100;
                this.sugaku = 100;
                this.eigo = 100;
        }

        public String getName()
        {
                return this.name;
        }

        public void printGoukei()
        {
                int sum = kokugo + sugaku + eigo;
                System.out.println("合計は、" + sum + "点です。");
        }
}
