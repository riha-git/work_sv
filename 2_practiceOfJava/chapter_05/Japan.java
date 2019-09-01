package polymorphism;

public class Japan extends AbstractCountry
{
        public Japan()
        {
                super("日本", 1.3, "円");
        }

        @Override
        public void showDetail()
        {
                System.out.println("太平洋北西部にある日本列島及び周辺の島々を領土とする国家です。");
        }
}
