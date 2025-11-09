import javax.swing.JFrame;//import da classe janela JFrame que permite criar janelas
import javax.swing.JLabel;//import da classe JLabel que permite criar rótulos de texto
import javax.swing.JPanel;//import da classe JPanel que permite criar painéis
import javax.swing.JButton;//import da classe JButton que permite criar botões
import java.awt.event.ActionListener;//importa a interface ActionListener para tratar eventos de ação
import java.awt.event.ActionEvent;//importa a classe ActionEvent que representa um evento de ação


public class JanelaInterativa {
    public static void main(String[] args){
        JFrame janela = new JFrame("Aplicativo interativo"); // cria a janela swing
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //define a operação de fechar
        janela.setSize(400, 200); //define o tamanho da janela")

        JPanel painel = new JPanel(); //cria um painel para adicionar componentes

        // Final: PErmite que o "Rotulo" seja acessado dentro do actionlistener
        final JLabel rotulo = new JLabel("Aguardando ação..."); //cria um rótulo de texto
        JButton botao = new JButton("Clique em mim!"); //cria um botão


        // Eventos 
        botao.addActionListener(new ActionListener() {
            @Override 
            public void actionPerformed(ActionEvent e){
                rotulo.setText("Botão Clicado aunwte!"); //atualiza o texto do rótulo quando o botão é clicado

            }
        });//fecha o addActionListener

        // Adiciona os componentes ao painel
        painel.add(rotulo); //adiciona o rótulo ao painel
        painel.add(botao); //adiciona o botão ao painel
        janela.add(painel); //adiciona o painel a janela
        janela.setVisible(true); //torna a janela visível
        }
    }
    

