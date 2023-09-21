package com.finzly.cartogo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.cartogo.entity.Car;
import com.finzly.cartogo.entity.Role;
import com.finzly.cartogo.service.RoleService;

@RestController
@RequestMapping("role")
public class RoleController {
	@Autowired
	private RoleService roleService;

	// Ambika - description
	@RequestMapping("description")
	public String display() {
		return "Car Rental Management System \n" + "CAR2GO \n" + "Role Information";
	}

	// Ambika get role list
	@GetMapping("/getroles")
	public List<Role> getRole() {
		return roleService.getRole();
	}

	// Ambika insert role into table
	@PostMapping("/insertroles")
	public String saveRole(@RequestBody Role role) {
		return roleService.saveRole(role);
	}

	// Ambika delete role into table
	@DeleteMapping("/deleterole/{id}")
	public String deleteRole(@PathVariable Long id) {
		return roleService.deleteRole(id);
	}

	//  Ambika Get role by id
	@GetMapping("/getrole/{id}")
	public List<Role> getRoleById(@PathVariable Long id) {
		return roleService.getRoleById(id);
	}

	// Ambika edit role by id
	@PutMapping("/editrole/{id}")
	public String editRole(@PathVariable Long id, @RequestBody Role role) {
		return roleService.editRole(id, role);
	}

	// Ambika Get role by name
	@GetMapping("/getrolebyname/{name}")
	public List<Role> getRoleByName(@PathVariable String name) {
		return roleService.getRoleByName(name);
	}

}
