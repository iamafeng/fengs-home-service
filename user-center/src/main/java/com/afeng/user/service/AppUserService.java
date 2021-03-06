package com.afeng.user.service;

import java.util.Map;
import java.util.Set;

import com.afeng.model.common.Page;
import com.afeng.model.user.AppUser;
import com.afeng.model.user.LoginAppUser;
import com.afeng.model.user.SysRole;

public interface AppUserService {

	void addAppUser(AppUser appUser);

	void updateAppUser(AppUser appUser);

	LoginAppUser findByUsername(String username);

	AppUser findById(Long id);

	void setRoleToUser(Long id, Set<Long> roleIds);

	void updatePassword(Long id, String oldPassword, String newPassword);

	Page<AppUser> findUsers(Map<String, Object> params);

	Set<SysRole> findRolesByUserId(Long userId);

	void bindingPhone(Long userId, String phone);
}
