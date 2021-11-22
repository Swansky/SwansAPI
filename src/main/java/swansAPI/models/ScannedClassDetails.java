package swansAPI.models;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.*;

public class ScannedClassDetails {

    private final List<ScannedClassDetails> dependants;
    private final Map<Method, Set<Annotation>> methods;
    private Class<?> classType;
    private Set<Class<? extends  Annotation>> classAnnotations;
    private Constructor<?> constructor;

    private Object instance;


    public ScannedClassDetails(Class<?> serviceType, Class<? extends  Annotation> annotation, Constructor<?> constructor) {
        dependants = new ArrayList<>();
        methods = new HashMap<>();
        this.classType = serviceType;
        this.classAnnotations = new HashSet<>();
        this.classAnnotations.add(annotation);
        this.constructor = constructor;
    }

    public ScannedClassDetails(Class<?> serviceType, Set<Class<? extends  Annotation>> annotations, Constructor<?> constructor) {
        dependants = new ArrayList<>();
        methods = new HashMap<>();
        this.classType = serviceType;
        this.classAnnotations = annotations;
        this.constructor = constructor;
    }

    public Map<Method, Set<Annotation>> getMethods() {
        return methods;
    }

    public void addMethod(Method method, Set<Annotation> annotation) {

        this.methods.put(method, annotation);
    }

    public Class<?> getClassType() {
        return classType;
    }

    public void setClassType(Class<?> classType) {
        this.classType = classType;
    }

    public Set<Class<? extends  Annotation>> getClassAnnotations() {
        return classAnnotations;
    }


    public Constructor<?> getConstructor() {
        return constructor;
    }

    public void setConstructor(Constructor<?> constructor) {
        this.constructor = constructor;
    }

    public Object getInstance() {
        return instance;
    }

    public void setInstance(Object instance) {
        this.instance = instance;
    }

    public List<ScannedClassDetails> getDependants() {
        return Collections.unmodifiableList(this.dependants);
    }

    public void addDependantService(ScannedClassDetails scannedClassDetails) {
        this.dependants.add(scannedClassDetails);
    }


    @Override
    public int hashCode() {
        if (this.classType == null) {
            return super.hashCode();
        }

        return this.classType.hashCode();
    }
}
