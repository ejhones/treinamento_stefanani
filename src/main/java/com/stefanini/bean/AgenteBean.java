package com.stefanini.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Agente;
import com.stefanini.service.AgenteService;

@Named( "agenteMB")
@SessionScoped
public class AgenteBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
    private AgenteService agenteService;
	
	@Inject
    private Agente agente;

    public Agente getAgente() {
		return agente;
	}
    
	public void setAgente(Agente agente) {
		this.agente = agente;
	}

	public String chamar() {
		agenteService.incluir(this.agente);
        return "agente.xhtml";
    }

}
