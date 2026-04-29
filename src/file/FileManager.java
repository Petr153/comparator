package file;

import exception.FileNotFoundException;

import java.net.URL;
import java.net.URLDecoder;

public class FileManager {
    public static String  getFilePathString(String filePath) throws FileNotFoundException {
        URL fileNameURL = FileManager.class.getClassLoader().getResource(filePath);
        if (fileNameURL == null){
            throw new FileNotFoundException("Soubor nenalezen");
        }
        return URLDecoder.decode(fileNameURL.getFile());
    }
}
