package Projeto1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        // comece o código aqui

        ArrayList<Aluno> listaAlunos = new ArrayList();

        String selecao = JOptionPane.showInputDialog("Digite: 1) Criar alunos 2)Mostrar Alunos e 3)sair");

        while (!selecao.equals("3")) {
            if (selecao.equals("1")) {
                Aluno a = new Aluno();

                a.setNome(JOptionPane.showInputDialog("informe o nome")); //pedindo para informar e setando a infomação passada pelo usuário
                a.setRa(Integer.parseInt(JOptionPane.showInputDialog("Informe o RA"))); // o parse int seria paraa transformar o a em inteiro
                a.setCurso(JOptionPane.showInputDialog("informe o curso")); //pedindo para informar e setando a infomação passada pelo usuário

                listaAlunos.add(a);
            } else {
                if (selecao.equals("2")) { //aqui vamos garantir que as opções dadas pelo usuário estão dentro do menu
                    listaAlunos.forEach(a -> { //foreach faz a mesma coisa que o for de cima, mas é mais indicado pela otimização do tempo.
                        JOptionPane.showMessageDialog(null, a.Imprimir());
                    });
                }
            }
            selecao = JOptionPane.showInputDialog("Digite: 1) Criar alunos 2)Mostrar Alunos e 3)sair");
        }
    }

}
