package com.application.form;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Retrive {
	 @Autowired
	    private ApplicationRepository applicationRepository;

	 @GetMapping("/search/{name}")
	    public List<ApplicationforEntity> search(@PathVariable String name) {		
	        return applicationRepository.searchByName(name);
	    }
}
