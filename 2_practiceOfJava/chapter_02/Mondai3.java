public class Mondai3
{
        public static void main(String[] args)
        {
                MaterialManager3 stock = new MaterialManager3();

                System.out.println("---初期化---");
                System.out.println("マウスの数は" + stock.getMouse() + "個です。"); 
                System.out.println("キーボードの数は" + stock.getKeyboard() + "個です。"); 

                System.out.println("---代入後---");
                stock.setMouse(2);
                stock.setKeyboard(4);
                System.out.println("マウスの数は" + stock.getMouse() + "個です。"); 
                System.out.println("キーボードの数は" + stock.getKeyboard() + "個です。"); 
        }
}

