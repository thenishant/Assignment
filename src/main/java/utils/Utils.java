package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utils {
    public static Properties readPropertiesFile(String fileName) throws IOException {
        FileInputStream file = null;
        Properties properties = null;
        try {
            file = new FileInputStream(fileName);
            // create Properties class object
            properties = new Properties();
            // load properties file into it
            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert file != null;
            file.close();
        }
        return properties;
    }
}
