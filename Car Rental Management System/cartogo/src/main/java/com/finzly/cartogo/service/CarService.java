package com.finzly.cartogo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;


import com.finzly.cartogo.dao.CarDao;
import com.finzly.cartogo.entity.Car;

@Service
public class CarService {
	@Autowired
	CarDao carDao;

	public List<Car> getCarInfo() {
		return carDao.getCarInfo();
	}

	public List<Car> getAvailableCars() {
		return carDao.getAvailableCars();

	}

	public List<Car> getCar(Long id) {
		return carDao.getCar(id);
	}

	public String saveCar(Car car) {
		return carDao.saveCar(car);
		
	}

	public String editCar(Long id, Car car) {
		return carDao.editCar(id,car);
	
	}

	public String deleteCar(Long id) {
		return carDao.deleteCar(id);
		
	}

	public List<Car> getByCarBrand(String brand) {
		return carDao. getByCarBrand(brand);
	}

	public List<Car> getNotAvailableCars() {
		return carDao.getNotAvailableCars();
	}

	public List<Car> getCarByModel(String model) {
		return carDao.getCarByModel(model);
	}

	public List<Car> getCarByRegistrationNumber(String registrationNr) {
		return carDao.getCarByRegistrationNumber(registrationNr);
	}

	public String updateCarAvailability(Long id, Boolean isAvailable) {
		return carDao.updateCarAvailability(id,isAvailable);
	}

	

}
