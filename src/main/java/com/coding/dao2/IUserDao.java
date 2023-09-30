package com.coding.dao2;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coding.entity.User;





public interface IUserDao extends JpaRepository<User, Integer> {
	
	
	public User findByUsername(String username);

}
