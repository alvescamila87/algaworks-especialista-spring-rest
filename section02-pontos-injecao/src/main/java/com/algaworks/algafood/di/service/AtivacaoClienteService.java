package com.algaworks.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

	// Ponto de Injeção 3: Atributo
	@Autowired
	private Notificador notificador;
	
	// Ponto de Injeção 1: Construtor
//	@Autowired
//	public AtivacaoClienteService(Notificador notificador) {
//		this.notificador = notificador;		
//	}
	
//	public AtivacaoClienteService(String qualquerCoisa) {
//		// lógica do novo construtor
//	}
	
	public void ativarCliente(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro foi ativado!");
	}

	// Ponto de Injeção 2: Setter
//	@Autowired
//	public void setNotificador(Notificador notificador) {
//		this.notificador = notificador;
//	}
	
	
	

}
