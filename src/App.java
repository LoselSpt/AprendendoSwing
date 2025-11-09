import javax.swing.JButton; //import da classe janela JFrame que permite criar janelas
import javax.swing.JFrame; //import da classe JLabel que permite criar rótulos de texto
import javax.swing.JLabel; //import da classe JPanel que permite criar painéis
import javax.swing.JPanel; //import da classe JButton que permite criar botões

public class App{
    public static void main(String[] args){
        JFrame janela = new JFrame("Minha primeira Janela"); // cria a primeira janela swing
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //define a operação de fechar
        janela.setSize(400, 300); //define o tamanho da janela
        


        // Criaçao dos componetnes
        JPanel painel = new JPanel(); //cria um painel a onde e possivel adicionar componentes
        JLabel rotulo = new JLabel("Ola, Clique no botao ai compadre!"); //cria um rótulo de texto
        JButton botao = new JButton("Clique aqui!"); //cria um botão

        // Adiciona os componentes ao painel
        painel.add(rotulo); //adiciona o rótulo ao painel
        painel.add(botao); //adiciona o botão ao painel

        // adiciona o painel a janela
        janela.add(painel); //adiciona o painel a janela

        janela.setVisible(true); //torna a janela visível
     
    }
}