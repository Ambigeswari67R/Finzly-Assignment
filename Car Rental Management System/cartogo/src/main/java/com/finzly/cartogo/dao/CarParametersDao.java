package com.finzly.cartogo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.cartogo.constant.FuelType;
import com.finzly.cartogo.constant.GearBoxType;
import com.finzly.cartogo.entity.CarPackage;
import com.finzly.cartogo.entity.CarParameters;
import com.finzly.cartogo.entity.Role;

@Repository
public class CarParametersDao {
	@Autowired
	SessionFactory factory;

	public List<CarParameters> getCarParameters() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(CarParameters.class);
		return criteria.list();
	}

	public String saveCarParameters(CarParameters carParameters) {
		Session session = factory.openSession();
		session.save(carParameters);
		session.beginTransaction().commit();
		return "CarParameters Inserted in to table";
	}

	public List<CarParameters> getCarParametersById(Long id) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(CarParameters.class);
		criteria.add(Restrictions.eq("id", id));
		return criteria.list();
	}

	public String editCarParametersById(Long id, CarParameters carParameters) {
		Session session = factory.openSession();
		Transaction tx = null;
		String resultMessage = "";

		try {
			tx = session.beginTransaction();

			CarParameters existingCarParameters = session.get(CarParameters.class, id);

			if (existingCarParameters != null) {
				
				
				existingCarParameters.setFuelType(existingCarParameters.getFuelType());
				existingCarParameters.setGearBoxType(existingCarParameters.getGearBoxType());
				existingCarParameters.setNumberOfDoors(existingCarParameters.getNumberOfDoors());
				existingCarParameters.setNumberOfSeats(existingCarParameters.getNumberOfSeats());
				existingCarParameters.setIsAirConditioningAvailable(existingCarParameters.getIsAirConditioningAvailable());
				existingCarParameters.setCar(existingCarParameters.getCar());

				session.update(existingCarParameters);

				tx.commit();
				resultMessage = "CarParameters updated successfully!";
			} else {
				resultMessage = "CarParameters not found with ID: " + id;
			}
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			resultMessage = "Error updating CarParameters: " + e.getMessage();
		} finally {
			session.close();
		}

		return resultMessage;
	}

	public String deleteCarParametersById(Long id) {
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();

			CarParameters carParametersToDelete = session.get(CarParameters.class, id);

			if (carParametersToDelete != null) {
				session.delete(carParametersToDelete);
				tx.commit();
				return "CarParameters deleted successfully";
			} else {
				return "CarParameters with ID " + id + " not found";
			}
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			return "Error deleting CarParameters: " + e.getMessage();
		} finally {
			session.close();
		}
	}

	public List<CarParameters> getCarParametersByisAirConditioningAvailable(Boolean isAirConditioningAvailable) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(CarParameters.class);
		criteria.add(Restrictions.eq("isAirConditioningAvailable", isAirConditioningAvailable));
		return criteria.list();
	}

	public List<CarParameters> getCarParametersByNumberOfDoors(Integer numberOfDoors) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(CarParameters.class);
		criteria.add(Restrictions.eq("numberOfDoors", numberOfDoors));
		return criteria.list();
	}

	public List<CarParameters> getCarParametersByNumberOfSeats(Integer numberOfSeats) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(CarParameters.class);
		criteria.add(Restrictions.eq("numberOfSeats", numberOfSeats));
		return criteria.list();
	}

	public List<CarParameters> getCarParametersByGearBoxType(GearBoxType gearBoxType) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(CarParameters.class);
		criteria.add(Restrictions.eq("gearBoxType", gearBoxType));
		return criteria.list();
	}

	public List<CarParameters> getCarParametersByFuelType(FuelType fuelType) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(CarParameters.class);
		criteria.add(Restrictions.eq("fuelType", fuelType));
		return criteria.list();
	}
	

}
