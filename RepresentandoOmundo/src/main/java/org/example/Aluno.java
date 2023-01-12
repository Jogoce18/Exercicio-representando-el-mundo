package org.example;

import java.util.ArrayList;
import java.util.List;
public class Aluno {

    private String nome;
    private  String idade;
    private String anoIngreso;
    private String periodo;
    private String curso;


   //construtor

    public Aluno( String nome, String idade, String curso, String anoIngreso, String periodo) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.anoIngreso = anoIngreso;
        this.periodo = periodo;
    }

    //metodos


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getAnoIngreso() {
        return anoIngreso;
    }

    public void setAnoIngreso(String anoIngreso) {
        this.anoIngreso = anoIngreso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
