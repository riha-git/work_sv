public class MySub1 extends MySuper1
{
        int x = 1;

        @Override
        void print()
        {
                System.out.println("superのx:" + super.x);
                super.print();
                System.out.println("subのx:" + x);
        }
}
