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
public class Aluno_Facens {

    public int Ra;
    public String nome;
    public String curso;
    public String anoIngresso;

    public int getRa() {
        return Ra;
    }

    public void setRa(int Ra) {
        this.Ra = Ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(String anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public double notaFinal(double num1, double num2) {
        return (num1 + num2) / 2;
    }

    public double notaFinal(int num1, int num2) {
        return (num1 + num2 )/ 2;
    }

    public double resultadoFinal(double nota1, double nota2, double nota3, double nota4) {
        return (nota1 * 0.15) + (nota2 * 0.30) + (nota3 * 0.10) + ( nota4 * 0.45) ; 
    }
    
    public void menu() {
        Object[] itens = {"Criar Aluno", "Calcular Média", "Sair"};
        Object selectedItem = JOptionPane.showInputDialog(null, "escolha um item", "opcao", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

        while (selectedItem != "Sair") {
            if (selectedItem == "Criar Aluno") {

                String inputRaStr = JOptionPane.showInputDialog("Informe a idade:");
                int inputRa = Integer.parseInt(inputRaStr); // Convertendo para inteiro
                this.setRa(inputRa);

                String inputNome = JOptionPane.showInputDialog("Informe o nome:");
                this.setNome(inputNome);

                String inputCurso = JOptionPane.showInputDialog("Informe o nome do curso:");
                this.setCurso(inputCurso);

                String inputAnoIngresso = JOptionPane.showInputDialog("Informe o ano de ingresso:");
                this.setAnoIngresso(inputAnoIngresso);

            } else {
                if (selectedItem == "Calcular Média") {
                    int ano = Integer.parseInt(anoIngresso);

                    if (ano <= 2019) {
                        String num1 = JOptionPane.showInputDialog("Digite a primeira nota:");
                        String num2 = JOptionPane.showInputDialog("Digite a segunda nota:");

                        if (num1.contains(".") || num2.contains(".")) { //aqui ele está comparando se há a existencia do ponto no numero informado pelo usuário, para assim determinar qual das somas seria o mais justo
                            JOptionPane.showMessageDialog(null, this.notaFinal(Double.parseDouble(num1), Double.parseDouble(num2))); //transforma o numero em double
                        } else {
                            JOptionPane.showMessageDialog(null, this.notaFinal(Integer.parseInt(num1), Integer.parseInt(num2))); //transforma o numero em int
                        }
                    } else {
                        String Ac1 = JOptionPane.showInputDialog("Digite a nota da Ac1:");
                        double nota1 = Double.parseDouble(Ac1);
                       
                        String Ac2 = JOptionPane.showInputDialog("Digite a nota da Ac2:");
                        double nota2 = Double.parseDouble(Ac2);
                        
                        String Af = JOptionPane.showInputDialog("Digite a nota da Af:");
                        double nota3 = Double.parseDouble(Af);
                        
                        String Ag = JOptionPane.showInputDialog("Digite a nota da Ag:");
                        double nota4 = Double.parseDouble(Ag);
                        
                        JOptionPane.showMessageDialog(null, this.resultadoFinal(nota1, nota2, nota3, nota4));
                    }
                }
            }
            selectedItem = JOptionPane.showInputDialog(null, "Escolha um item", "Opçao", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
        }
    }
}
