package com.dpoint.tutorial.demo.controller;

import com.dpoint.tutorial.demo.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class IndexController {


    @GetMapping("/abcd")
    public String firstApi() {
        return "welcome to firstApi";
    }

    @GetMapping("showhealth")
    public String randomly() {
        return "Application is up";
    }

    // get call, query parameters
    @GetMapping("/data")
    public String getData(@RequestParam("param1") String param1, @RequestParam("param2") String param2) {
        // Process the query parameters and return the response
        return "Received query parameters: param1=" + param1 + ", param2=" + param2;
    }

    @GetMapping("/api/data")
    public String getData() {
        // Process and return the response
        return "Data retrieved successfully";
    }

    // path variable
    @GetMapping("/api/users-int/{id}")
    public String getUserById(@PathVariable("id") Long id) {
        // Process and return the user with the given id
        return "User Long ID: " + id;
    }

    @GetMapping("/api/users-str/{ids}")
    public String getUserByStringId(@PathVariable("ids") String id) {
        // Process and return the user with the given id
        return "User String ID: " + id;
    }


    @PostMapping("/api/users")
    public User createUser(@RequestBody User user) {
        // Create the user using the provided data
        // ...
        return user;
    }

    @PutMapping("/api/users/{id}")
    public String updateUser(@PathVariable("id") Long id, @RequestBody User updatedUser) {
        // Update the user with the given id using the provided data
        // ...
        return "User updated successfully";
    }

    @DeleteMapping("/api/users/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        // Delete the user with the given id
        // ...
        return "User deleted successfully";
    }

}

// APi:
// 1. GET Request: Retrieves data or information from a specified resource.
// 2. POST Request: Submits data or information to be processed and creates a new resource.
// 3. PUT Request: Updates data or information of an existing resource.
// 4. DELETE Request: Deletes a specified resource.