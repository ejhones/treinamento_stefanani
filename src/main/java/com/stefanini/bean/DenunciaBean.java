package com.stefanini.bean;

import java.io.Serializable;

import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.service.DenunciaService;

@Named( "denunciaMB")
public class DenunciaBean implements Serializable{

    
	private static final long serialVersionUID = 1L;
	
	@Inject
    private DenunciaService denunciaService;

    public String chamar() {
        return "teste.jsf";
    }

}
