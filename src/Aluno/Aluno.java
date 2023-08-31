/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aluno;

import javax.swing.JOptionPane;

/**
 * @author bre-r
 */
public class Aluno {
    
    public String ra; 
    public String nome;
    private float ac1;
    private float ac2;
    private float ag;
    private float af;

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAc1() {
        return ac1;
    }

    public void setAc1(float ac1) {
        this.ac1 = ac1;
    }

    public float getAc2() {
        return ac2;
    }

    public void setAc2(float ac2) {
        this.ac2 = ac2;
    }

    public float getAg() {
        return ag;
    }

    public void setAg(float ag) {
        this.ag = ag;
    }

    public float getAf() {
        return af;
    }

    public void setAf(float af) {
        this.af = af;
    }
    
    double calcularMedia(){
     //retornar (AC1 * 0,15) + (AC2 *0,30) + (AG * 0,10) + (AF * 0,45)
     double soma = (this.ac1 * 0.15) + (this.ac2 * 0.30) + (this.ag * 0.10) + (this.af *0.45);
     return soma;
    }
    
    String verificarAprovacao(){
        if(calcularMedia() >= 5){
            return "Aprovado";
        }
        else{
            return "Reprovado";
        }
    }
    
       public String imprimir() {
        return "O aluno " + this.getNome() + " tem RA nº " + this.getRa() + " Foi " + this.verificarAprovacao() + "\n AC1: " +this.getAc1() + " \n AC2: " +this.getAc2() + " \n AG: " +this.getAg() +  " \n AF: " +this.getAf() + " A média foi " +this.calcularMedia();
    }
    
    public void menu(){
     Object[] itens = { "Criar Aluno", "Mostrar Aluno", "Sair" };
     Object selectedItem  = JOptionPane.showInputDialog(null, "escolha um item", "opcao", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
        
            while (selectedItem != "Sair") {
               if (selectedItem == "Criar Aluno") {
                   
                    String inputNome = JOptionPane.showInputDialog("Informe o nome:");
                    this.setNome(inputNome);
                    
                    String inputRa = JOptionPane.showInputDialog("Informe o RA:");
                    this.setRa(inputRa);

                    String inputAc1s = JOptionPane.showInputDialog("Informe a nota da AC1:");
                    float inputAc1 = Float.parseFloat(inputAc1s); // Convertendo para Float
                    this.setAc1(inputAc1);
                    
                    String inputAc2s = JOptionPane.showInputDialog("Informe a nota da AC2:");
                    float inputAc2 = Float.parseFloat(inputAc2s); // Convertendo para Float
                    this.setAc2(inputAc2);
                    
                    String inputAgs = JOptionPane.showInputDialog("Informe a nota da AG:");
                    float inputAg = Float.parseFloat(inputAgs); // Convertendo para Float
                    this.setAg(inputAg);
                    
                    String inputAfs = JOptionPane.showInputDialog("Informe a nota da AF:");
                    float inputAf = Float.parseFloat(inputAfs); // Convertendo para Float
                    this.setAf(inputAf);
                    
                    
                } else {
                    if (selectedItem == "Mostrar Aluno") {
                        JOptionPane.showMessageDialog(null, this.imprimir());                    
                    }
                }
                selectedItem = JOptionPane.showInputDialog(null,"Escolha um item", "Opçao", JOptionPane.INFORMATION_MESSAGE, null, itens, itens [0]);
            }
    }
    
    
    
}

