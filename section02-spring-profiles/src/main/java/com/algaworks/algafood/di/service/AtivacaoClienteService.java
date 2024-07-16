package com.algaworks.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.NivelUrgencia;
import com.algaworks.algafood.di.notificacao.Notificador;
import com.algaworks.algafood.di.notificacao.TipoDeNotificador;

@Component
public class AtivacaoClienteService {

	@TipoDeNotificador(NivelUrgencia.URGENTE)
	@Autowired
	private Notificador notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}

}
