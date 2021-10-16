package fr.swansky.swansAPI;

import fr.swansky.swansAPI.classScanning.ClassScanning;
import fr.swansky.swansAPI.config.ConfigExtensionManager;
import fr.swansky.swansAPI.services.ServicesInstantiationService;


import java.util.Set;

public interface IOC {
    Class<?> getStartupClass();

    Set<Class<?>> getAllScanClass();

    ClassScanning getClassScanning();

    ServicesInstantiationService getInstantiationService();

    ConfigExtensionManager getConfigExtensionManager();

}
