package com.algaworks.algafood.di.notificacao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

//@Primary
@Component
public class NotificadorWhatsapp implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do Whatsapp %s: %s\n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}

}
