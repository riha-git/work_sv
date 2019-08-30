public class Mondai7
{
        public static void main(String[] args)
        {
                MaterialManager7 stock = new MaterialManager7(3, 4);
                stock.setHarddisk(7);
                stock.setDisplay(12);

                System.out.println("ハードディスクの数は" + MaterialManager7.getHarddisk() + "個です。"); 
                System.out.println("ディスプレイの数は" + MaterialManager7.getDisplay() + "個です。"); 
                System.out.println("マウスの数は" + stock.getMouse() + "個です。"); 
                System.out.println("キーボードの数は" + stock.getKeyboard() + "個です。"); 
                System.out.println("組み立て可能なPCは" + stock.getReservePc() + "台です。"); 
        }
}

