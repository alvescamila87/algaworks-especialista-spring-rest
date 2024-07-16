package com.algaworks.algafood.di.notificacao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@Profile("prod")
@TipoDeNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmail implements Notificador {
	
	public NotificadorEmail() {
		System.out.println("Notificador REAL");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

}