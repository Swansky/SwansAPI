package fr.swansky.swansAPI.services;

import fr.swansky.swansAPI.exception.InstanceCreationException;
import fr.swansky.swansAPI.models.ScannedClassDetails;

import java.util.List;
import java.util.Set;

public interface ServicesInstantiationService {
    List<ScannedClassDetails> instantiateServices(Set<ScannedClassDetails> scannedClassDetailsSet) throws InstanceCreationException;

}
