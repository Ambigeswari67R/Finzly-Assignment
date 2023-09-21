package com.finzly.cartogo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.cartogo.dao.PlacedOrderDao;
import com.finzly.cartogo.entity.PlacedOrder;

@Service
public class PlacedOrderService {
	@Autowired
	PlacedOrderDao placedOrderDao;

	public List<PlacedOrder> getPlacedOrder() {
		return placedOrderDao.getPlacedOrder();
	}

	public String savePlacedOrder(PlacedOrder placedOrder) {
		return placedOrderDao.savePlacedOrder(placedOrder);
	}

	public List<PlacedOrder> getPlacedOrderById(Long id) {
		return placedOrderDao.getPlacedOrderById(id);
	
	}

	public List<PlacedOrder> getPlacedOrderByBrand(String brand) {
		return placedOrderDao.getPlacedOrderByBrand(brand);
	}

	public List<PlacedOrder> getPlacedOrderByCarId(Long carId) {
		return placedOrderDao.getPlacedOrderByCarId(carId);
	}

	public List<PlacedOrder> getPlacedOrderByUserId(Long userId) {
		return placedOrderDao.getPlacedOrderByUserId(userId);
	}

	public List<PlacedOrder> getPlacedOrderByStartTime(LocalDateTime startTime) {
		return placedOrderDao.getPlacedOrderByStartTime(startTime);
	}

	public List<PlacedOrder> getPlacedOrderByEndTime(LocalDateTime endTime) {
		return placedOrderDao.getPlacedOrderByEndTime(endTime);
	}

	public List<PlacedOrder> getPlacedOrderByModel(String model) {
		return placedOrderDao.getPlacedOrderByModel(model);
	}


}
