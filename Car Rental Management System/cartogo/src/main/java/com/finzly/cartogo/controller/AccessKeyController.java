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

import com.finzly.cartogo.entity.AccessKey;
import com.finzly.cartogo.entity.Role;
import com.finzly.cartogo.service.AccessKeyService;

@RestController
@RequestMapping("/accesskey")
public class AccessKeyController {
	@Autowired
	private AccessKeyService accessKeyService;

	// Ambika - description
	@RequestMapping("description")
	public String display() {
		return "Car Rental Management System \n" + "CAR2GO \n" + "AccessKey Api";
	}

	// Ambika - get accesskey information
	@GetMapping("/getaccesskey")
	public List<AccessKey> getAccessKey() {
		return accessKeyService.getAccessKey();
	}

	// Ambika - insert accesskey into table
	@PostMapping("/insertaccesskey")
	public String saveAccessKey(@RequestBody AccessKey accessKey) {
		return accessKeyService.saveAccessKey(accessKey);
	}

	// Ambika get accesskey by id
	@GetMapping("/getaccesskey/{id}")
	public List<AccessKey> getAccessKeyById(@PathVariable Long id) {
		return accessKeyService.getAccessKeyById(id);
	}

	// Ambika edit accesskey by id
	@PutMapping("/editaccesskey/{id}")
	public String editAccessKeyById(@PathVariable Long id, @RequestBody AccessKey accessKey) {
		return accessKeyService.editAccessKeyById(id, accessKey);
	}

	// Ambika delete accesskey by id
	@DeleteMapping("/deleteaccesskey/{id}")
	public String deleteAccessKeyById(@PathVariable Long id) {
		return accessKeyService.deleteAccessKeyById(id);
	}

	// Ambika get accesskey by car package
	@GetMapping("/getaccesskeybypackage/{carPackage}")
	public List<AccessKey> getAccessKeyByCarPackage(@PathVariable String carPackage) {
		return accessKeyService.getAccessKeyByCarPackage(carPackage);
	}

	// Ambika get accesskey by hour
	@GetMapping("/getaccesskeybyhour/{hours}")
	public List<AccessKey> getAccessKeyByHours(@PathVariable Integer hours) {
		return accessKeyService.getAccessKeyByHours(hours);
	}

}
