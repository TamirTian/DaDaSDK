package top.inject.dada;

import top.inject.dada.config.Config;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class ConfigProvider {
    private static final Properties properties;

    static {
        URL url = ClassLoader.getSystemResource("test.properties");
        try {
            properties = new Properties();
            properties.load(url.openStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Config get() {
        return new Config(properties.getProperty("app.key"), properties.getProperty("app.secret"), true);
    }

    public static Long getSourceId() {
        return Long.valueOf(properties.getProperty("source.id"));
    }

    public static String getShopNo() {
        return properties.getProperty("shopNo");
    }

    public static String getCallback() {
        return properties.getProperty("callback");
    }
}
