package com.algaworks.di.service;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.notificacao.NotificadorEmail;
import com.algaworks.di.notificacao.NotificadorSMS;

public class AtivacaoClienteService {

    public void ativarCliente(Cliente cliente){
        cliente.ativar();

        NotificadorSMS notificadorSMS = new NotificadorSMS();
        notificadorSMS.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
