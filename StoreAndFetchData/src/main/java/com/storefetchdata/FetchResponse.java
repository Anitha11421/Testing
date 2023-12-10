package com.storefetchdata;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FetchResponse {
	 @Autowired
	    private DataResponseRepository responseRepository;

    @GetMapping("/search/{email}")
    public List<DataResponse> search(@PathVariable String email) {		
        return responseRepository.searchByEmail(email);
    }
}

