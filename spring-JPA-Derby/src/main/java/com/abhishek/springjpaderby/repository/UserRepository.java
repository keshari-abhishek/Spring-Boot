package com.abhishek.springjpaderby.repository;

import org.springframework.data.repository.CrudRepository;

import com.abhishek.springjpaderby.model.UserRecord;

public interface UserRepository extends CrudRepository<UserRecord,String>{

}
