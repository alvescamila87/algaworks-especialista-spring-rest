package com.algaworks.di.service;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.notificacao.Notificador;
import com.algaworks.di.notificacao.NotificadorEmail;


public class AtivacaoClienteService {

    // Injeção de dependência
    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador){
        this.notificador = notificador;
    }

    public void ativarCliente(Cliente cliente){
        cliente.ativar();

        //NotificadorEmail notificadorEmail = new NotificadorEmail();
        //notificadorEmail.notificar(cliente, "Seu cadastro no sistema está ativo!");

        this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
