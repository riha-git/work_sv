public class Mondai3
{
        public static void main(String[] args)
        {
                final int JAPAN_COIN = 50;

                switch(JAPAN_COIN)
                {
                        // ・「1」か「5」:「この硬貨は単位が小さいため、受付できません。」
                        case 1:
                        case 5:
                                System.out.println("この硬貨は単位が小さいため、受付できません。");
                                break;
                        // ・「10」「50」「100」「500」のどれか:「硬貨を受付しました。」
                        case 10:
                        case 50:
                        case 500:
                                System.out.println("硬貨を受付しました。");
                                break;
                        // ・それ以外:「外国製の硬貨は受付できません。」
                        default:
                                System.out.println("この硬貨は単位が小さいため、受付できません。");
                }
        }
}
