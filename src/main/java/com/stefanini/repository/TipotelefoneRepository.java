package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Tipotelefone;

public class TipotelefoneRepository {

	@Inject
	private EntityManager manager;

	public void incluir(Tipotelefone tipotelefone) {
		this.manager.persist(tipotelefone);
	}

	public void altera(Tipotelefone tipotelefone) {
		this.manager.merge(tipotelefone);
	}

	public Tipotelefone busca(Integer id) {
		return this.manager.find(Tipotelefone.class, id);
	}

	public List<Tipotelefone> lista() {
		return this.manager.createQuery("select c from tipotelefone c", Tipotelefone.class)
				.getResultList();
	}
}




