package com.algaworks.algafood.di.config;

import org.springframework.context.annotation.Bean;

import com.algaworks.algafood.di.notificacao.NotificadorEmail;
import com.algaworks.algafood.di.service.AtivacaoClienteService;

//@Configuration
public class AlgaConfig {
	
	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
		notificador.setCaixaAlta(true);
		
		return notificador;
	}
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService() {
		// retorna um Bean já gerenciado pelo Spring (notificadorEmail() método acima)
		return new AtivacaoClienteService(notificadorEmail());
	}

}
