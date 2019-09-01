package polymorphism;

// 抽象クラス: 抽象メソッドを１つ以上持つクラスのこと
abstract class AbstractCountry implements Country
{
        private String name; 
        private double population;
        private String currency = "ドル";

        public AbstractCountry(String name, double population)
        {
                this.name = name;
                this.population = population;
        }

        public AbstractCountry(String name, double population, String currency)
        {
                this.name = name;
                this.population = population;
                this.currency = currency;
        }

        @Override
        public void showAbout()
        {
                showName();
                showPopulation();
                showDetail();
                showCurrency();
        }

        protected void showName()
        {
                System.out.println("【" + name + "】");
        }

        protected void showPopulation()
        {
                System.out.println("人口は約" + population + "億人以 上。");
        }

        protected void showCurrency()
        {
                System.out.println("通貨は" + currency + "です。");
        }

        protected abstract void showDetail();
}
