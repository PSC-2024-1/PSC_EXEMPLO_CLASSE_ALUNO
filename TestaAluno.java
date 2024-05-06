/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ex01.oo;

import java.util.ArrayList;

/**
 *
 * @author rafaelamoreira
 */
public class TestaAluno {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

        Aluno aluno2 = new Aluno("Hugo");

        Aluno aluno3 = new Aluno(123, "Débora");

        ArrayList<Aluno> listaAlunos = new ArrayList();

       // System.out.println("Aluno 1: " + aluno1.toString());

      //  System.out.println("Aluno 2: " + aluno2.toString());

      //  System.out.println("Aluno 3: " + aluno3.toString());

        aluno1.setRa(143);
        aluno1.setNome("Amanda");

      //  System.out.println("Aluno 1: " + aluno1.toString());

        aluno2.setRa(632);
        aluno2.setNome("Lucas");

      //  System.out.println("Aluno 2: " + aluno2.toString());

      //  System.out.println("Nome do aluno 1: " + aluno1.getNome());

        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);
        listaAlunos.add(aluno3);
        
        
        for (Aluno aluno: listaAlunos) {
            System.out.println(aluno.getNome());
        }

    }

}
