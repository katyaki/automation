package selenide.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesCache {

    private final Properties configProp = new Properties();
    private static final PropertiesCache INSTANCE = new PropertiesCache();

    private PropertiesCache() {

        InputStream in = this.getClass().getClassLoader().getResourceAsStream("test.properties"); //path to the file from src
        try {
            configProp.load(in);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public static String getProperty(String key){
        return INSTANCE.configProp.getProperty(key);

    }
}
