package com.store.data.intosql;
import org.springframework.data.repository.CrudRepository;


public interface StudentRepository extends CrudRepository<StudentResponse, Long> {
	
    // Add custom query methods if needed
}