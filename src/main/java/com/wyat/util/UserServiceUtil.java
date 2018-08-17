package com.wyat.util;

import com.wyat.dao.domain.User;
import com.wyat.service.dto.UserDTO;

public class UserServiceUtil {

	/**
	 * Converts UserDAO object to UserDTO object
	 * 
	 * @param user
	 * @return UserDTO object
	 */
/*	public static UserDTO convertDaoObjectToDto(User user) {
		UserDTO userDTO = new UserDTO();
		userDTO.setUserId(user.getUserId());
		userDTO.setUserName(user.getUserName());
		userDTO.setEmailId(user.getEmailId());
		userDTO.setImage(user.getImage());
		userDTO.setLoginDate(user.getLoginDate());
		userDTO.setCreateDate(user.getCreateDate());
		userDTO.setActiveStatus(user.getActiveStatus());
		userDTO.setImageIcon(user.getImageIcon());
		userDTO.setNotifications(user.getNotifications());
		userDTO.setProfileName(user.getProfileName());
		Set<Categories> categories = new HashSet<Categories>();
		// Set<ProfileSetting> profileSettings = user.getProfileSettings();
		
		 * for (ProfileSetting setting : profileSetting) { Categories category =
		 * setting.getCategoryId(); categories.add(category); }
		 

		// ========================
		Set<ProfileSettingDTO> profileSettingsDto = new HashSet<>();

		Iterator itr = user.getProfileSettings().iterator();
		while (itr.hasNext()) {

			ProfileSettingDTO profileSettingDto = new ProfileSettingDTO();

			ProfileSetting profileSetting = (ProfileSetting) itr.next();
			Categories category = profileSetting.getCategoryId();
			User profileUser = profileSetting.getUserId();

			CategoriesDTO categoriesDto = new CategoriesDTO();
			categoriesDto.setCategoryId(category.getCategoryId());

			UserDTO profileUserDto = new UserDTO();
			profileUser.setUserId(profileUser.getUserId());

			profileSettingDto.setCategoryId(categoriesDto);
			profileSettingDto.setUserId(profileUserDto);

			profileSettingsDto.add(profileSettingDto);

		}
		// ==============================
		userDTO.setProfileSettings(profileSettingsDto);
		return userDTO;

	}*/

	/**
	 * Converts dto object to dao object
	 * 
	 * @param userdto
	 * @return user object
	 */
	public static User convertDtoObjectTODao(UserDTO userdto) {
		User user = new User();
		user.setAddress(null);
		user.setEmailAddress(userdto.getEmail());
		user.setGender(userdto.getGender());
		user.setPassword(userdto.getPassword());
		user.setName(userdto.getName());
		user.setPhoneNumber(userdto.getPhoneNuber());

		return user;
	}

}