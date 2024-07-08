package utils;

import java.io.IOException;

public class FileReaderManager {

    private static FileReaderManager fileReaderManager = new FileReaderManager();
    private static ConfigProperty configProperty;

    private FileReaderManager() {
    }

    public static FileReaderManager getInstance() {
        return fileReaderManager;
    }

    public ConfigProperty getConfigReader() throws IOException {
        return (configProperty == null) ? new ConfigProperty() : configProperty;
    }
}
