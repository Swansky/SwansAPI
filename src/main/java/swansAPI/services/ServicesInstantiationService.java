package swansAPI.services;


import swansAPI.exception.InstanceCreationException;
import swansAPI.models.ScannedClassDetails;

import java.util.List;
import java.util.Set;

public interface ServicesInstantiationService {
    List<ScannedClassDetails> instantiateServices(Set<ScannedClassDetails> scannedClassDetailsSet) throws InstanceCreationException;

}
