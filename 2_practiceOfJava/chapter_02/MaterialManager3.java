public class MaterialManager3
{
        int mouse;
        int keyboard;

        MaterialManager3()
        {
                mouse = 5;
                keyboard = 5;
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
}
