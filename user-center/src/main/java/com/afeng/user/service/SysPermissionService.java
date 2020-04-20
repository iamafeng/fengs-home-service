package com.afeng.user.service;

import java.util.Map;
import java.util.Set;

import com.afeng.model.common.Page;
import com.afeng.model.user.SysPermission;

public interface SysPermissionService {

	/**
	 * 根绝角色ids获取权限集合
	 * 
	 * @param roleIds
	 * @return
	 */
	Set<SysPermission> findByRoleIds(Set<Long> roleIds);

	void save(SysPermission sysPermission);

	void update(SysPermission sysPermission);

	void delete(Long id);

	Page<SysPermission> findPermissions(Map<String, Object> params);
}
