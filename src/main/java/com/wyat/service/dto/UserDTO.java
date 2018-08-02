package com.wyat.service.dto;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.wyat.validation.ValidEmail;

public class UserDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int userId;
	private String emailId;
	private String userName;
	private Timestamp loginDate;
	private String activeStatus;
	private Timestamp createDate;
	private String image;
	private byte[] imageIcon;
	private String notifications;
	private String profileName;
	private Set<ProfileSettingDTO> profileSettings = new HashSet<>();

	public Set<ProfileSettingDTO> getProfileSettings() {
		return profileSettings;
	}

	public void setProfileSettings(Set<ProfileSettingDTO> profileSettings) {
		this.profileSettings = profileSettings;
	}

	public byte[] getImageIcon() {
		return imageIcon;
	}

	public void setImageIcon(byte[] imageIcon) {
		this.imageIcon = imageIcon;
	}

	/**
	 * Returns user id
	 * 
	 * @return
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * Sets user id
	 * 
	 * @param userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * Sets user email
	 * 
	 * @return
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * Returns user email
	 * 
	 * @param emailId
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * Returns user created date
	 * 
	 * @return
	 */
	public Timestamp getLoginDate() {
		return loginDate;
	}

	/**
	 * Sets user role
	 * 
	 * @param loginDate
	 */
	public void setLoginDate(Timestamp loginDate) {
		this.loginDate = loginDate;
	}


	/**
	 * Returns user active status
	 * 
	 * @return
	 */
	public String getActiveStatus() {
		return activeStatus;
	}

	/**
	 * Sets user active status
	 * 
	 * @param activeStatus
	 */
	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNotifications() {
		return notifications;
	}

	public void setNotifications(String notifications) {
		this.notifications = notifications;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	/*
	 * @NotNull
	 * 
	 * @Size(min = 1, message = "{Size.userDto.firstName}") private String
	 * firstName;
	 * 
	 * @NotNull
	 * 
	 * @Size(min = 1, message = "{Size.userDto.lastName}") private String lastName;
	 * 
	 * private String password;
	 * 
	 * @ValidEmail
	 * 
	 * @NotNull
	 * 
	 * @Size(min = 1, message = "{Size.userDto.email}") private String email;
	 * 
	 * public String getEmail() { return email; }
	 * 
	 * public void setEmail(final String email) { this.email = email; }
	 * 
	 * public String getFirstName() { return firstName; }
	 * 
	 * public void setFirstName(final String firstName) { this.firstName =
	 * firstName; }
	 * 
	 * public String getLastName() { return lastName; }
	 * 
	 * public void setLastName(final String lastName) { this.lastName = lastName; }
	 * 
	 * public String getPassword() { return password; }
	 * 
	 * public void setPassword(final String password) { this.password = password; }
	 */

}
