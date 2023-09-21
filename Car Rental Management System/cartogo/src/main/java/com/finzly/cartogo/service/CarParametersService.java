package com.finzly.cartogo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.cartogo.constant.FuelType;
import com.finzly.cartogo.constant.GearBoxType;
import com.finzly.cartogo.dao.CarParametersDao;
import com.finzly.cartogo.entity.CarParameters;

@Service
public class CarParametersService {
	@Autowired
	 CarParametersDao  carParametersDao;

	public List<CarParameters> getCarParameters() {
		return carParametersDao.getCarParameters();
	}

	public String saveCarParameters(CarParameters carParameters) {
		return carParametersDao.saveCarParameters(carParameters);
	}

	public List<CarParameters> getCarParametersById(Long id) {
		return carParametersDao.getCarParametersById(id);
	}

	public String editCarParametersById(Long id, CarParameters carParameters) {
		return carParametersDao.editCarParametersById(id,carParameters);
	}

	public String deleteCarParametersById(Long id) {
		return carParametersDao.deleteCarParametersById(id);
	}

	public List<CarParameters> getCarParametersByisAirConditioningAvailable(Boolean isAirConditioningAvailable) {
		return carParametersDao.getCarParametersByisAirConditioningAvailable(isAirConditioningAvailable);
	}

	public List<CarParameters> getCarParametersByNumberOfDoors(Integer numberOfDoors) {
		return carParametersDao.getCarParametersByNumberOfDoors(numberOfDoors);
	}

	public List<CarParameters> getCarParametersByNumberOfSeats(Integer numberOfSeats) {
		return carParametersDao.getCarParametersByNumberOfSeats(numberOfSeats);
	}

	public List<CarParameters> getCarParametersByGearBoxType(GearBoxType gearBoxType) {
		return carParametersDao.getCarParametersByGearBoxType(gearBoxType);
	}

	public List<CarParameters> getCarParametersByFuelType(FuelType fuelType) {
		return carParametersDao.getCarParametersByFuelType(fuelType);
	}

}
