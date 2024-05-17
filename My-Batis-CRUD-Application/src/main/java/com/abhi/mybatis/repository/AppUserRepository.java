package com.abhi.mybatis.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.abhi.mybatis.model.AppUser;

@Component
public interface AppUserRepository {

	List<AppUser> findAllUsers();
	
	Optional<AppUser> findUserById(Integer id);
	
	int deleteUserById(Integer id);
	
	int updateUser(AppUser appUser);
	
	int insertUser(AppUser appUser);
}
