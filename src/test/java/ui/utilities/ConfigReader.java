package ui.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    static {

        String path = "configuration.properties";

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(fileInputStream);

            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Create  method to READ
    //This method will get the KEY and retuen the VALUE
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    //TESTING IF OUR LOGIC WORKS
    public static void main(String[] args) {
        System.out.println(properties.getProperty("browser"));
    }
}
