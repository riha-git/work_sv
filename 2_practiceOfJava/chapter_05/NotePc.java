package inheritance;

public class NotePc extends Pc
{
        public NotePc(String cpu, String memory, String disk)
        {
                super(cpu, memory, disk);
        }

        public void move()
        {
                System.out.println("移動中です");
        }
} 
