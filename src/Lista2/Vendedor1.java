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
public class Vendedor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Vendedor> listaVendedor = new ArrayList();

        String selecao = JOptionPane.showInputDialog("Digite: 1) Cadastrar Vendedor  2)Calcular Venda e 3)Sair");
    
        while (!selecao.equals("3")) {
            if (selecao.equals("1")) {
                Vendedor Vendedor = new Vendedor(); 

                Vendedor.setNome(JOptionPane.showInputDialog("informe o nome")); 
                Vendedor.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo"))); 
                Vendedor.setPercentualComissao(Double.parseDouble(JOptionPane.showInputDialog("informe o valor da comissão")));

                listaVendedor.add(Vendedor); 

            } else if (selecao.equals("2")) { 
                listaVendedor.forEach(Vendedor -> { 
                     double valorVenda = (Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da venda: ")));
                     double desconto = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do desconto:"));
                     JOptionPane.showMessageDialog(null, Vendedor.imprimir(valorVenda, desconto));
                  // JOptionPane.showMessageDialog(Vendedor.imprimir(Double.parseDouble( JOptionPane.showInputDialog("Informe o valor da venda")), Double.parseDouble
                 //(JOptionPane.showInputDialog("informe o valor do desconto"))));
                });
            }
            selecao = JOptionPane.showInputDialog("Digite: 1) Cadastrar Vendedor  2)Calcular Venda e 3)Sair");
        }
    }

}
