package com.algaworks.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

//@Qualifier("telegram")
@Qualifier("normal")
@Component
public class NotificadoTelegram implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do Telegram %s: %s\n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}

}
