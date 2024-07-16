package com.algaworks.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@TipoDeNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorTelegram implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através de WhatsApp %s: %s\n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}

}