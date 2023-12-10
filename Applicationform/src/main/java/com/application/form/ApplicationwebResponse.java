package com.application.form;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/test/insert")
@RestController
public class ApplicationwebResponse {

    @Autowired
    private ApplicationRepository applicationRepository; //inject the repository
   
    @GetMapping("{name}/{age}/{email}/{address}")
    @CrossOrigin
    public ApplicationforEntity sayHello(
            @PathVariable("name") String name,
            @PathVariable("age") int age,
            @PathVariable("email") String email,
            @PathVariable("address") String address) {
    	ApplicationforEntity response = new ApplicationforEntity();
        response.setName(name);
        response.setAge(age);
        response.setEmail(email);
        response.setAddress(address);
        applicationRepository.save(response);
        return response;

    }


}
