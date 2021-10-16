package fr.swansky.swansAPI.services;

import fr.swansky.swansAPI.exception.InstanceCreationException;
import fr.swansky.swansAPI.models.ScannedClassDetails;

public interface ObjectInstantiationService {

    void createInstanceService(ScannedClassDetails scannedClassDetails, Object... params) throws InstanceCreationException;
}
