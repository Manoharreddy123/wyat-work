package com.wyat.dao.api.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wyat.dao.api.UserDAO;
import com.wyat.dao.domain.User;
import com.wyat.dao.repository.UserRepository;

@Service
public class UserDAOImpl implements UserDAO{

	private static Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> getUsers() {
		logger.info("UserDAOImpl :: getUsers :: Get list of users");
		return userRepository.findAll();
	}
	
	@Override
	public User updateUser(User user) {
		logger.info("UserDAOImpl :: updateUser :: Updating user");
			return userRepository.save(user);
	}
	@Override
	public int deleteUser(int userId) {
		logger.info("UserDAOImpl :: deleteUser :: Deleting user");
		return userRepository.deleteUser(userId);
	}

	@Override
	public long getUserCount() {
		return userRepository.count();
	}
	
	@Override
	public void saveUser(User user) {
		userRepository.save(user);

	}

	@Override
	public User findByEmailId(String emailId) {

		return userRepository.findByEmailId(emailId);
	}


}
