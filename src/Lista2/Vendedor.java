/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2;

/**
 *
 * @author bre-r
 */
public class Vendedor {

    private int codigo;
    private String nome;
    private double percentualComissao;

    public Vendedor() {
    }

    public Vendedor(int codigo, String nome, double percentualComissao) {
        this.codigo = codigo;
        this.nome = nome;
        this.percentualComissao = percentualComissao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public double calcularPagamentoComissao(double valorVenda) { //iniciando a sobrecarga de metodos
        return valorVenda * percentualComissao / 100;
    }

    public double calcularPagamentoComissao(double valorVenda, double desconto) { //sobrecarga de metodos
        return this.calcularPagamentoComissao(valorVenda) - desconto;
    }
    
    public String imprimir (double valorVenda, double desconto){
        return "o vendedor "+this.nome+" cujo tem o código "+this.codigo+" que fez uma venda no valor de "+valorVenda+
                " com a comissão em "+this.percentualComissao+" que resultou no desconto de "+desconto+" Valor a pagar"+this.calcularPagamentoComissao(valorVenda, desconto);
    }
}
