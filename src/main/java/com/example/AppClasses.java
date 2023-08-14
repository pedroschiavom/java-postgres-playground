package com.example;

public class AppClasses {
    public static void main(String[] args) {
        
        Cliente pedro = new Cliente();
        pedro.setRenda(9025.73); 
        pedro.setSexo('M'); 
        pedro.setAnoNascimento(1996);
        pedro.setNome("Pedro Henrique");
        pedro.setCpf("44658588846");
        pedro.setCidade("Palmas");

        String[] vetorNome = pedro.getNome().split(" ");
        System.out.println(vetorNome[0]);
        System.out.println(vetorNome[1]);

        System.out.println("1º caractere do nome: " + pedro.getNome().charAt(0));

        System.out.println("Nome: " + pedro.getNome());
        System.out.println("Renda: " + pedro.getRenda());
        System.out.println("Sexo: " + pedro.getSexo());
        System.out.println("Ano de nascimento: " + pedro.getAnoNascimento());
        System.out.println("Especial: " + pedro.isEspecial());

        Cliente irineu = new Cliente(2000, 'M');
        irineu.setAnoNascimento(2000);
        irineu.setNome("Irineu");
        irineu.setCpf("44658588846");
        irineu.setCidade("PALMAS");

        if(pedro.getCpf().equals(irineu.getCpf())){
            System.out.println("Clientes iguais");
        } else{
            System.out.println("Clientes diferentes");
        }

        if(pedro.getCidade().equalsIgnoreCase(irineu.getCidade())){
            System.out.println("Clientes moram na mesma cidade");
        } else{
            System.out.println("Clientes moram em cidades diferentes");
        }

        System.out.println("Nome: " + irineu.getNome());
        System.out.println("Renda: " + irineu.getRenda());
        System.out.println("Sexo: " + irineu.getSexo());
        System.out.println("Ano de nascimento: " + irineu.getAnoNascimento());
        System.out.println("Especial: " + irineu.isEspecial());



    }
}
