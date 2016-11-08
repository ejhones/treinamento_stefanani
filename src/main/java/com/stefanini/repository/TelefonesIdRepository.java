package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.TelefonesId;

public class TelefonesIdRepository {

	@Inject
	private EntityManager manager;

	public void incluir(TelefonesId telefonesId) {
		this.manager.persist(telefonesId);
	}

	public void altera(TelefonesId telefonesId) {
		this.manager.merge(telefonesId);
	}

	public TelefonesId busca(Integer id) {
		return this.manager.find(TelefonesId.class, id);
	}

	public List<TelefonesId> lista() {
		return this.manager.createQuery("select c from telefonesId c", TelefonesId.class)
				.getResultList();
	}
}




