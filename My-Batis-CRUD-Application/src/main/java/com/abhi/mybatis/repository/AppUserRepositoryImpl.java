package com.abhi.mybatis.repository;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.abhi.mybatis.model.AppUser;

@Component
public class AppUserRepositoryImpl implements AppUserRepository{
	
	@Autowired
	private SqlSession sqlSession; 

	@Override
	public List<AppUser> findAllUsers() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("queryFindAllUsers");
	}

	@Override
	public Optional<AppUser> findUserById(Integer id) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("queryFindUserById", id);
	}

	@Override
	public int deleteUserById(Integer id) {
		// TODO Auto-generated method stub
		return sqlSession.delete("queryDeleteUserById", id);
	}

	@Override
	public int updateUser(AppUser appUser) {
		// TODO Auto-generated method stub
		return sqlSession.update("queryUpdateUser", appUser);
	}

	@Override
	public int insertUser(AppUser appUser) {
		// TODO Auto-generated method stub
		return sqlSession.insert("queryInsertUser", appUser);
	}

}
