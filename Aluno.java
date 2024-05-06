/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.oo;

/**
 *
 * @author rafaelamoreira
 */
public class Aluno {

    // atributos = caracteristicas
    int ra;
    String nome;

    // construtor
    public Aluno(int ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }
       
    public Aluno(String nome){
        this.nome = nome;
    }
    
    public Aluno(){}

    // metodos = comportamentos
    public int getRa() {
        return this.ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "RA: " + this.ra
                + ", Nome: " + this.nome;
    }

}
