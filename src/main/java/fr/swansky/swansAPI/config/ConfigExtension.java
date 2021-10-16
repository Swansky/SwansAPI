package fr.swansky.swansAPI.config;

public interface ConfigExtension {

    Class<? extends ConfigExtension> getConfigClass();
}
