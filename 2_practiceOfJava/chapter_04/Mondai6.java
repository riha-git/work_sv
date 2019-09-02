package usesclass;

public class Mondai6
{
        public static void main(String[] args)
        {
                String path = "C:\\temp\\usesclass\\sample.txt";

                int index = path.lastIndexOf("\\");
                String fileName = path.substring(index + 1);

                index = path.lastIndexOf(".");
                String fileExtension = path.substring(index);
                System.out.println("ファイル名は「" + fileName + "」です。");
                System.out.println("拡張子は「" + fileExtension + "」です。");
        }
}
