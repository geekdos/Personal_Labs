/**
 * Created by theXuser on 22/11/2016.
 */

package Exercice1;

public class FileSystemTokenizer {

    public static char getSeparator(){
        String os = System.getProperty("os.name");
        char separator = ' ';
        if (os.substring(0,2).toLowerCase() == "win" ){
            separator = '\\';
        }if (os.substring(0,2).toLowerCase() == "lin"){
            separator = '/';
        }
        return separator;
    }

}
