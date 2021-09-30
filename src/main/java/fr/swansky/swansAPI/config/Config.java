package fr.swansky.swansAPI.config;

import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Config {
    private final File file;
    private final Map<String, String> configElements = new HashMap<>();

    public Config(File file) {

        this.file = file;
    }

    public void addConfigElement(String paramName, String content) {
        this.configElements.put(paramName, content);
    }

    public File getFile() {
        return file;
    }

    public Map<String, String> getConfig() {
        return configElements;
    }
}
