package com.wyat.service.api;

import org.springframework.stereotype.Service;

import com.wyat.dao.domain.User;
import com.wyat.service.dto.UserDTO;
import com.wyat.service.exception.UserAlreadyExistException;

@Service
public interface IUserService {

    User registerNewUserAccount(UserDTO accountDto) throws UserAlreadyExistException;

    void saveRegisteredUser(User user);

    User findUserByEmail(String email);



}
