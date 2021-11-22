package swansAPI;


import swansAPI.classScanning.ClassScanning;
import swansAPI.config.ConfigExtensionManager;
import swansAPI.services.ServicesInstantiationService;

import java.util.Set;

public interface IOC {
    Class<?> getStartupClass();

    Set<Class<?>> getAllScanClass();

    ClassScanning getClassScanning();

    ServicesInstantiationService getInstantiationService();

    ConfigExtensionManager getConfigExtensionManager();

}
