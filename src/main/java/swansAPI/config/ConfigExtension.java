package swansAPI.config;

public interface ConfigExtension {

    Class<? extends ConfigExtension> getConfigClass();
}
