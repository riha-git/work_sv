package polymorphism;

public class Guppy implements TropicalFish
{
        @Override
        public void showName()
        {
                System.out.println("【グッピー】");
        }

        @Override
        public void about()
        {
                System.out.println("小型のメダカ類で熱帯魚における入門的な種。非常に丈夫で飼育が 容易であるのが特徴。");
        }
}
