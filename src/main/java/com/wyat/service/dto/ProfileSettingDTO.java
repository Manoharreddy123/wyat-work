package com.wyat.service.dto;

public class ProfileSettingDTO {
	
	public ProfileSettingDTO() {}

	private int profileId;
	private CategoriesDTO categoryId;
	private UserDTO userId;

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public CategoriesDTO getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(CategoriesDTO categoryId) {
		this.categoryId = categoryId;
	}

	public UserDTO getUserId() {
		return userId;
	}

	public void setUserId(UserDTO userId) {
		this.userId = userId;
	}

	public ProfileSettingDTO(CategoriesDTO categoryId, UserDTO userId) {
		this.categoryId = categoryId;
		this.userId = userId;
	}

}
