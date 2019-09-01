package polymorphism;

public class China extends AbstractCountry
{
        public China()
        {
                super("中国", 13.4, "元");
        }

        @Override
        protected void showName()
        {
                super.showName();
                System.out.println("正式名称は「中華人民共和国」。");
        }

        @Override
        public void showDetail()
        {
                System.out.println("ユーラシア大陸東部に位置する世界最大の人口を擁する国家です。");
        }
}
