public class Mondai6
{
        public static void main(String[] args)
        {
                MaterialManager5 stock1 = new MaterialManager5(3, 4);
                stock1.setHarddisk(7);  // クラス変数
                stock1.setDisplay(12);  // クラス変数
                MaterialManager5 stock2 = new MaterialManager5();

                System.out.println("------- 管理1の各資材の数は以下の通りです。 -------");
                System.out.println("ハードディスクの数は" + MaterialManager5.getHarddisk() + "個です。"); 
                System.out.println("ディスプレイの数は" + MaterialManager5.getDisplay() + "個です。"); 
                System.out.println("マウスの数は" + stock1.getMouse() + "個です。"); 
                System.out.println("キーボードの数は" + stock1.getKeyboard() + "個です。"); 

                
                System.out.println("------- 管理2の各資材の数は以下の通りです。 -------");
                System.out.println("ハードディスクの数は" + MaterialManager5.getHarddisk() + "個です。"); 
                System.out.println("ディスプレイの数は" + MaterialManager5.getDisplay() + "個です。"); 
                System.out.println("マウスの数は" + stock2.getMouse() + "個です。"); 
                System.out.println("キーボードの数は" + stock2.getKeyboard() + "個です。"); 

                System.out.println();

                stock2.setHarddisk(15); // クラス変数
                stock2.setDisplay(17);  // クラス変数
                System.out.println("------- 管理1の各資材の数は以下の通りです。 -------");
                System.out.println("ハードディスクの数は" + MaterialManager5.getHarddisk() + "個です。"); 
                System.out.println("ディスプレイの数は" + MaterialManager5.getDisplay() + "個です。"); 
                System.out.println("マウスの数は" + stock1.getMouse() + "個です。"); 
                System.out.println("キーボードの数は" + stock1.getKeyboard() + "個です。"); 

                
                stock2.setMouse(6);     // インスタンス変数
                stock2.setKeyboard(8);  // インスタンス変数
                System.out.println("------- 管理2の各資材の数は以下の通りです。 -------");
                System.out.println("ハードディスクの数は" + MaterialManager5.getHarddisk() + "個です。"); 
                System.out.println("ディスプレイの数は" + MaterialManager5.getDisplay() + "個です。"); 
                System.out.println("マウスの数は" + stock2.getMouse() + "個です。"); 
                System.out.println("キーボードの数は" + stock2.getKeyboard() + "個です。"); 
        }
}

