package com.example;

import java.util.Scanner;

import com.example.model.Cliente;

public class AppScanner {
    public static void main(String[] args) {
        
        Cliente pedro = new Cliente();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        pedro.setNome(scanner.nextLine());

        System.out.println("Digite o CPF: ");
        pedro.setCpf(scanner.nextLine());

        System.out.println("Digite a cidade: ");
        pedro.setCidade(scanner.nextLine());

        System.out.println("Digite a renda: ");
        pedro.setRenda(scanner.nextDouble());

        System.out.println("Digite o ano de nascimento: ");
        pedro.setAnoNascimento(scanner.nextInt());

        scanner.nextLine();
        System.out.println("Digite o sexo: ");
        String sexo = scanner.nextLine();
        pedro.setSexo(sexo.charAt(0));

        System.out.println("Nome: " + pedro.getNome());
        System.out.println("Renda: " + pedro.getRenda());
        System.out.println("Sexo: " + pedro.getSexo());
        System.out.println("Ano de nascimento: " + pedro.getAnoNascimento());
        System.out.println("Especial: " + pedro.isEspecial());

        

    }
}
