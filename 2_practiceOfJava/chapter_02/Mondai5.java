public class Mondai5
{
        public static void main(String[] args)
        {
                MaterialManager5 stock = new MaterialManager5(3, 4);
                stock.setHarddisk(12);
                stock.setDisplay(10);

                System.out.println("ハードディスクの数は" + MaterialManager5.getHarddisk() + "個です。"); 
                System.out.println("ディスプレイの数は" + MaterialManager5.getDisplay() + "個です。"); 
                System.out.println("マウスの数は" + stock.getMouse() + "個です。"); 
                System.out.println("キーボードの数は" + stock.getKeyboard() + "個です。"); 
        }
}

