package com.finzly.cartogo.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.cartogo.entity.CreditCard;
import com.finzly.cartogo.entity.PlacedOrder;

@Repository
public class PlacedOrderDao {
	@Autowired
	SessionFactory factory;

	public List<PlacedOrder> getPlacedOrder() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(PlacedOrder.class);
		return criteria.list();
	}

	public String savePlacedOrder(PlacedOrder placedOrder) {
		Session session = factory.openSession();
		session.save(placedOrder);
		session.beginTransaction().commit();
		return "placedOrder Inserted in to table";
	}

	public List<PlacedOrder> getPlacedOrderById(Long id) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(PlacedOrder.class);
		criteria.add(Restrictions.eq("id", id));
		return criteria.list();
	}

	public List<PlacedOrder> getPlacedOrderByBrand(String brand) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(PlacedOrder.class);
		criteria.add(Restrictions.eq("brand", brand));
		return criteria.list();
	}

	public List<PlacedOrder> getPlacedOrderByCarId(Long carId) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(PlacedOrder.class);
		criteria.add(Restrictions.eq("carId", carId));
		return criteria.list();
	}

	public List<PlacedOrder> getPlacedOrderByUserId(Long userId) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(PlacedOrder.class);
		criteria.add(Restrictions.eq("userId", userId));
		return criteria.list();
	}

	public List<PlacedOrder> getPlacedOrderByStartTime(LocalDateTime startTime) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(PlacedOrder.class);
		criteria.add(Restrictions.eq("startTime", startTime));
		return criteria.list();
	}

	public List<PlacedOrder> getPlacedOrderByEndTime(LocalDateTime endTime) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(PlacedOrder.class);
		criteria.add(Restrictions.eq("endTime", endTime));
		return criteria.list();
	}

	public List<PlacedOrder> getPlacedOrderByModel(String model) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(PlacedOrder.class);
		criteria.add(Restrictions.eq("model", model));
		return criteria.list();
	}

}
