## HAAAAAAAAAAAAI GAYEESS SOU EU LOSELLLL APRENDENDO JAVA SWINGGGG

Criei esse repositorio para colocar meu aprendizado da bibilioteca de java swing, que e utilizado para criaçao de interface graficas em java

Durante umas 5h estudei essa bomba, e aqui ta uma anotaçao que eu aprendi com isso. provavelmente vou privar essa bomba

## JFrame |Criaçao de Janelas|
Oque ele e? e o objeto principal, a moldura da aplicaçao, e a janela que tem os botoes de fechar minimizar e maximizar ou seja *A JANELA*


COMO SE USA: <JFrame janela = new JFrame("titulo");>


ponto chave: Voce precisa definior que acontece quando fecha
no meu caso eu deixei esse comando janela.setDEfaultCloseOperation(JFrame.EXIT_ON_CLOSE); sem isso, a janela fecha, soque o programa continua rodando em segundo plano.

## JPanel, JButton, JLabel |Componentes|
JPanel : Painel: Ele e meio que um quadro, uma tela que voce coloca dentro de uma moldura que e o JFrame, ele serve para organizar e agrupar outros componentes, voce pode ter varios paineis dentro de uma mesma janela.

JLabel : Rotulo: E um Componente Simples para mostras coisas para o usuario, como Textos ou imagens, ele e so de leitura e o usuario nao clica nele, (pelo que eu sei)

JButton : Botão: E o componente de de interaçao mais comum, o usuario clica nele para disparar uma açao que vai ter um ouvinte 

## ActionListener | Tratamento De Eventos |
Oque eeee? e o cerebro do botao, e um ouvinte que voce anexa ao JButton

pense que: O Jutton e uma campainha e o ActionListener e o Ouvido que fica esperando a Camapnha tocar para ir atender :D

Como se usa essa bomba?: botao.addActionListener(...). O metodo actionPerformed(ActionEvent e) e o codigo que executa exatamente quando o botao e clicado

## Layout nulo | setLayout(null)
Oque e?: Basicamente e JPanel ou JFrame, nao se precupem em organizar os componentes deixa que eu faço isso moro?

Como se usa? painel.setLayout(null);

Consequenciasssss: Voce e OBRIGADO, repito OBRIGADO a definir a posiçao e o tamanho exatoooo de cada componente usando componente.setBounds(x, y, largura, altura).
Mas pra que eu usei essa bomba? Foi essencial para o Butao Fujao, pois ele deu controle das cordenadas x e y do botao nao kkkk dai deu pra fazer ele ficar teleportando kkk

## Layouts Padrao | BorderLayout, FlowLayout|
Oque eles sao: Organizadores Automaticos
FlowLayout: Padrao do JPanel: Enfileira os componentes um apos o outros , da esquerda para a direita como palavras em um texto.

BorderLayout: Padrao Do JFrame: Divide a janela em 5 seçoes norte (NORTH), Sul (SOUTH), Leste (EAST), Oeste (WEST) "Down on the west coast, they got a saying, if you're not drinking, then you're not playing" e Centro (CENTER). e otimo para barras de menu vey ou barra de status

## JOptionPane |Caixas de Dialogo|
Oque e?: E uma classe super pratica para mostrar POP UPS simples

como se usa: to com preguiça de ficar indo no vscode e copiando o codigo, entao esse vai ser o ultimo <JOptionPane.showMEsageDialog(null, "Minha mensagem");

Para que se usa isso?: para dar mensagens rapidas para o usuario como "PARABENS VOCE GANHOU UM IPHONE 17" e logo em seguida coloca um formulario para ele colocar os dados do cartao de credito dele para resgatar o iphone 17.




