package com.algaworks.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

	// Quero que a injeção de dependência seja opcional (implementação de notificador sem @component)
	@Autowired(required = false)
	private Notificador notificador;
	
	public void ativarCliente(Cliente cliente) {
		cliente.ativar();
		
		// Quando @Autowired for opcional
		if(notificador != null) {		
			notificador.notificar(cliente, "Seu cadastro foi ativado!");
		} else {
			System.out.println("Não existe notificador, mas cliente foi ativado.");
		}
	}	

}
