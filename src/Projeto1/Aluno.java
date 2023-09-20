/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projeto1;

import Aula5.*;

/**
 *
 * @author bre-r
 */
public class Aluno {
    
    private String nome;
    private int ra;
    private String curso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Aluno() {
    }

    public Aluno(String nome, int ra, String curso) {
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
    }
   
    public String Imprimir(){
        return "o aluno " +this.nome
                + " tem ra: " +this.ra
                + " e faz curso de " +this.curso;    
    }
    
}
