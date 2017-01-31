import Exercice1.PathName;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the file path extraction with java");
        PathName pathName = new PathName("user/geek/test.txt");
        System.out.println(pathName.getName());
        System.out.println(pathName.getDirectory());
        //System.out.println("Separator is :"+FileSystemTokenizer::getSeparator);
    }
}
