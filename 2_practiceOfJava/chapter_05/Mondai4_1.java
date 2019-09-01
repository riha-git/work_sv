package polymorphism;

public class Mondai4_1
{
        public static void main(String[] args)
        {
                TropicalFishDictionary fish = new TropicalFishDictionary();
                fish.show(new Guppy());
                fish.show(new Piranha());
        }
}
