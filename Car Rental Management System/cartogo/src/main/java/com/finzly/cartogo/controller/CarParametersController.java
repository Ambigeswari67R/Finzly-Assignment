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

import com.finzly.cartogo.constant.FuelType;
import com.finzly.cartogo.constant.GearBoxType;
import com.finzly.cartogo.entity.CarPackage;
import com.finzly.cartogo.entity.CarParameters;
import com.finzly.cartogo.service.CarParametersService;

@RestController
@RequestMapping("/carparameters")
public class CarParametersController {
	@Autowired
	private CarParametersService carParametersService;

	// Ambika - description
	@RequestMapping("description")
	public String description() {
		return "Car Rental Management System \n" + "CAR2GO \n" + "CarParameter Information";
	}

	// Ambika - get carparameter information
	@GetMapping("getcarparameters")
	public List<CarParameters> getCarParameters() {
		return carParametersService.getCarParameters();
	}

	// Ambika - insert CarParameters into table
	@PostMapping("/insertcarparameters")
	public String saveCarParameters(@RequestBody CarParameters carParameters) {
		return carParametersService.saveCarParameters(carParameters);
	}

	// Ambika -get CarParameters by id
	@GetMapping("/getcarparameters/{id}")
	public List<CarParameters> getCarParametersById(@PathVariable Long id) {
		return carParametersService.getCarParametersById(id);
	}

	// Ambika - edit CarParameters by id
	@PutMapping("/editcarparameters/{id}")
	public String editCarParametersById(@PathVariable Long id, @RequestBody CarParameters carParameters) {
		return carParametersService.editCarParametersById(id, carParameters);
	}

	// Ambika - delete CarParameters by id
	@DeleteMapping("/deletecarparameters/{id}")
	public String deleteCarParametersById(@PathVariable Long id) {
		return carParametersService.deleteCarParametersById(id);
	}

	// Ambika -get CarParameters by isAirConditioningAvailable
	@GetMapping("/getcarparametersbyaircondition/{isAirConditioningAvailable}")
	public List<CarParameters> getCarParametersByisAirConditioningAvailable(
			@PathVariable Boolean isAirConditioningAvailable) {
		return carParametersService.getCarParametersByisAirConditioningAvailable(isAirConditioningAvailable);
	}

	// Ambika -get CarParameters by number of doors
	@GetMapping("/getcarparametersbynoofdoors/{numberOfDoors}")
	public List<CarParameters> getCarParametersByNumberOfDoors(@PathVariable Integer numberOfDoors) {
		return carParametersService.getCarParametersByNumberOfDoors(numberOfDoors);
	}

	// Ambika -get CarParameters by number Of Seats
	@GetMapping("/getcarparametersbynoofseats/{numberOfSeats}")
	public List<CarParameters> getCarParametersByNumberOfSeats(@PathVariable Integer numberOfSeats) {
		return carParametersService.getCarParametersByNumberOfSeats(numberOfSeats);
	}

	// Ambika -get CarParameters by gearBoxType
	@GetMapping("/getcarparametersbygearboxtype/{gearBoxType}")
	public List<CarParameters> getCarParametersByGearBoxType(@PathVariable GearBoxType gearBoxType) {
		return carParametersService.getCarParametersByGearBoxType(gearBoxType);
	}

	// Ambika -get CarParameters by fuelType
	@GetMapping("/getcarparametersbyfueltype/{gearBoxType}")
	public List<CarParameters> getCarParametersByFuelType(@PathVariable FuelType fuelType) {
		return carParametersService.getCarParametersByFuelType(fuelType);
	}

}
