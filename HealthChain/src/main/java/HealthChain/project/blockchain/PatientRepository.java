package HealthChain.project.blockchain;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author VIVEK
 */
public interface PatientRepository extends MongoRepository<Patient, String> {
    // custom methods, if needed
}
