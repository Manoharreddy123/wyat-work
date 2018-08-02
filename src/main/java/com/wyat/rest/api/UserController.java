package com.wyat.rest.api;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wyat.dao.domain.Account;
import com.wyat.dao.repository.AccountRepository;
import com.wyat.dao.repository.UserRepository;
import com.wyat.service.dto.AccountDTO;

import javax.validation.Valid;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
	private AccountRepository repository;

	@PostMapping("/register")
	@Transactional
	public Account save(@RequestBody @Valid AccountDTO user) {
		
		
		Integer token = new Random().nextInt(10000);

		
	/*	return repository.saveAndFlush(new Account(
			user.getMobileNum(),
			user.getFirstName(),
			user.getLastName(),
			user.getMailId(),
			user.getPassword(),
			LocalDate.now(),
			LocalTime.now(),
			false));*/
		
		return null;
		
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public List<String> handleValidationExceptions(MethodArgumentNotValidException ex) {
		return ex.getBindingResult()
			.getAllErrors().stream()
			.map(ObjectError::getDefaultMessage)
			.collect(Collectors.toList());
	}
	public static void main(String[] args) {
		Random rand = new Random();
		System.out.printf("%04d%n", rand.nextInt(10000));
		
		int token = new Random().nextInt(10000);
		System.out.println(token);
	}
	
}
