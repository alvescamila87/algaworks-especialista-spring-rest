package com.algaworks.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@TipoDeNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmail implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do E-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

}