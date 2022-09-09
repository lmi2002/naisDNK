package libs;

import org.json.JSONObject;
import org.apache.log4j.Logger;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;



public class ReadingFile {

    public String pathFile;

    public ReadingFile(){

    }

    public static String getContentFromFile(String pathFile) {
        String content = null;
        try {
            content = new String(Files.readAllBytes(Paths.get(pathFile)));
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return content;
    }

    public static JSONObject getJson(String content, String key) {
        JSONObject jsonObj = new JSONObject(content);
        JSONObject o = (JSONObject) jsonObj.get(key);
        return o;
    }




}
