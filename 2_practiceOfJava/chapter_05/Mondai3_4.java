package inheritance;

public class Mondai3_4
{
        public static void main(String[] args)
        {
                System.out.println("【デスクトップPC】");
                DescPc desc = new DescPc("Intel Core 2 Duo 2.93GHz", "30GB", "250GB");
                desc.showSpec();
                desc.launch();
                desc.recordTV();
                desc.shotdown();

                System.out.println("【ノートPC】");
                NotePc note = new NotePc("Celeron M 1.52GHz", "2GB", "130GB");
                note.showSpec();
                note.launch();
                note.move();
                note.shotdown();
        }
}
