public class MaterialManager7
{
        int mouse;
        int keyboard;
        static int harddisk;
        static int display;

        MaterialManager7()
        {
                mouse = 5;
                keyboard = 5;
        }

        MaterialManager7(int tMouse, int tKeyboard)
        {
                mouse = tMouse;
                keyboard = tKeyboard;
        }


        void setMouse(int tMouse)
        {
                mouse = tMouse;
        }

        void setKeyboard(int tKeyboard)
        {
                keyboard = tKeyboard;
        }

        int getMouse()
        {
                return mouse;
        }

        int getKeyboard()
        {
                return keyboard;
        }

        void setHarddisk(int tHarddisk)
        {
                harddisk = tHarddisk;
        }

        void setDisplay(int tDisplay)
        {
                display = tDisplay;
        }

        static int getHarddisk()
        {
                return harddisk;
        }

        static int getDisplay()
        {
                return display;
        }

        int getReservePc()
        {
                int tmp = mouse;
                if(keyboard < tmp)
                {
                        tmp = keyboard;
                }

                if(harddisk < tmp)
                {
                        tmp = harddisk;
                }

                if(display < tmp)
                {
                        tmp = display;
                }
                return tmp;
        }
}
