package com.storefetchdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/test/insert")
@RestController
public class DataTest {

	@Autowired
	private DataResponseRepository responseRepository; //inject the repository

	@GetMapping("{name}/{phoneno}/{email}/{companyname}/{password}/{conformpassword}")
	@CrossOrigin
	public DataResponse sayHello(
			@PathVariable("name") String name,
			@PathVariable("phoneno") Long phoneno,
			@PathVariable("email") String email,
			@PathVariable("companyname") String companyname,
			@PathVariable("password") String password,
			@PathVariable("conformpassword") String conformpassword) {
		DataResponse response = new DataResponse();
		response.setName(name);
		response.setPhoneno(phoneno);
		response.setEmail(email);
		response.setCompanyname(companyname);
		response.setPassword(password);
		response.setConformpassword(conformpassword);
		responseRepository.save(response);
		return response;

	}


}
