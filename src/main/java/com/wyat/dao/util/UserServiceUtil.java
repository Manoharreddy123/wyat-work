package com.wyat.dao.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.CollectionUtils;

import com.wyat.dao.domain.Categories;
import com.wyat.dao.domain.ProfileSetting;
import com.wyat.dao.domain.User;
import com.wyat.service.dto.CategoriesDTO;
import com.wyat.service.dto.ProfileSettingDTO;
import com.wyat.service.dto.UserDTO;

public class UserServiceUtil {

	/**
	 * Converts List of UserDAO objects to UserDTO objects
	 * 
	 * @param users
	 * @return List of UserDTO objects
	 */
	public static List<UserDTO> convertDaoListToDto(List<User> users) {
		List<UserDTO> userDTO = new ArrayList<UserDTO>();

		if (CollectionUtils.isNotEmpty(users)) {
			for (User user : users) {
				UserDTO userDto = new UserDTO();
				userDto.setUserId(user.getUserId());
				userDto.setActiveStatus(user.getActiveStatus());
				userDto.setEmailId(user.getEmailId());
				userDto.setLoginDate(user.getLoginDate());
				userDto.setUserName(user.getUserName());
				userDto.setImage(user.getImage());
				userDto.setCreateDate(user.getCreateDate());
	
				userDto.setNotifications(user.getNotifications());
				userDto.setProfileName(user.getProfileName());
				userDto.setProfileName(user.getProfileName());
				Set<Categories> categories = new HashSet<Categories>();

				/*
				 * for (ProfileSetting setting : profileSetting) { Categories category =
				 * setting.getCategoryId(); categories.add(category); }
				 */

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
				userDto.setProfileSettings(profileSettingsDto);
				userDTO.add(userDto);
			}
		}
		return userDTO;
	}

	/**
	 * Converts UserDAO object to UserDTO object
	 * 
	 * @param user
	 * @return UserDTO object
	 */
	public static UserDTO convertDaoObjectToDto(User user) {
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
		/*
		 * for (ProfileSetting setting : profileSetting) { Categories category =
		 * setting.getCategoryId(); categories.add(category); }
		 */

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

	}

	/**
	 * Converts list of user dto objects to dao list
	 * 
	 * @param userDtoList
	 * @return List of user objects
	 */
	public static List<User> convertDtoListTODao(List<UserDTO> userDtoList) {
		List<User> users = new ArrayList<User>();
		if (CollectionUtils.isNotEmpty(userDtoList)) {
			for (UserDTO userlist : userDtoList) {
				User user = new User();
				user.setUserId(userlist.getUserId());
				user.setActiveStatus(userlist.getActiveStatus());
				user.setEmailId(userlist.getEmailId());
				user.setLoginDate(userlist.getLoginDate());
				user.setCreateDate(userlist.getCreateDate());
				user.setUserName(userlist.getUserName());
				user.setImage(userlist.getImage());
/*				UserRole userRole = new UserRole();
				userRole.setCreatedDate(userlist.getRole().getCreatedDate());
				userRole.setRole(userlist.getRole().getRole());
				userRole.setRoleId(userlist.getRole().getRoleId());
				user.setRole(userRole);*/
				user.setNotifications(userlist.getNotifications());
				user.setProfileName(userlist.getProfileName());
				Set<ProfileSetting> profileSet = new HashSet<ProfileSetting>();
				/*
				 * for (Categories category:userlist.getProfileSettings()) { ProfileSetting
				 * profileSetting = new ProfileSetting();
				 * profileSetting.setCategoryId(category);
				 * //profileSetting.setUserId(userlist.getUserId());
				 * profileSet.add(profileSetting); }
				 */
				user.setProfileSettings(user.getProfileSettings());
				users.add(user);
			}
		}
		return users;
	}

	/**
	 * Converts dto object to dao object
	 * 
	 * @param userdto
	 * @return user object
	 */
	public static User convertDtoObjectTODao(UserDTO userdto) {
		User user = new User();
		user.setUserId(userdto.getUserId());
		user.setUserName(userdto.getUserName());
		user.setEmailId(userdto.getEmailId());
		user.setLoginDate(userdto.getLoginDate());
		user.setCreateDate(userdto.getCreateDate());
		user.setImage(userdto.getImage());
		user.setImageIcon(userdto.getImageIcon());
		user.setActiveStatus(userdto.getActiveStatus());
		user.setNotifications(userdto.getNotifications());
		user.setProfileName(userdto.getProfileName());
		// ========================
		Set<ProfileSetting> profileSettings = new HashSet<>();

		Iterator itr = userdto.getProfileSettings().iterator();
		while (itr.hasNext()) {

			ProfileSetting profileSetting = new ProfileSetting();

			ProfileSettingDTO profileSettingDto = (ProfileSettingDTO) itr.next();
			CategoriesDTO categoryDto = profileSettingDto.getCategoryId();
			UserDTO profileUserDto = profileSettingDto.getUserId();

			Categories categories = new Categories();
			categories.setCategoryId(categoryDto.getCategoryId());
			profileUserDto.setUserId(userdto.getUserId());
			User profileUser = new User();

			profileUser.setUserId(profileUserDto.getUserId());

			profileSetting.setCategoryId(categories);
			profileSetting.setUserId(profileUser);

			profileSettings.add(profileSetting);

		}

		// ========================

		/*
		 * for (Categories category :userdto.getProfileSettings()) { ProfileSetting
		 * profileSetting = new ProfileSetting();
		 * profileSetting.setCategoryId(category); profileSetting.setUserId(user);
		 * profileSet.add(profileSetting); }
		 */
		user.setProfileSettings(profileSettings);
		return user;
	}

}