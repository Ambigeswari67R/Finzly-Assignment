package com.finzly.cartogo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.cartogo.entity.Car;
import com.finzly.cartogo.service.CarService;

@RestController
@RequestMapping("car")
public class CarController {
	@Autowired
	private CarService carService;

	// Ambika - description
	@RequestMapping("description")
	public String display() {
		return "Car Rental Management System \n" + "CAR2GO";
	}

	// Ambika - get cars information
	@GetMapping("/cars")
	public List<Car> getCarInfo() {
		return carService.getCarInfo();
	}

	// Ambika - get available cars information
	@GetMapping("/cars/available")
	public List<Car> getAvailableCars() {
		return carService.getAvailableCars();
	}

	// Ambika - get cars information by id
	@GetMapping("/cars/{id}")
	public List<Car> getCar(@PathVariable Long id) {
		return carService.getCar(id);
	}

	// Ambika - insert cars information
	@PostMapping("/cars")
	public String saveCar(@RequestBody Car car) {
		return carService.saveCar(car);
	}

	// Ambika - update cars by id
	@PutMapping("/cars/{id}")
	public String editCar(@PathVariable Long id, @RequestBody Car car) {
		return carService.editCar(id, car);
	}

	// Ambika - delete cars by id
	@DeleteMapping("/cars/{id}")
	public String deleteCar(@PathVariable Long id) {
		return carService.deleteCar(id);
	}

	// Ambika - get cars by brand
	@GetMapping("/cars/brand/{brand}")
	public List<Car> getByCarBrand(@PathVariable String brand) {
		return carService.getByCarBrand(brand);
	}

	// Ambika - get not available cars
	@GetMapping("/cars/notavailable")
	public List<Car> getNotAvailableCars() {
		return carService.getNotAvailableCars();
	}

	// Ambika - get cars by model
	@GetMapping("/cars/model/{model}")
	public List<Car> getCarByModel(@PathVariable String model) {
		return carService.getCarByModel(model);
	}

	// Ambika - Get Car Details by Registration Number
	@GetMapping("/cars/registrationnumber/{registrationNr}")
	public List<Car> getCarByRegistrationNumber(@PathVariable String registrationNr) {
		return carService.getCarByRegistrationNumber(registrationNr);
	}

	// Ambika - update the availability status of a car
	@PutMapping("/{id}/{isAvailable}/update-availability")
	public String updateCarAvailability(@PathVariable Long id, @PathVariable Boolean isAvailable) {
		return carService.updateCarAvailability(id, isAvailable);
	}

}
