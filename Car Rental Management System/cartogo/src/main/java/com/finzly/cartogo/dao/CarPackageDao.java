package com.finzly.cartogo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.cartogo.entity.AccessKey;
import com.finzly.cartogo.entity.Car;
import com.finzly.cartogo.entity.CarPackage;
import com.finzly.cartogo.entity.CreditCard;
@Repository
public class CarPackageDao {
	@Autowired
	SessionFactory factory;

	public List<CarPackage> getCarPackage() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(CarPackage.class);
		return criteria.list();
	}

	public String saveCarPackage(CarPackage carPackage) {
		Session session = factory.openSession();
		session.save(carPackage);
		session.beginTransaction().commit();
		return "carPackage Inserted in to table";
	}

	public List<CarPackage> getCarPackageById(Long id) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(CarPackage.class);
		criteria.add(Restrictions.eq("id", id));
		return criteria.list();
	}

	public String editCarPackageById(Long id, CarPackage carPackage) {
		Session session = factory.openSession();
		Transaction tx = null;
		String resultMessage = "";

		try {
			tx = session.beginTransaction();

			CarPackage existingCarPackage = session.get(CarPackage.class, id);

			if (existingCarPackage != null) {

				existingCarPackage.setPackageName(existingCarPackage.getPackageName());
				existingCarPackage.setPricePerHour(existingCarPackage.getPricePerHour());
				existingCarPackage.setCars(existingCarPackage.getCars());

				session.update(existingCarPackage);

				tx.commit();
				resultMessage = "CarPackage updated successfully!";
			} else {
				resultMessage = "CarPackage not found with ID: " + id;
			}
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			resultMessage = "Error updating CarPackage: " + e.getMessage();
		} finally {
			session.close();
		}

		return resultMessage;
	}

	public String deleteCarPackageById(Long id) {
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();

			CarPackage carPackageToDelete = session.get(CarPackage.class, id);

			if (carPackageToDelete != null) {
				session.delete(carPackageToDelete);
				tx.commit();
				return "CarPackage deleted successfully";
			} else {
				return "CarPackage with ID " + id + " not found";
			}
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			return "Error deleting CarPackage: " + e.getMessage();
		} finally {
			session.close();
		}
	}

	public List<CarPackage> getCarPackageByPriceLessThan500() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(CarPackage.class);
		criteria.add(Restrictions.lt("pricePerHour", 500));
		return criteria.list();
	}

	public List<CarPackage> getPriceByPackageName(String packageName) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(CarPackage.class);
		criteria.add(Restrictions.eq("packageName", packageName));
		return criteria.list();
	}

	

	public Integer calculateCarPackagePrice(Long id, Integer hours) {
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();

			CarPackage carPackageTocalculate = session.get(CarPackage.class, id);

			if (carPackageTocalculate != null) {
				 int totalPrice = carPackageTocalculate.getPricePerHour() * hours;
				tx.commit();
				return totalPrice;
			} else {
				return 0;
			}
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			return  0;
		} finally {
			session.close();
		}
		
	}

	

}
