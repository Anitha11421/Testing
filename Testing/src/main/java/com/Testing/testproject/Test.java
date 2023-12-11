package com.Testing.testproject;

import org.springframework.beans.factory.annotation.Autowired;//This import statement brings in the @Autowired annotation.
import org.springframework.web.bind.annotation.*;//This import statement is used to bring in several annotations and related classes used in Spring Web application

@RequestMapping("/api/test/insert")                                             // annotation define the base URL path ("/api/test/insert")
@RestController                                                                 // can handle HTTP requests
public class Test {                                                            //This is class name

    @Autowired                                                                 // a Spring Data JPA repository used to interact with a database.

    private MyResponseRepository responseRepository;                             // Inject the repository

    @GetMapping("{name}/{description}")                                            //This method handles HTTP GET requests with a dynamic path. 
                                                                               //The path contains two placeholders enclosed in curly braces, "{name}" and "{description}", which are used as path variables.
    @CrossOrigin                                                              //Cross-Origin Resource Sharing (CORS) for this endpoint, enabling it to be accessed from different domains.
    public MyResponse sayHello(                                              //the handler method for the GET request. It takes two path variables, "name" and "description," as method parameters.
    		@PathVariable("name") String name,                                    // "name" provided in the path variables are set in the MyResponse instance.
    		@PathVariable("description") String description) {                      // "description" provided in the path variables are set in the MyResponse instance.
        MyResponse response = new MyResponse(); 
                                                      //A new instance of the MyResponse class is created, and two properties, "name" and "description," are set with values passed as method parameters (name and description).
                                                       //This code is constructing a new MyResponse object and populating it with the data received as path variables from the HTTP request.
        response.setName(name);//
        response.setDescription(description);
        responseRepository.save(response);                                         //This line saves the MyResponse object to the repository.
                                                                                   //It's assumed that MyResponseRepository is an interface that extends CRUDRepository or a similar interface for interacting with a database.
        return response;                                                             //object return the as the HTML response.
        }
}