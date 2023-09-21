package com.finzly.cartogo.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.cartogo.entity.CarParameters;
import com.finzly.cartogo.entity.CreditCard;
import com.finzly.cartogo.entity.PlacedOrder;
import com.finzly.cartogo.service.PlacedOrderService;

@RestController
@RequestMapping("/placedorder")
public class PlacedOrderController {
	@Autowired
	private PlacedOrderService placedOrderService;

	//  Ambika -description
	@RequestMapping("description")
	public String description() {
		return "Car Rental Management System \n" + "CAR2GO \n" + " PlacedOrder Api";
	}

	//  Ambika - get placedorder list
	@GetMapping("/getplacedorder")
	public List<PlacedOrder> getPlacedOrder() {
		return placedOrderService.getPlacedOrder();
	}

	// Ambika - insert placedorder into table
	@PostMapping("/insertplacedorder")
	public String savePlacedOrder(@RequestBody PlacedOrder placedOrder) {
		return placedOrderService.savePlacedOrder(placedOrder);
	}

	//  Ambika - get placedorder by id
	@GetMapping("/getplacedorderbyid/{id}")
	public List<PlacedOrder> getPlacedOrderById(@PathVariable Long id) {
		return placedOrderService.getPlacedOrderById(id);
	}

	//  Ambika - get placedorder by brand
	@GetMapping("/getplacedorderbybrand/{brand}")
	public List<PlacedOrder> getPlacedOrderByBrand(@PathVariable String brand) {
		return placedOrderService.getPlacedOrderByBrand(brand);
	}

	//  Ambika - get placedorder by car id
	@GetMapping("/getplacedorderbycarid/{carId}")
	public List<PlacedOrder> getPlacedOrderByCarId(@PathVariable Long carId) {
		return placedOrderService.getPlacedOrderByCarId(carId);
	}

	// Ambika - get placedorder by user id
	@GetMapping("/getplacedorderbyuserid/{userId}")
	public List<PlacedOrder> getPlacedOrderByUserId(@PathVariable Long userId) {
		return placedOrderService.getPlacedOrderByUserId(userId);
	}

	//  Ambika - get placedorder by start time
	@GetMapping("/getplacedorderbystarttime/{startTime}")
	public List<PlacedOrder> getPlacedOrderByStartTime(@PathVariable LocalDateTime startTime) {
		return placedOrderService.getPlacedOrderByStartTime(startTime);
	}

	//  Ambika - get placedorder by end time
	@GetMapping("/getplacedorderbyendtime/{endTime}")
	public List<PlacedOrder> getPlacedOrderByEndTime(@PathVariable LocalDateTime endTime) {
		return placedOrderService.getPlacedOrderByEndTime(endTime);
	}

	//  Ambika - get placedorder by model
	@GetMapping("/getplacedorderbymodel/{model}")
	public List<PlacedOrder> getPlacedOrderByModel(@PathVariable String model) {
		return placedOrderService.getPlacedOrderByModel(model);
	}

}
