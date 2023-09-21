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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.cartogo.entity.AccessKey;
import com.finzly.cartogo.entity.CarPackage;
import com.finzly.cartogo.service.CarPackageService;

@RestController
@RequestMapping("/carpackage")
public class CarPackageController {
	@Autowired
	private CarPackageService carPackageService;

	// Ambika Description
	@RequestMapping("description")
	public String display() {
		return "Car Rental Management System \n" + "CAR2GO \n" + "Car Package Information";
	}

	// Ambika - get carpackage information
	@GetMapping("/getcarpackage")
	public List<CarPackage> getCarPackage() {
		return carPackageService.getCarPackage();
	}

	// Ambika - insert CarPackage into table
	@PostMapping("/insertcarpackage")
	public String saveCarPackage(@RequestBody CarPackage carPackage) {
		return carPackageService.saveCarPackage(carPackage);
	}

	// Ambika -get accesskey by id
	@GetMapping("/getcarpackage/{id}")
	public List<CarPackage> getCarPackageById(@PathVariable Long id) {
		return carPackageService.getCarPackageById(id);
	}

	// Ambika - edit CarPackage by id
	@PutMapping("/editcarpackage/{id}")
	public String editCarPackageById(@PathVariable Long id, @RequestBody CarPackage carPackage) {
		return carPackageService.editCarPackageById(id, carPackage);
	}

	// Ambika - delete CarPackage by id
	@DeleteMapping("/deletecarpackage/{id}")
	public String deleteCarPackageById(@PathVariable Long id) {
		return carPackageService.deleteCarPackageById(id);
	}

	// Ambika - Get package name where price less than 500
	@GetMapping("/getcarpackagepricelessthan500")
	public List<CarPackage> getCarPackageByPriceLessThan500() {
		return carPackageService.getCarPackageByPriceLessThan500();
	}

	// Ambika - Get price per hour for specific package
	@GetMapping("/getpricebypackagename/{packageName}")
	public List<CarPackage> getPriceByPackageName(@PathVariable String packageName) {
		return carPackageService.getPriceByPackageName(packageName);
	}

	// Ambika - calculateTotalPrice to calculate the total price for
	// renting a car package for a given number of hours.
	@GetMapping("/{id}/{hours}/calculate-price")
	public Integer calculateCarPackagePrice(@PathVariable Long id, @PathVariable Integer hours) {
		return carPackageService.calculateCarPackagePrice(id, hours);
	}

}
