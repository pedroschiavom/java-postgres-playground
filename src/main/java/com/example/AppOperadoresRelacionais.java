package com.example;

import com.example.model.Cliente;

public class AppOperadoresRelacionais {
    public static void main(String[] args) {
        var cliente1 = new Cliente();
        cliente1.setAnoNascimento(1997);

        var cliente2 = new Cliente();

        boolean cliente1MaisJovem = cliente1.getAnoNascimento() < cliente2.getAnoNascimento();
        boolean cliente1MaisVelho = cliente1.getAnoNascimento() > cliente2.getAnoNascimento();
        int anoNascimentoCliente1 = cliente1.getAnoNascimento();
        int anoNascimentoCliente2 = cliente2.getAnoNascimento();

        cliente2.setAnoNascimento(1996);

        if(cliente1MaisJovem){
            System.out.println("Cliente 1 é mais velho que o cliente 2");
        } else if (cliente1MaisVelho) {
            System.out.println("Cliente 1 é mais jovem que o cliente 2");
        }else if (anoNascimentoCliente1 == anoNascimentoCliente2)
        System.out.println("O cliente 1 e o cliente 2 tem a mesma idade");
    }
    
}

