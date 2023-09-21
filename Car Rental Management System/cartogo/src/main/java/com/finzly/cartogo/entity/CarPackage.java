package com.finzly.cartogo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Collection;

@Entity
@Table(name = "car_package")
public class CarPackage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@Column(name = "package_name", nullable = false)
	private String packageName;

	@Column(name = "price_per_hour", nullable = false)
	private Integer pricePerHour;

	@JsonIgnore
	@OneToMany(mappedBy = "carPackage")
	private Collection<Car> cars;

	public CarPackage(Long id, String packageName, Integer pricePerHour, Collection<Car> cars) {
		super();
		this.id = id;
		this.packageName = packageName;
		this.pricePerHour = pricePerHour;
		this.cars = cars;
	}

	private CarPackage() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public Integer getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(Integer pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public Collection<Car> getCars() {
		return cars;
	}

	public void setCars(Collection<Car> cars) {
		this.cars = cars;
	}

}
