package Aula5;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Func {

    public static void main(String[] args) {
        // comece o código aqui

        ArrayList<Funcionario1> listaFuncionario1 = new ArrayList(); // aqui estamos criando a lista de funcionarios e atribuindo ela a um array

        String selecao = JOptionPane.showInputDialog("Digite: 1) Criar Funcionario  2)Mostrar Funcionario e 3)Mostrar Funcionario");

        while (!selecao.equals("4")) {
            if (selecao.equals("1")) {
                Funcionario1 a = new Funcionario1(); //criando novo funcionario

                a.setNome(JOptionPane.showInputDialog("informe o nome")); //pedindo para informar e setando a infomação passada pelo usuário
                a.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o Código"))); // o parse int seria paraa transformar o a em inteiro
                a.setSetor(JOptionPane.showInputDialog("Informe o Setor"));//recebendo do usuário a função do funcionario
                a.setFuncao(JOptionPane.showInputDialog("Informe a função"));//recebendo do usuário a função do funcionario
                a.setSalario(Double.parseDouble(JOptionPane.showInputDialog("informe o salario"))); //pedindo para informar e setando a infomação passada pelo usuário

                listaFuncionario1.add(a); //adicionando o funcionario a lista de funcionario

            } else if (selecao.equals("2")) { //aqui vamos garantir que as opções dadas pelo usuário estão dentro do menu
                listaFuncionario1.forEach(a -> { //foreach faz a mesma coisa que o for de cima, mas é mais indicado pela otimização do tempo.
                    JOptionPane.showMessageDialog(null, a.Imprimir());
                });
            } else if (selecao.equals("3")) {
                JOptionPane.showInputDialog("Qual o código do funcionário? ");

                listaFuncionario1.forEach(a -> {//forEach sempre vai vim acompanhado da setinha ->

                });
            }
            selecao = JOptionPane.showInputDialog("Digite: 1) Criar Funcionario  2)Mostrar Funcionario, 3)Mostrar Funcionario e 4) sair");
        }

    }

}
