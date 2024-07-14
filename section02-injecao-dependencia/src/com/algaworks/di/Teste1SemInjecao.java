package com.algaworks.di;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.modelo.Produto;
import com.algaworks.di.service.AtivacaoClienteService;
import com.algaworks.di.service.EmissaoNotaFiscalService;

import java.math.BigDecimal;

public class Teste1SemInjecao {
    public static void main(String[] args) {

        Cliente joao = new Cliente("João da Silva", "joao@email.com", "47-9999-5555");
        Cliente maria = new Cliente("Maria Madalena", "maria@email.com", "47-8888-4444");

        /*

        // EXEMPLO SEM INJEÇÃO DE DEPENDÊNCIA

        // Sem injeção de dependência - Notificar cliente por e-mail
        AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService();
        ativacaoClienteService.ativarCliente(joao);
        ativacaoClienteService.ativarCliente(maria);

        // Sem injeção de dependência - Notificar cliente por e-mail
        EmissaoNotaFiscalService emissaoNotaFiscalService = new EmissaoNotaFiscalService();
        emissaoNotaFiscalService.emitir(joao, new Produto("iPhone 256 15 PRO", new BigDecimal(13900)));
        emissaoNotaFiscalService.emitir(maria, new Produto("MacBook Air 256 PRO", new BigDecimal(19900)));

        // Pode ainda ser alterado o notificador dentro da classe para SMS.

         */

    }
}