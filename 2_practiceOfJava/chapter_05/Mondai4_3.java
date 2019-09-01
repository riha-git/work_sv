package polymorphism;

public class Mondai4_3
{
        public static void main(String[] args)
        {
                America america = new America();
                america.showAbout();
                System.out.println();

                China china = new China();
                china.showAbout();
                System.out.println();

                Japan japan = new Japan();
                japan.showAbout();
        }
}
