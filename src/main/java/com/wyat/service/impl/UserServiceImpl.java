package com.wyat.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wyat.dao.domain.User;
import com.wyat.dao.repository.UserRepository;
import com.wyat.service.api.IUserService;
import com.wyat.service.dto.UserDTO;
import com.wyat.service.exception.UserAlreadyExistException;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User findUserByEmail(String email) {
		return userRepository.findByEmailId(email);
	}

	@Override
	public User registerNewUserAccount(UserDTO accountDto) throws UserAlreadyExistException {
		//return userRepository.save(accountDto);
		return null;
	}

	@Override
	public void saveRegisteredUser(User user) {
		// TODO Auto-generated method stub
		
	}

}
