package com.user_management_api.Repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user_management_api.Model.UserData;

public interface UserRepo extends JpaRepository<UserData, Long> {

}
