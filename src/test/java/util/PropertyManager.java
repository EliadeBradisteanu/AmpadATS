package util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyManager {
    private static final String PROPERTY_FILE_PATH = "./serenity.properties";

    private static final String PASSWORD_FOR_USERS = "password_for_users";

    private static PropertyManager instance;
    private static final Object lock = new Object();
    private static Properties properties = new Properties();

    private static final Logger logger = LoggerFactory.getLogger(PropertyManager.class);


    public static PropertyManager getInstance() {
        if (instance == null) {
            synchronized (lock) {
                instance = new PropertyManager();
                instance.loadData();
            }
        }
        return instance;
    }

    private void loadData() {
        try (InputStream input = new FileInputStream(PROPERTY_FILE_PATH)) {
            // load a properties file
            properties.load(input);
        } catch (IOException ex) {
            logger.error("Error while reading the properties file");
        }
    }

    public String getPasswordForAllUsers() {
        return properties.getProperty(PASSWORD_FOR_USERS);
    }


}
