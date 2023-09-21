package com.finzly.cartogo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.finzly.cartogo.constant.FuelType;
import com.finzly.cartogo.constant.GearBoxType;

@Entity
@Table(name = "car_parameters")
public class CarParameters {

	@Id
	@JsonIgnore
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@Enumerated(EnumType.STRING)
	@Column(name = "fuel_type", nullable = false)
	private FuelType fuelType;

	@Enumerated(EnumType.STRING)
	@Column(name = "gear_box_type", nullable = false)
	private GearBoxType gearBoxType;

	@Column(name = "number_of_doors", nullable = false)
	private Integer numberOfDoors;

	@Column(name = "number_of_seats", nullable = false)
	private Integer numberOfSeats;

	@Column(name = "is_air_conditioning_available", nullable = false)
	private Boolean isAirConditioningAvailable;

	@JsonIgnore
	@OneToOne(mappedBy = "carParameters")
	private Car car;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public FuelType getFuelType() {
		return fuelType;
	}

	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}

	public GearBoxType getGearBoxType() {
		return gearBoxType;
	}

	public void setGearBoxType(GearBoxType gearBoxType) {
		this.gearBoxType = gearBoxType;
	}

	public Integer getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(Integer numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public Integer getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(Integer numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public Boolean getIsAirConditioningAvailable() {
		return isAirConditioningAvailable;
	}

	public void setIsAirConditioningAvailable(Boolean isAirConditioningAvailable) {
		this.isAirConditioningAvailable = isAirConditioningAvailable;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

}
