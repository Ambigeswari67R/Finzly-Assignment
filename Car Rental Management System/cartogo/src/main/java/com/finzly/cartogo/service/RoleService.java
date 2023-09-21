package com.finzly.cartogo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.cartogo.dao.RoleDao;
import com.finzly.cartogo.entity.Role;


@Service
public class RoleService {
	@Autowired
	RoleDao roleDao;

	public List<Role> getRole() {
		return roleDao.getRole();
	}

	public String saveRole(Role role) {
		return roleDao.saveRole(role);
	}

	public String deleteRole(Long id) {
		return roleDao.deleteRole(id);
	}

	public List<Role> getRoleById(Long id) {
		return roleDao.getRoleById(id);
	}

	public String editRole(Long id, Role role) {
		return roleDao.editRole(id, role);
	}

	public List<Role> getRoleByName(String name) {
		return roleDao.getRoleByName(name);
	}

}
