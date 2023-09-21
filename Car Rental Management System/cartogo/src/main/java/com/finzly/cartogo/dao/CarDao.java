package com.finzly.cartogo.dao;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.cartogo.entity.Car;
import com.finzly.cartogo.entity.User;

@Repository
public class CarDao {
	@Autowired
	SessionFactory factory;

	public List<Car> getCarInfo() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Car.class);
		return criteria.list();
	}

	public List<Car> getAvailableCars() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Car.class);
		criteria.add(Restrictions.eq("isAvailable", true));
		return criteria.list();
	}

	public List<Car> getCar(Long id) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Car.class);
		criteria.add(Restrictions.eq("id", id));
		return criteria.list();
	}

	public String saveCar(Car car) {
		Session session = factory.openSession();
		session.save(car);
		session.beginTransaction().commit();
		return "Car Inserted in to table";

	}

	public String editCar(Long id, Car car) {
		Session session = factory.openSession();
		Transaction tx = null;
		String resultMessage = "";

		try {
			tx = session.beginTransaction();

			Car existingCar = session.get(Car.class, id);

			if (existingCar != null) {

				existingCar.setRegistrationNr(car.getRegistrationNr());
				existingCar.setBrand(car.getBrand());
				existingCar.setModel(car.getModel());
				existingCar.setIsAvailable(car.getIsAvailable());

				session.update(existingCar);

				tx.commit();
				resultMessage = "Car updated successfully!";
			} else {
				resultMessage = "Car not found with ID: " + id;
			}
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			resultMessage = "Error updating car: " + e.getMessage();
		} finally {
			session.close();
		}

		return resultMessage;
	}

	public String deleteCar(Long id) {
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();

			Car carToDelete = session.get(Car.class, id);

			if (carToDelete != null) {
				session.delete(carToDelete);
				tx.commit();
				return "Car deleted successfully";
			} else {
				return "Car with ID " + id + " not found";
			}
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			return "Error deleting car: " + e.getMessage();
		} finally {
			session.close();
		}
	}

	public List<Car> getByCarBrand(String brand) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Car.class);
		criteria.add(Restrictions.eq("brand", brand));
		return criteria.list();
	}

	public List<Car> getNotAvailableCars() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Car.class);
		criteria.add(Restrictions.eq("isAvailable", false));
		return criteria.list();
		
	}

	public List<Car> getCarByModel(String model) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Car.class);
		criteria.add(Restrictions.eq("model", model));
		return criteria.list();
	}

	public List<Car> getCarByRegistrationNumber(String registrationNr) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Car.class);
		criteria.add(Restrictions.eq("registrationNr", registrationNr));
		return criteria.list();
	
	}

	public String updateCarAvailability(Long id, Boolean isAvailable) {
		Session session = factory.openSession();
		Transaction tx = null;
		String resultMessage = "";

		try {
			tx = session.beginTransaction();

			Car existingCar = session.get(Car.class, id);

			if (existingCar != null) {

				existingCar.setIsAvailable(isAvailable);

				session.update(existingCar);

				tx.commit();
				resultMessage = "Car updated successfully!";
			} else {
				resultMessage = "Car not found with ID: " + id;
			}
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			resultMessage = "Error updating car: " + e.getMessage();
		} finally {
			session.close();
		}

		return resultMessage;
		
		
	}

}
