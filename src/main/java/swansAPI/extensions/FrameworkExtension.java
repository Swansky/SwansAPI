package swansAPI.extensions;


import swansAPI.IOC;

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
