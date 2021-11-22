package swansAPI.classScanning;



import swansAPI.models.ScannedClassDetails;

import java.lang.annotation.Annotation;
import java.util.Set;

public interface ClassScanning {
    Set<ScannedClassDetails> scanClassesByAnnotations(Set<Class<?>> classes,
                                                      Set<Class<? extends Annotation>> annotations);
    Set<ScannedClassDetails> scanClassesAndMethodsByAnnotations(Set<Class<?>> classes,
                                                                Set<Class<? extends Annotation>> annotationsClasses,
                                                                Set<Class<? extends Annotation>> annotationsMethods);
    Set<ScannedClassDetails> scanClassesByAnnotation(Set<Class<?>> classes,
                                                     Class<? extends Annotation> annotations);
}
