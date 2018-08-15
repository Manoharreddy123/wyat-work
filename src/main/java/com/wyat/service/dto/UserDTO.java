package com.wyat.service.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.wyat.dao.domain.Gender;
import com.wyat.validation.PasswordMatches;
import com.wyat.validation.ValidEmail;
import com.wyat.validation.ValidPassword;


@PasswordMatches
public class UserDTO {

	
    @NotNull
  //  @Size(min = 1, message = "{Size.userDto.name}")
    private String name;

    
    @ValidPassword
    private String password;
    
    @NotNull
//    @Size(min = 1, message = "{Size.userDto.gender}")
    private Gender gender;

    @NotNull
    @Size(min = 1)
    private String matchingPassword;
    

    @NotNull
 //   @Size(min = 1, message = "{Size.userDto.phoneNuber}")
    private @NotNull @Size(min = 1, message = "{Size.userDto.phoneNuber}") String phoneNuber;

    @ValidEmail
    @NotNull
//    @Size(min = 1, message = "{Size.userDto.email}")
    private String email;

    private boolean isUsing2FA;

   
    public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private Integer role;

    public Integer getRole() {
        return role;
    }

    public void setRole(final Integer role) {
        this.role = role;
    }

   
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public String getMatchingPassword() {
        return matchingPassword;
    }

    public void setMatchingPassword(final String matchingPassword) {
        this.matchingPassword = matchingPassword;
    }

    public boolean isUsing2FA() {
        return isUsing2FA;
    }

    public void setUsing2FA(boolean isUsing2FA) {
        this.isUsing2FA = isUsing2FA;
    }

	public String getPhoneNuber() {
		return phoneNuber;
	}

	public void setPhoneNuber(String phoneNuber) {
		this.phoneNuber = phoneNuber;
	}

    
   

}
