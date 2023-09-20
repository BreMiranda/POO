/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lista2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author bre-r
 */
public class Apolice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Apolice> listaApolice = new ArrayList();

        String selecao = JOptionPane.showInputDialog("Digite: 1) Criar Apolice  2)Mostrar dados da apólice e 3)Sair");

        while (!selecao.equals("3")) {
            if (selecao.equals("1")) {
                Apolice apolice = new Apolice(); //criando novo funcionario

                apolice.setNome(JOptionPane.showInputDialog("informe o nome")); //pedindo para informar e setando a infomação passada pelo usuário
                apolice.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe o Número da apolice"))); //utilizanod o parse int para receber o número da apolice
                apolice.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade")));// o parse int seria paraa transformar o a em inteiro
                String inputSexoStr = JOptionPane.showInputDialog("Informe a o sexo");
                char inputSexo = inputSexoStr.charAt(0);
                apolice.setSexo(inputSexo); //recebendo o dado do usuário como int e atribuiindo ao char, somente o primeiro caracter digitado 
                apolice.setValorAutomovel(Double.parseDouble(JOptionPane.showInputDialog("informe o valor do automovel")));//pedindo para informar e setando a infomação passada pelo usuário

                listaApolice.add(apolice); //adicionando o funcionario a lista de funcionario

            } else if (selecao.equals("2")) { //aqui vamos garantir que as opções dadas pelo usuário estão dentro do menu
                listaApolice.forEach(a -> { //foreach faz a mesma coisa que o for de cima, mas é mais indicado pela otimização do tempo.
                    JOptionPane.showMessageDialog(null, a.Imprimir());
                });
            }
            selecao = JOptionPane.showInputDialog("Digite: 1) Criar Apolice  2)Mostrar dados da apólice e 3)Sair");
        }

    }

}
