package fr.swansky.swansAPI.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import fr.swansky.swansAPI.exception.ConfigException;
import fr.swansky.swansAPI.utils.Pair;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ConfigLoader {
    private static ConfigLoader configLoader;
    private final GsonBuilder builder;
    private final Gson gson;

    public ConfigLoader() {
        this.builder = new GsonBuilder();
        this.gson = builder.create();
    }

    private static ConfigLoader getInstance() {
        if (configLoader == null) {
            configLoader = new ConfigLoader();
        }
        return configLoader;
    }

    public Config loadConfig(String path) throws ConfigException {
        try {
            final Path configPath = Paths.get(path);
            final File file = configPath.toFile();

            final Config config = new Config(file);
            final BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = bufferedReader.readLine();
            while (line != null) {
                Pair<String, String> lineConfig = getLineConfig(line);
                if (lineConfig.pairIsNotNull()) {
                    config.addConfigElement(lineConfig.getKey(), lineConfig.getValue());
                }
                line = bufferedReader.readLine();
            }
            bufferedReader.close();

            return config;
        } catch (Exception e) {
            throw new ConfigException("Impossible to load config", e);
        }
    }

    private Pair<String, String> getLineConfig(String line) {
        if (line.isBlank() || !line.contains("=")) {
            return Pair.emptyPair();
        }
        String[] lineArgs = line.split("=", 2);
        String paramName = lineArgs[0];
        String content = lineArgs[1];

        return new Pair<>(paramName, content);
    }
}
