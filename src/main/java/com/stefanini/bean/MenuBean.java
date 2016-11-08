package com.stefanini.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named( "menuMB")
@SessionScoped
public class MenuBean implements Serializable {

	private static final long serialVersionUID = 1L;

	public String chamar(int opcao) {
		String destino = "";
		switch (opcao) {
		case 0:
			destino = "veiculos.xhtml";
			break;
		case 1:
			destino = "modelos.xhtml";
			break;
		case 2:
			destino = "proprietario.xhtml";
			break;
		case 3:
			destino = "infracao.xhtml";
			break;
		case 4:
			destino = "agente.xhtml";
			break;
		default:
			destino = "index.xhtml";
			break;
		}
		System.out.println(destino);
		return destino;
    }

}
