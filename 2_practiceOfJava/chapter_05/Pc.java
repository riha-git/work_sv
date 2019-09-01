package inheritance;

public class Pc
{
        protected String cpu, memory, disk;

        public Pc(String cpu, String memory, String disk)
        {
                this.cpu = cpu;
                this.memory = memory;
                this.disk = disk;
        }

        public void showSpec()
        {
                System.out.println(
                                        "CPU: " + cpu
                                        + "\n"
                                        + "メモリー量: " + memory
                                        + "\n"
                                        + "ハードディスク量: " + disk
                                  );

        }

        public void launch()
        {
                System.out.println("パソコンを移動しました");
        }

        public void shotdown()
        {
                System.out.println("パソコンを終了しました");
        }
} 
