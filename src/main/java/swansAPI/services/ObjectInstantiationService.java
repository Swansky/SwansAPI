package swansAPI.services;


import swansAPI.exception.InstanceCreationException;
import swansAPI.models.ScannedClassDetails;

public interface ObjectInstantiationService {

    void createInstanceService(ScannedClassDetails scannedClassDetails, Object... params) throws InstanceCreationException;
}
