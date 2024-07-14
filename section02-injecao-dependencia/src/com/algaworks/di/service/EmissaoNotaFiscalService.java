package com.algaworks.di.service;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.modelo.Produto;
import com.algaworks.di.notificacao.Notificador;
import com.algaworks.di.notificacao.NotificadorEmail;

public class EmissaoNotaFiscalService {

    // Injeção de dependência
    private Notificador notificador;

    public EmissaoNotaFiscalService(Notificador notificador){
        this.notificador = notificador;
    }

    public void emitir(Cliente cliente, Produto produto){
        // TODO emite a nota fiscal aqui...

        //NotificadorEmail notificadorEmail = new NotificadorEmail();
        //notificadorEmail.notificar(cliente, "Nota fiscal do produto " + produto.getNome() + " foi emitida!");
        this.notificador.notificar(cliente, "Nota fiscal do produto " + produto.getNome() + " foi emitida!");
    }
}
