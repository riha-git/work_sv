package polymorphism;

public class America extends AbstractCountry
{
        public America()
        {
                super("アメリカ", 3.1);
        }

        @Override
        protected void showName()
        {
                super.showName();
                System.out.println("正式名称は「アメリカ合衆国」。");
        }

        @Override
        public void showDetail()
        {
                System.out.println("北米大陸の中央にある世界でも有数の多民族国家です。");
        }
}
