package com.example;

import java.util.*;

public class AppListas {
    public static void main(String[] args) {
        List<Cliente> listaClientes = new LinkedList<>();
        var cliente1 = new Cliente();
        cliente1.setNome("Pedro");
        cliente1.setCidade("Sidney");

        var cliente2 = new Cliente();
        cliente2.setNome("Tony");
        cliente2.setCidade("Peruíbe");

        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        int i = listaClientes.size() - 1;
        listaClientes.remove(i);

        for (Cliente cliente : listaClientes) {
            System.out.println(cliente);
        }
    }
}
