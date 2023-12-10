package com.store.data.intosql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/test/insert")
@RestController
public class StudentTest {

    @Autowired
    private StudentRepository responseRepository; //inject the repository

    @GetMapping("{name}/{age}/{email}/{address}")
    @CrossOrigin
    public StudentResponse sayHello(
            @PathVariable("name") String name,
            @PathVariable("age") Long age,
            @PathVariable("email") String email,
            @PathVariable("address") String address) {
    	StudentResponse response = new StudentResponse();
        response.setName(name);
        response.setAge(age);
        response.setEmail(email);
        response.setAddress(address);
        responseRepository.save(response);
        return response;

    }


}
