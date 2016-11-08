package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Veiculos;

public class VeiculoRepository {

	@Inject
	private EntityManager manager;

	public void incluir(Veiculos veiculo) {
		this.manager.persist(veiculo);
	}

	public void altera(Veiculos veiculo) {
		this.manager.merge(veiculo);
	}

	public Veiculos busca(Integer id) {
		return this.manager.find(Veiculos.class, id);
	}

	public List<Veiculos> lista() {
		return this.manager.createQuery("select c from veiculo c", Veiculos.class)
				.getResultList();
	}
}




