package fr.swansky.swansAPI.extensions;

import fr.swansky.swansAPI.IOC;
import fr.swansky.swansAPI.classScanning.ClassScanning;

import java.util.Set;

public abstract class FrameworkExtension {

    private IOC ioc;

    public FrameworkExtension() {
    }

    public abstract void load();

    public abstract void unLoad();

    public IOC getIoc() {
        return ioc;
    }

    public void setIoc(IOC ioc) {
        this.ioc = ioc;
    }

}
