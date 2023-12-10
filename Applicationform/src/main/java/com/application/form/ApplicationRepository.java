package com.application.form;
import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface ApplicationRepository extends CrudRepository<ApplicationforEntity, Long> {

	List<ApplicationforEntity> searchByName(String name);

	
}