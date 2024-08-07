package com.algaworks.algafood.di.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

	@Autowired
	private Notificador notificador;
	
	public void ativarCliente(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro foi ativado!");				
	}	

}
