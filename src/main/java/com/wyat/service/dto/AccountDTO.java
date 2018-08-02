package com.wyat.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDTO {
	
	@NotNull
	private Long mobileNum;
	
	@NotNull
	@Size(min = 2, max = 60)
	private String lastName;
	
	@NotNull(message = "{user.firstName.notNull}")
	@Size(min = 2, max = 60, message = "{user.firstName.size}")
	private String firstName;
	
	@NotNull(message = "{user.mailId.notNull}")
	@Size(min = 5, max = 60, message = "{user.mailId.size}")
	private String mailId;
	
	@NotNull(message = "{user.password.notNull}")
	@Size(min = 5, max = 60, message = "{user.password.size}")
	private String password;



}
