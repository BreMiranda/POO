/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula3;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Calculadora {

    public int soma(int num1, int num2) {
        return num1 + num2;
    }

    public double soma(double num1, double num2) {
        return num1 + num2;
    }

    public int subtracao(int num1, int num2) {
        return num1 - num2;
    }

    public double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public int mult(int num1, int num2) {
        return num1 * num2;
    }

    public double mult(double num1, double num2) {
        return num1 * num2;
    }

    public int divisao(int num1, int num2) {
        return num1 / num2;
    }

    public double divisao(double num1, double num2) {
        return num1 / num2;
    }

    public void menu() {
        Object[] itens = {"somar", "subtrair", "multiplicar", "dividir", "sair"};
        Object selectedItem = JOptionPane.showInputDialog(null, "escolha um item", "opcao", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

        while (selectedItem != "Sair") {
            String num1 = JOptionPane.showInputDialog("Digite o primeiro número:");
            String num2 = JOptionPane.showInputDialog("Digite o segundo número:");
            if (selectedItem == "somar") {
                if (num1.contains(".") || num2.contains(".")) { //aqui ele está comparando se há a existencia do ponto no numero informado pelo usuário, para assim determinar qual das somas seria o mais justo
                    JOptionPane.showMessageDialog(null, this.soma(Double.parseDouble(num1), Double.parseDouble(num2))); //transforma o numero em double
                } else {
                    JOptionPane.showMessageDialog(null, this.soma(Integer.parseInt(num1), Integer.parseInt(num2))); //transforma o numero em int
                }
            } else {
                if (selectedItem == "subtrair") {
                    if (num1.contains(".") || num2.contains(".")) { //aqui ele está comparando se há a existencia do ponto no numero informado pelo usuário, para assim determinar qual das somas seria o mais justo
                        JOptionPane.showMessageDialog(null, this.soma(Double.parseDouble(num1), Double.parseDouble(num2))); //transforma o numero em double
                    } else {
                        JOptionPane.showMessageDialog(null, this.soma(Integer.parseInt(num1), Integer.parseInt(num2))); //transforma o numero em int

                    }
                }
            }
            if (selectedItem == "multiplicar") {
                if (num1.contains(".") || num2.contains(".")) { //aqui ele está comparando se há a existencia do ponto no numero informado pelo usuário, para assim determinar qual das somas seria o mais justo
                    JOptionPane.showMessageDialog(null, this.soma(Double.parseDouble(num1), Double.parseDouble(num2))); //transforma o numero em double
                } else {
                    JOptionPane.showMessageDialog(null, this.soma(Integer.parseInt(num1), Integer.parseInt(num2))); //transforma o numero em int

                }
                if (selectedItem == "dividir") {
                    if (!num2.equals("0")) { //compara para ver se o numero informado é 0, se for zero é impossivel dividir e irá retornar "impossivel calcular"
                        if (num1.contains(".") || num2.contains(".")) {
                            JOptionPane.showMessageDialog(null, this.divisao(Double.parseDouble(num1), Double.parseDouble(num2)));
                        } else {
                            JOptionPane.showMessageDialog(null, this.divisao(Integer.parseInt(num1), Integer.parseInt(num2)));
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Impossível calcular");
                    }
                }
            }

            //selectedItem = JOptionPane.showInputDialog(null, "Escolha um item", "Opçao", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
        }
    }
}
