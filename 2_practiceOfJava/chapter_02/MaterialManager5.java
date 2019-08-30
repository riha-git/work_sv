public class MaterialManager5
{
        int mouse;
        int keyboard;
        static int harddisk;
        static int display;

        MaterialManager5()
        {
                mouse = 5;
                keyboard = 5;
        }

        MaterialManager5(int tMouse, int tKeyboard)
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
}
