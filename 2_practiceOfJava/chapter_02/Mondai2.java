public class Mondai2
{
        public static void main(String[] args)
        {
                MaterialManager2 stock = new MaterialManager2();
                stock.setMouse(2);
                stock.setKeyboard(4);
                System.out.println("マウスの数は" + stock.getMouse() + "個です。"); 
                System.out.println("キーボードの数は" + stock.getKeyboard() + "個です。"); 
        }
}

