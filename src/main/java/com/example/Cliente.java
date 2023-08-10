package com.example;

public class Cliente{
    private double renda;
    private char sexo;
    private boolean especial;

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public Cliente(){
        System.out.println("Criando um cliente sem parâmetros");
        double aleatorio = Math.random();
        if(aleatorio > 0.5)
            especial = true;
    }

    public Cliente(double renda, char sexo){
        this();
        System.out.println("Criando um cliente com parâmetros");
        setRenda(renda);
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        if(sexo == 'M' || sexo == 'F'){
            this.sexo = sexo;
        } else {
            System.out.println("Dado inválido");
        }
        
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    private int anoNascimento;

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        if (renda >= 0){
            this.renda = renda;
        } else{
            System.out.println("A renda deve ser maior que zero");
        }
       
    }
}