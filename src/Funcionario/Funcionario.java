/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionario;

import javax.swing.JOptionPane;

/**
 *
 * @author bre-r
 */
public class Funcionario {
    
    private int cracha;
    String nome;
    private char tipoVinculo;
    private float valorHora;
    private float qtdeHora;
    private float salario;
    private float valorDesconto;

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(char tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getQtdeHora() {
        return qtdeHora;
    }

    public void setQtdeHora(float qtdeHora) {
        this.qtdeHora = qtdeHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    
    float calcularValorSalario(){
    
        if(this.getTipoVinculo() == 'H')
            return this.getValorHora() * this.getQtdeHora() - this.getValorDesconto();
        else
         return this.getSalario() - this.getValorDesconto();
    }
    float salarinho(){
    
        if(this.getTipoVinculo() == 'H')
            return this.getValorHora() * this.getQtdeHora();
        else
         return this.getSalario();
            
        
    }    
    
     public String imprimir() {
        return "o Funcionario de nome: " +this.getNome() + "\n Crachá: " +this.getCracha() + "\n de tipo de vinculo: " +this.getTipoVinculo() + "\n valor salário " +this.salarinho() + "\n desconto: " +this.valorDesconto + "\n valor a Receber" +this.calcularValorSalario();
    }

      public void menu(){
     Object[] itens = { "Criar Funcionario", "Mostrar Funcionario", "Alterar remuneração", "Sair" };
     Object selectedItem  = JOptionPane.showInputDialog(null, "escolha um item", "opcao", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
        
            while (selectedItem != "Sair") {
               if (selectedItem == "Criar Funcionario") {
                   
                    String inputNome = JOptionPane.showInputDialog("Informe o nome:");
                    this.setNome(inputNome);
                    
                    String inputCrachas = JOptionPane.showInputDialog("Informe a idade:");
                    int inputCracha = Integer.parseInt(inputCrachas); // Convertendo para inteiro
                    this.setCracha(inputCracha);

                    String inputTipoVinculoS = JOptionPane.showInputDialog("Informe o tipo de vinculo:");
                    char inputTipoVinculo = inputTipoVinculoS.charAt(0); // Pega o primeiro caractere da String
                    this.setTipoVinculo(inputTipoVinculo);
                    
                    String inputSalarioS = JOptionPane.showInputDialog("Informe o valor das hrs:");
                    float inputSalario = Float.parseFloat(inputSalarioS); // Convertendo para Float
                    this.setSalario(inputSalario);
                    
                    String inputQtdeHoraS = JOptionPane.showInputDialog("Informe a Qt de hrs:");
                    float inputQtdeHora = Float.parseFloat(inputQtdeHoraS ); // Convertendo para Float
                    this.setQtdeHora(inputQtdeHora);
                    
                    String inputValorHoras = JOptionPane.showInputDialog("Informe o valor das hrs:");
                    float inputValorHora = Float.parseFloat(inputValorHoras); // Convertendo para Float
                    this.setValorHora(inputValorHora);
                    
                    
                } 
               
                if (selectedItem == "Alterar remuneração") {
                    
                    String inputTipoVinculoS = JOptionPane.showInputDialog("Informe o tipo de vinculo:");
                    char inputTipoVinculo = inputTipoVinculoS.charAt(0); // Pega o primeiro caractere da String
                    this.setTipoVinculo(inputTipoVinculo);
                    
                        if(this.getTipoVinculo() == 'H'){
                        String inputValorHoras = JOptionPane.showInputDialog("Informe o valor das hrs:");
                        float inputValorHora = Float.parseFloat(inputValorHoras); // Convertendo para Float
                        this.setValorHora(inputValorHora);

                        String inputQtdeHoraS = JOptionPane.showInputDialog("Informe a Qt de hrs:");
                        float inputQtdeHora = Float.parseFloat(inputQtdeHoraS ); // Convertendo para Float
                        this.setQtdeHora(inputQtdeHora);
                        }else{
                         String inputSalarioS = JOptionPane.showInputDialog("Informe o valor das hrs:");
                        float inputSalario = Float.parseFloat(inputSalarioS); // Convertendo para Float
                        this.setSalario(inputSalario);
                    
                        }
               
                }else {
                    if (selectedItem == "Mostrar Funcionario") {
                        JOptionPane.showMessageDialog(null, this.imprimir());                    
                    }
                }
                selectedItem = JOptionPane.showInputDialog(null,"Escolha um item", "Opçao", JOptionPane.INFORMATION_MESSAGE, null, itens, itens [0]);
            }
    }
    
    
}
