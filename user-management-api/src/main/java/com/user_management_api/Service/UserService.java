package com.user_management_api.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.user_management_api.Model.UserData;
import com.user_management_api.Repositery.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

    // Create a new user
    public UserData createUser(UserData userData) {
        return userRepo.save(userData);
    }

    // Get all users
    public List<UserData> getAllUsers() {
        return userRepo.findAll();
    }

    // Get user by ID
    public Optional<UserData> getUserById(Long id) {
        return userRepo.findById(id);
    }

    // Update user by ID
    public UserData updateUser(Long id, UserData userDetails) {
        Optional<UserData> userData = userRepo.findById(id);
        if (userData.isPresent()) {
        	UserData updatedUser = userData.get();
            updatedUser.setName(userDetails.getName());
            updatedUser.setEmail(userDetails.getEmail());
            return userRepo.save(updatedUser);
        }
        return null;
    }

    // Delete user by ID
    public void deleteUser(Long id) {
    	userRepo.deleteById(id);
    }
}
