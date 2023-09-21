package com.finzly.cartogo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.cartogo.entity.PlacedOrder;
import com.finzly.cartogo.entity.Role;

@Repository
public class RoleDao {
	@Autowired
	SessionFactory factory;

	public List<Role> getRole() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Role.class);
		return criteria.list();
	}

	public String saveRole(Role role) {
		Session session = factory.openSession();
		session.save(role);
		session.beginTransaction().commit();
		return "Role  Inserted in to table";
		
	}

	public String deleteRole(Long id) {
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();

			Role roleToDelete = session.get(Role.class, id);

			if (roleToDelete != null) {
				session.delete(roleToDelete);
				tx.commit();
				return "Role deleted successfully";
			} else {
				return "Role with ID " + id + " not found";
			}
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			return "Error deleting role: " + e.getMessage();
		} finally {
			session.close();
		}
		
	}

	public List<Role> getRoleById(Long id) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Role.class);
		criteria.add(Restrictions.eq("id", id));
		return criteria.list();
	}

	public String editRole(Long id, Role role) {
		Session session = factory.openSession();
		Transaction tx = null;
		String resultMessage = "";

		try {
			tx = session.beginTransaction();

			Role existingRole = session.get(Role.class, id);

			if (existingRole != null) {

				existingRole.setName(role.getName());
				existingRole.setUser(role.getUser());
				

				session.update(existingRole);

				tx.commit();
				resultMessage = "role updated successfully!";
			} else {
				resultMessage = "role not found with ID: " + id;
			}
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			resultMessage = "Error updating role: " + e.getMessage();
		} finally {
			session.close();
		}

		return resultMessage;
	}

	public List<Role> getRoleByName(String name) {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Role.class);
		criteria.add(Restrictions.eq("name", name));
		return criteria.list();
	}

}
