/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;
import javax.swing.JOptionPane;

/**
 *
 * @author bre-r
 */
public class Exercicio1 {
   
    private String cpf;
    private String nome; 
    private char sexo; 
    private int idade;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
     public String imprimir() {
        return "A pessoa(a) " + this.getNome() + " tem CPF nº " + this.getCpf() + " , com idade de: " + this.getIdade() + " Sexo: " +this.getSexo();
    }
    
    public void menu(){
     Object[] itens = { "Criar Pessoa", "Mostrar Pessoa", "Sair" };
     Object selectedItem  = JOptionPane.showInputDialog(null, "escolha um item", "opcao", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
        
            while (selectedItem != "Sair") {
               if (selectedItem == "Criar Pessoa") {
                    String inputCpf = JOptionPane.showInputDialog("Informe o CPF:");
                    this.setCpf(inputCpf);

                    String inputNome = JOptionPane.showInputDialog("Informe o nome:");
                    this.setNome(inputNome);

                    String inputIdadeStr = JOptionPane.showInputDialog("Informe a idade:");
                    int inputIdade = Integer.parseInt(inputIdadeStr); // Convertendo para inteiro
                    this.setIdade(inputIdade);
                    
                    String inputSexoStr = JOptionPane.showInputDialog("Informe o sexo:");
                    char inputSexoChar = inputSexoStr.charAt(0); // Pega o primeiro caractere da String
                    this.setSexo(inputSexoChar);
                    
                } else {
                    if (selectedItem == "Mostrar Pessoa") {
                        JOptionPane.showMessageDialog(null, this.imprimir());                    
                    }
                }
                selectedItem = JOptionPane.showInputDialog(null,"Escolha um item", "Opçao", JOptionPane.INFORMATION_MESSAGE, null, itens, itens [0]);
            }
    }
    
    }

