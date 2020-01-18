package com.lti.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtils {

	private static EntityManagerFactory factory;
	private static EntityManager entityManager;

	public static EntityManager geEntityManager() {

		if (entityManager == null) {

			factory = Persistence.createEntityManagerFactory("JPA_PU");
			entityManager = factory.createEntityManager();
		}

		return entityManager;

	}

}
