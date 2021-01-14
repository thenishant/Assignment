package client;

import java.io.IOException;
import java.util.Properties;

import static utils.Utils.readPropertiesFile;

public class BaseClient {
    private Properties properties = null;

    private Properties readProperty() {
        {
            try {
                properties = readPropertiesFile("src/main/resources/config.properties");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return properties;
    }

    public String getLatestDataHost() {
        return readProperty().getProperty("LATEST_DATA_HOST");
    }

    public String getPasteDataHost() {
        return readProperty().getProperty("PAST_DATA_HOST");
    }
}
