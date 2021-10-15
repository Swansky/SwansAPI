package fr.swansky.swansAPI.extensions;

import fr.swansky.swansAPI.IOC;
import fr.swansky.swansAPI.classScanning.ClassScanning;

import java.util.Set;

public abstract class FrameworkExtension {

    private ClassScanning classScanning;
    private Set<Class<?>> allScanClass;
    private IOC ioc;

    public FrameworkExtension() {
    }

    public abstract void load();

    public abstract void unLoad();

    public ClassScanning getClassScanning() {
        return classScanning;
    }

    public void setClassScanning(ClassScanning classScanning) {
        this.classScanning = classScanning;
    }

    public Set<Class<?>> getAllScanClass() {
        return allScanClass;
    }

    public void setAllScanClass(Set<Class<?>> allScanClass) {
        this.allScanClass = allScanClass;
    }

    public IOC getIoc() {
        return ioc;
    }

    public void setIoc(IOC ioc) {
        this.ioc = ioc;
    }

}
