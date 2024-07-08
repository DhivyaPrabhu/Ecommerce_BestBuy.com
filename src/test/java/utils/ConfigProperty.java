package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperty {

    private Properties prop;

    public ConfigProperty() throws IOException {
        File profile = new File("D:\\Intelli workspace\\BestBuy.com\\src\\test\\java\\utils\\config.properties");
        try (FileInputStream fis = new FileInputStream(profile)) {
            prop = new Properties();
            prop.load(fis);
        }
    }

    public String getBrowser() {
        return prop.getProperty("browser");
    }

    public String getUrl() {
        return prop.getProperty("url");
    }
}
