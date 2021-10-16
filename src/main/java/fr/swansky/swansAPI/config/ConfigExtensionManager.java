package fr.swansky.swansAPI.config;

import java.util.ArrayList;
import java.util.List;

public class ConfigExtensionManager {
    private final List<ConfigExtension> configExtensions = new ArrayList<>();

    public void addConfigExtension(ConfigExtension configExtension) {
        configExtensions.add(configExtension);
    }

    public List<ConfigExtension> getConfigExtensions() {
        return configExtensions;
    }

    public <T extends ConfigExtension> T findConfigByClass(Class<T> configClass) {
        for (ConfigExtension configExtension : configExtensions) {
            if (configClass.isInstance(configExtension)) {
                return configClass.cast(configExtension);
            }
        }
        return null;
    }
}
