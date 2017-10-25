package com.springrest.dao;

import org.hibernate.Session;

import com.springrest.hiberenate.HibernateUtil;
import com.springrest.model.Users;

public class UsersDao {

	public void addUser(Users user) {
		Session session = HibernateUtil.openSession();
		session.persist(user);
	}

	public boolean loginUser(Users user) {
		Session session = HibernateUtil.openSession();
		return session.contains(user);
	}

}
