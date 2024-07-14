package com.algaworks.di;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.modelo.Produto;
import com.algaworks.di.notificacao.Notificador;
import com.algaworks.di.notificacao.NotificadorEmail;
import com.algaworks.di.notificacao.NotificadorSMS;
import com.algaworks.di.service.AtivacaoClienteService;
import com.algaworks.di.service.EmissaoNotaFiscalService;

import java.math.BigDecimal;

public class Teste2ComInjecao {
    public static void main(String[] args) {

        Cliente joao = new Cliente("João da Silva", "joao@email.com", "47-9999-5555");
        Cliente maria = new Cliente("Maria Madalena", "maria@email.com", "47-8888-4444");

        // EXEMPLO COM INJEÇÃO DE DEPENDÊNCIA: INVERSÃO DE CONTROLE (POLIMORFISMO)

        // Notificação por E-mail
        Notificador notificador1 = new NotificadorEmail();

        System.out.println("POLIMORFISMO: E-MAIL");
        AtivacaoClienteService ativacaoClienteService1 = new AtivacaoClienteService(notificador1);
        ativacaoClienteService1.ativarCliente(joao);

        EmissaoNotaFiscalService emissaoNotaFiscalService1 = new EmissaoNotaFiscalService(notificador1);
        emissaoNotaFiscalService1.emitir(joao, new Produto("iPhone 15 PRO 256", new BigDecimal(15900)));

        // Notificação por SMS
        Notificador notificador2 = new NotificadorSMS();

        System.out.println("POLIMORFISMO: SMS");
        AtivacaoClienteService ativacaoClienteService2 = new AtivacaoClienteService(notificador2);
        ativacaoClienteService2.ativarCliente(maria);

        EmissaoNotaFiscalService emissaoNotaFiscalService2 = new EmissaoNotaFiscalService(notificador2);
        emissaoNotaFiscalService2.emitir(maria, new Produto("MacBook Air 256", new BigDecimal(19900)));

    }
}