package com.algaworks.algafood.di.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

	// Quando tem mais de um Beans usar List
	@Autowired
	private List<Notificador> notificadores;
	
	public void ativarCliente(Cliente cliente) {
		cliente.ativar();

		// Utilizada a notificação por todos os métodos (e-mail, sms, telefone, whats, telegram)
		for(Notificador notificador : notificadores) {
			notificador.notificar(cliente, "Seu cadastro foi ativado!");
		}
		
	}	

}
