import java.awt.BorderLayout;
import java.awt.event.ActionEvent; //import da classe janela JFrame Que permite crie janelas
import java.awt.event.ActionListener; //import da classe JPanel Que permite crie painéis
import java.io.File; //import da classe JLabel Que permite crie rótulos de texto
import java.net.URL; //import da classe JButton Que permite crie botões
import java.util.Random; //importa a classe JOptionPane que permite criar diálogos de mensagem
import javax.swing.JButton; //importa a interface ActionListener para tratar eventos de ação
import javax.swing.JFrame; //importa a classe ActionEvent que representa um evento de
import javax.swing.JLabel; //importa a classe Random para gerar números aleatórios
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants; //importa a classe File para manipulação de arquivos



public class JanelaFujona {
    private static Random random = new Random(); //cria uma instância da classe Random para gerar números aleatórios

    public static void main(String[] args) {
        JFrame janela = new JFrame(" Uma pergunta importante "); // cria a janela swing
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //define a operação de fechar
        janela.setSize(400, 200); //define o tamanho da janela
        janela.setResizable(false); //impede o redimensionamento da janela
        janela.setLayout(new BorderLayout());



        // layout nulo para posicionamento absoluto
        JPanel painel = new JPanel(); //cria um painel para adicionar componentes
        painel.setLayout(null);

        // Modificaçao do rotulo para centralizar o texto
        // Largula do painel e altura
        int larguraJanela = 400;
        int yFixo = 50; 

        // Criação dos componentes
        JLabel rotulo = new JLabel("Vocẽ Gosta mais da Taylor Swift doq da Lady Gaga?"); //cria um rótulo de texto
        java.awt.Dimension tamanhoPreferido = rotulo.getPreferredSize();
        rotulo.setHorizontalAlignment(SwingConstants.CENTER);
        
        JButton botaoSim = new JButton("Sim"); //cria um botão "Sim"
    
        JButton botaoNao = new JButton("Não"); //cria um botão "Não

        // Calcula o X para centralizar
        // largura da janela - largura do rotulo /2
        int novoX = (larguraJanela - tamanhoPreferido.width) / 2;

        //define as novas bordas
        rotulo.setBounds(novoX, yFixo, tamanhoPreferido.width,tamanhoPreferido.height);

        // posicionamento de tudo manualmente com setbounds
       /*  rotulo.setBounds(100, 50, 300, 30); //define a posição e o tamanho do rótulo */
        botaoSim.setBounds(80, 100, 80, 30); //define a posição e o tamanho do botão "Sim"
        botaoNao.setBounds(220, 100, 80, 30); //define a posição e o tamanho do botão

        // Açao do botao "sim"
        botaoSim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                /* JOptionPane.showMessageDialog(janela, "Eu sabia que voce gostava dela gustavo! voce odeia a lady gaga!");
                System.exit(0); //fecha a aplicação */
              /*   String mensagem = "<html><b>Eu Sabia!</b><br><i> Voce odeia a Lady Gaga!</i></html>";
                JOptionPane.showMessageDialog(janela,mensagem); */


            // caminho da imagem/nome dele
               try{
                 String nomeImagem = "taylor.jpeg";
                File arquivoImagem = new File(nomeImagem);

                URL urlImagem = arquivoImagem.toURI().toURL();

                String mensagem ="<html><center><b>Eu Sabia!</b><br><img src='" + urlImagem + "' width='152' height='92'><br><i> Voce odeia a Lady Gaga!</i></center></html>";
               JOptionPane.showMessageDialog(janela, mensagem, "Resposta", JOptionPane.INFORMATION_MESSAGE);            
            
            } catch (Exception ex){
                System.err.println("Erro ao carregar a imagem: " + ex.getMessage());
                String mensagemSimples = "<html><center><b>Eu Sabia!</b><br><i> Voce odeia a Lady Gaga!</i></center></html>";
                JOptionPane.showMessageDialog(janela, mensagemSimples, "Resposta", JOptionPane.INFORMATION_MESSAGE);

            }
                System.exit(0); //fecha a aplicação
            }
        }); 

        // Açao do botao nao
        botaoNao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                // pega o proprio botao que foi clicado
                JButton botaoClicado = (JButton) e.getSource();

                //pega o painel a onde o botao esta adicionado para sabermos o limite
                JPanel painel = (JPanel) botaoClicado.getParent();
                
                
                //pega as dimensoes do painel e do botao
                int painelLargura = painel.getWidth();
                int painelAltura = painel.getHeight();
                int botaoLargura = botaoClicado.getWidth();
                int botaoAltura = botaoClicado.getHeight();

                // calcula uma nova posiçao x aleatoria
                // o limite e a largura do painel menos a largura do botao
                int novoX = random.nextInt(painelLargura - botaoLargura);

                // 5 calcula uma nova posiçao y aleatoria
                int novoY = random.nextInt(painelAltura - botaoAltura);

                // define a nova posiçao do botao!
                botaoClicado.setBounds(novoX, novoY, botaoLargura, botaoAltura);
            }
            
        });

        //adiciona os componentes ao painel
        painel.add(rotulo); //adiciona o rótulo ao painel
        painel.add(botaoSim); //adiciona o botão "Sim" ao painel
        painel.add(botaoNao); //adiciona o botão "Não" ao painel

        //Adiciona o painel a janela
        janela.add(painel); //adiciona o painel a janela

        //centraliza  a janela na tela
        janela.setLocationRelativeTo(null);

        //exibe a janela
        janela.setVisible(true); //torna a janela visível


    }

}
