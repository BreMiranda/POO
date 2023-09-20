package lista2_exercicio2;

import javax.swing.JOptionPane;

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
    
    public double calcularPagamentoComissao(double valorVenda){
        return ((valorVenda * percentualComissao) / 100);
    }
    
    public double calcularPagamentoComissao(double valorVenda, double desconto){
        return (calcularPagamentoComissao(valorVenda) - desconto);
    }
    
    public String imprimir(double valorVenda, double desconto){
        return "Código: " + this.codigo 
                + "\nNome: " + this.nome 
                + "\nValor da Venda: " + valorVenda 
                + "\n% Comissao: " + this.percentualComissao 
                + "\nDesconto: " + desconto 
                + "\nValor a Pagar da comissao: " + this.calcularPagamentoComissao(valorVenda, desconto);
    }
    
    public void menu(){
        Object[] opcoesMenu = {"Cadastrar Vendedor", "Calcular Venda", "Sair"};
        String opcaoSelecionada = (String)(JOptionPane.showInputDialog(null, "Escolha uma opção", "Opções", JOptionPane.INFORMATION_MESSAGE, null, opcoesMenu, opcoesMenu[0]));       
        
        while (!opcaoSelecionada.equals ("Sair")){
            if (opcaoSelecionada.equals("Cadastrar Vendedor")){   
                codigo = (Integer.parseInt(JOptionPane.showInputDialog("Digite o código do vendedor:")));
                nome = (JOptionPane.showInputDialog("Informe o nome do vendedor:"));
                percentualComissao = (Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual da comissão:")));
            }else{
                double valorVenda = (Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da venda: ")));
                double desconto = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do desconto:"));
                
                JOptionPane.showMessageDialog(null, this.imprimir(valorVenda, desconto));
            }
            
            opcaoSelecionada = (String) (JOptionPane.showInputDialog(null, "Escolha uma opção", "Opções", JOptionPane.INFORMATION_MESSAGE, null, opcoesMenu, opcoesMenu[0]));
        }
    }
}
