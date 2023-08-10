package com.example;

public class AppClasses {
    public static void main(String[] args) {
        
        Cliente pedro = new Cliente();
        pedro.setRenda(9025.73); 
        pedro.setSexo('M'); 
        pedro.setAnoNascimento(1996);
        System.out.println("Renda: " + pedro.getRenda());
        System.out.println("Sexo: " + pedro.getSexo());
        System.out.println("Ano de nascimento: " + pedro.getAnoNascimento());
        System.out.println("Especial: " + pedro.isEspecial());

        Cliente irineu = new Cliente(2000, 'M');
        irineu.setAnoNascimento(2000);
        System.out.println("Renda: " + irineu.getRenda());
        System.out.println("Sexo: " + irineu.getSexo());
        System.out.println("Ano de nascimento: " + irineu.getAnoNascimento());
        System.out.println("Especial: " + irineu.isEspecial());



    }
}
