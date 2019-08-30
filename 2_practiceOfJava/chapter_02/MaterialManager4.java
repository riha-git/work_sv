public class MaterialManager4
{
        int mouse;
        int keyboard;

        MaterialManager4()
        {
                mouse = 5;
                keyboard = 5;
        }

        MaterialManager4(int tMouse, int tKeyboard)
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
}
