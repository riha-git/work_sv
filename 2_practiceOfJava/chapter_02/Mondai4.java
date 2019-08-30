public class Mondai4
{
        public static void main(String[] args)
        {
                MaterialManager4 stock = new MaterialManager4(3, 4);

                System.out.println("マウスの数は" + stock.getMouse() + "個です。"); 
                System.out.println("キーボードの数は" + stock.getKeyboard() + "個です。"); 
        }
}

