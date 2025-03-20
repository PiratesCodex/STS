package com.user_management_api.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.user_management_api.Model.UserData;
import com.user_management_api.Service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	    @Autowired
	    private UserService userService;

	    // Create a new user
	    @PostMapping
	    public ResponseEntity<UserData> createUser(@RequestBody UserData userData) {
	    	UserData createdUser = userService.createUser(userData);
	        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
	    }

	    // Get all users
	    @GetMapping
	    public List<UserData> getAllUsers() {
	        return userService.getAllUsers();
	    }

	    // Get user by ID
	    @GetMapping("/{id}")
	    public ResponseEntity<UserData> getUserById(@PathVariable Long id) {
	        Optional<UserData> userData = userService.getUserById(id);
	        return userData.map(ResponseEntity::ok)
	                   .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	    }

	    // Update user by ID
	    @PutMapping("/{id}")
	    public ResponseEntity<UserData> updateUser(@PathVariable Long id, @RequestBody UserData userData) {
	    	UserData updatedUser = userService.updateUser(id, userData);
	        return updatedUser != null ? ResponseEntity.ok(updatedUser) : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	    }

	    // Delete user by ID
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
	        userService.deleteUser(id);
	        return ResponseEntity.ok().build();

	    }
	    
}
