package com.example.educacao.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.dao.DAO;
import com.example.educacao.model.Aluno;

public class AlunoDAO extends DAO {
    public AlunoDAO(Connection conn) {
        super(conn);
    }

    public void inserir(Aluno aluno){
        try {
            var sql = "insert into aluno (nome) values (?)";
            var statement = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, aluno.getNome());
            statement.executeUpdate();
            var result = statement.getGeneratedKeys();
            if(result.next()){
                aluno.setMatricula(result.getInt(1));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Não foi possível inserir o aluno",e);
        }
      
    }

    public void inserirNota(int idDisciplina, double nota, int matricula){
        if(idDisciplina <= 0 || idDisciplina > 3){
            throw new IllegalArgumentException("O id da disciplina não está entre 1 e 3");
        }
        try{
            var sql = "update aluno set nota" + idDisciplina + " = ? where matricula = ?";
            var statement = conn.prepareStatement(sql);
            statement.setDouble(1, nota);
            statement.setInt(2, matricula);
            statement.execute();
        } catch (SQLException e){
            throw new RuntimeException("Não foi possível registar a nota",e);
        }
    }

    public void listarAlunos(){
        try {
            System.out.println("LISTANDO OS ALUNOS BOMDIMAIZE");
            var statement = conn.createStatement();
            var result = statement.executeQuery("select * from aluno");

            while(result.next()){
                System.out.printf("Matricula: %d Nome: %s Nota1: %f Nota2: %f Nota2: %f",
                result.getInt("matricula"),result.getString("nome"),result.getDouble("nota1"),result.getDouble("nota2"),result.getDouble("nota3"));
                System.out.println();
            }

        }catch (SQLException e){
            System.err.println("Não foi possível executar a consulta ao banco: " + e.getMessage());
        }
    }
        
    
}
