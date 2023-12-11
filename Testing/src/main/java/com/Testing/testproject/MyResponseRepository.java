package com.Testing.testproject;
import org.springframework.data.repository.CrudRepository;


public interface MyResponseRepository extends CrudRepository<MyResponse, Long> {
    // Add custom query methods if needed
}