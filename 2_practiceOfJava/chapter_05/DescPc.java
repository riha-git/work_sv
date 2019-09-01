package inheritance;

public class DescPc extends Pc
{
        public DescPc(String cpu, String memory, String disk)
        {
                super(cpu, memory, disk);
        }

        public void recordTV()
        {
                System.out.println("テレビを録画しました");
        }
} 
