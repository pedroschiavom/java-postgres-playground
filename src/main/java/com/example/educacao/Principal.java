package com.example.educacao;

import java.sql.SQLException;

import com.example.dao.ConnectionManager;
import com.example.educacao.dao.AlunoDAO;
import com.example.educacao.model.Aluno;

public class Principal {
   public static void main(String[] args) {
        try(var conn = ConnectionManager.getConnection()){
            var alunoDAO = new AlunoDAO(conn);
            var aluno = new Aluno();
            aluno.setMatricula(1);

            //aluno.setNome("Irineu");
            //alunoDAO.inserir(aluno);
            System.out.println("Aluno inserido com sucesso");
            //System.out.println("matricula " + aluno.getMatricula());
            //double nota = 10;
            //alunoDAO.inserirNota(2, nota, aluno.getMatricula());
            alunoDAO.listarAlunos();
        } catch(SQLException e){
            System.err.println("Não foi possível conectar ao BD");
        } catch(RuntimeException e){
            System.err.println(e.getMessage());
        }
    }
}

