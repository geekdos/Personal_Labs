/**
 * Created by theXuser on 22/11/2016.
 */
package Exercice1;

public class FileSystemTokenizer {
    private static String OS, SEPARATOR;
    private static FileSystemTokenizer fileSystemTokenizer = null;

    private FileSystemTokenizer(){
        OS =  System.getProperty("os.name").substring(0,3).toLowerCase();
        SEPARATOR = null;
    }

    public static String getOS() {
        return OS;
    }

    public static void setOS(String OS) {
        FileSystemTokenizer.OS = OS;
    }

    public static void setSEPARATOR(String SEPARATOR) {
        FileSystemTokenizer.SEPARATOR = SEPARATOR;
    }

    public static FileSystemTokenizer getInstance(){
        if (fileSystemTokenizer == null){
            fileSystemTokenizer = new FileSystemTokenizer();
        }
        return fileSystemTokenizer;
    }

    public String getSeparator(){
        if (OS.equals("win")){
            SEPARATOR =  "\\";
        }if (OS.equals("lin")){
            SEPARATOR = "/";
        }
         return SEPARATOR;
    }

}
