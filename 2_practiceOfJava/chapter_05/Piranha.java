package polymorphism;

public class Piranha implements TropicalFish
{
        @Override
        public void showName()
        {
                System.out.println("【ピラニア】");
        }

        @Override
        public void about()
        {
                System.out.println("熱帯地方に生息する肉食の淡水魚。危険なイメージがあるが、鋭い牙 に注意すれば飼育は比較的容易。");
        }
}
