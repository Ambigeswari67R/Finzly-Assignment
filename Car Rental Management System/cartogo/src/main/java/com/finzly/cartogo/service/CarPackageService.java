package com.finzly.cartogo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.cartogo.dao.CarPackageDao;
import com.finzly.cartogo.entity.CarPackage;



@Service
public class CarPackageService {
	@Autowired
	CarPackageDao carPackageDao;

	public List<CarPackage> getCarPackage() {
		return carPackageDao.getCarPackage();
	}

	public String saveCarPackage(CarPackage carPackage) {
		return carPackageDao.saveCarPackage(carPackage);
	}

	public List<CarPackage> getCarPackageById(Long id) {
		return carPackageDao.getCarPackageById(id);
	}

	public String editCarPackageById(Long id, CarPackage carPackage) {
		return carPackageDao.editCarPackageById(id, carPackage);
	}

	public String deleteCarPackageById(Long id) {
		return carPackageDao.deleteCarPackageById(id);
	}

	public List<CarPackage> getCarPackageByPriceLessThan500() {
		return carPackageDao.getCarPackageByPriceLessThan500();
	}

	public List<CarPackage> getPriceByPackageName(String packageName) {
		return carPackageDao.getPriceByPackageName(packageName);
	
	}

	public Integer calculateCarPackagePrice(Long id, Integer hours) {
		return carPackageDao.calculateCarPackagePrice(id, hours);
	}

//	public Integer calculateTotalPrice(Long id, Integer pricePerHour) {
//		return carPackageDao.calculateTotalPrice(id,pricePerHour);
//	}

}
