package libs;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.Random;
import java.util.regex.Pattern;


public class Utils {
    private Logger log;
    public Utils() {
        log = Logger.getLogger(getClass());
    }

    /**
     * Taking screenshot into .//target// + pathToScreenShot
     *
     * @param pathToScreenShot
     * @param driver
     */
    public void screenShot(String pathToScreenShot, WebDriver driver) {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File(pathToScreenShot));
            log.info("ScreenShot: " + pathToScreenShot);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Hard wait
     *
     * @param millis
     * 1000 millis = 1 sec
     */
    public static void waitABit(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    /**
     * Method returned SystemDateAndTime In Format yyyy-MM-dd_HH-mm-ss
     *
     * @return
     */
    public static String getDateAndTimeFormated() {

        return getDateAndTime("yyyy-MM-dd_HH-mm-ss");
    }

    /**
     * Method returned SystemDateAndTime
     *
     * @return
     */
    public static String getDateAndTime(String format) {
        DateFormat dateFormat = new SimpleDateFormat(format);
        Date date = new Date();
        String dateFormated = dateFormat.format(date);
        System.out.println(dateFormated);
        return dateFormated;
    }

    /**
     * Method returned absolute path to key
     * @param pathToKey
     * @return
     */
    public static String getAbsolutePathToKey(String pathToKey) {
        String path = "settings/kep";
        File f = new File(path);
        String absolutePath =  f.getAbsolutePath() + pathToKey;
        return absolutePath;
    }

    public static String getAbsolutePathToDataFiles(String pathToFile) {
        String path = "src/main/java/data";
        File f = new File(path);
        String absolutePath =  f.getAbsolutePath() + pathToFile;
        return absolutePath;
    }

    public static JSONObject getUserPersonData(String pathFile, String role) {
        String content = ReadingFile.getContentFromFile(pathFile);
        JSONObject personData = ReadingFile.getJson(content, role);
        return personData;
    }

    public static String getRandNumber(int start, int end) {
        String num = Integer.toString(start + (int) (Math.random() * end));
        return num;
    }

    public void pause() throws InterruptedException {
        Thread.sleep(5000);
    }

    /**
    method check regex with text
     * @param regex
     * exemple "/document/view\\?id=[0-9]*&documentType=act_inspection_document"
     * @param text
     * @return
     */
    public static boolean checkRegex(String regex, String text) {
        boolean bool = Pattern.matches(regex, text);
        return bool;
    }

    public static String getIPAdress() throws UnknownHostException {
        InetAddress addr = InetAddress.getLocalHost();
        String ip = addr.getHostAddress();
        return ip;
    }

}
