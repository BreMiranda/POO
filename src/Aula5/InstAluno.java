package Aula5;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class InstAluno {

    public static void main(String[] args) {
        // comece o código aqui
        
        Aluno aluno1 = new Aluno("Brenda", 236681, "ads"); //criando o objeto e atribuindo dados a ele
        Aluno aluno2 = new Aluno("bruna", 23681, "arq");
        
        ArrayList<Aluno> listaAlunos = new ArrayList(); //cria uma lista de alunos essa linha depois do = é o instanciamento
        
        listaAlunos.add(aluno1); //adicionando na lista os alunos
        listaAlunos.add(aluno2); //adicionando na lista os alunos
        
        
        //listado abaixo, duas formas de fazer
        for (int i = 0; i < listaAlunos.size(); i++){ //laço de repetição para poder exibir o que está dentro do objeto
            JOptionPane.showMessageDialog(null, listaAlunos.get(i).getNome()); //imprimindo na tela
        
        }
        
        for(Aluno a: listaAlunos){//instanciando o aluno ao A
            JOptionPane.showMessageDialog(null, a.getNome()); //o A diz respeito a posição do aluno, exemplo: aluno 1 e dois
        }
        
        listaAlunos.forEach(a ->{ //foreach faz a mesma coisa que o for de cima, mas é mais indicado pela otimização do tempo.
         JOptionPane.showMessageDialog(null, a.getNome()); 
        });
        
    }

}
