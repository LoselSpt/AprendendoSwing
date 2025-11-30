# ☕ Aprendendo Java Swing

> "Oi pessoall sou o jotave aprendendo ooooo JAVA SWINGGGG"

Este repositório foi criado para documentar meu aprendizado da biblioteca **Java Swing**, utilizada para criação de interfaces gráficas (GUI) em Java. Todo o conteúdo aqui é fruto de um estudo intensivo de cerca de 5 horas.

## 🚀 Sobre o Projeto

Aqui estão minhas anotações, códigos de teste e o projeto do **"Botão Fujão"**. O objetivo é fixar os conceitos básicos de janelas, componentes e eventos.

---

## 📚 Conceitos Aprendidos

### 1. JFrame (A Janela)
É a moldura da aplicação. É o objeto principal que contém os botões de fechar, minimizar e maximizar.
* **Como usar:** `JFrame janela = new JFrame("Título");`

> **⚠️ Ponto Chave:** É essencial definir o que acontece ao fechar a janela. Sem o comando abaixo, a janela fecha visualmente, mas o programa continua rodando na memória (background).
> ```java
> janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
> ```

### 2. Componentes Básicos
* **JPanel (Painel):** Funciona como um quadro dentro da moldura (JFrame). Serve para agrupar e organizar outros componentes. Você pode ter vários painéis numa mesma janela.
* **JLabel (Rótulo):** Componente simples para exibir textos ou imagens (apenas leitura). O usuário não clica nele.
* **JButton (Botão):** O componente de interação mais comum. Dispara uma ação quando clicado.

### 3. ActionListener (Tratamento de Eventos)
É o "cérebro" do botão. É um ouvinte que você anexa ao componente.

* **Analogia:** O `JButton` é uma campainha e o `ActionListener` é o ouvido esperando ela tocar para atender a porta.
* **Implementação:**
    ```java
    botao.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Código que executa quando clica
        }
    });
    ```

---

## 🎨 Gerenciamento de Layouts

### Layout Nulo (`null`)
Basicamente diz ao Java: "Não se preocupe em organizar, eu faço isso".
* **Como usar:** `painel.setLayout(null);`
* **Consequência:** Você é **OBRIGADO** a definir posição e tamanho exatos (`x`, `y`, `largura`, `altura`) usando `componente.setBounds()`.
* **Aplicação Prática:** Foi essencial para criar o **Botão Fujão**, pois permitiu manipular as coordenadas X e Y para fazer o botão se "teleportar" pela tela.

### Layouts Padrão
Organizadores automáticos do Swing:

* **FlowLayout (Padrão do JPanel):** Enfileira os componentes um após o outro, da esquerda para a direita (como palavras em um texto).
* **BorderLayout (Padrão do JFrame):** Divide a janela em 5 seções cardeais:
    * `NORTH` (Norte)
    * `SOUTH` (Sul)
    * `EAST` (Leste)
    * `WEST` (Oeste) _("Down on the west coast...")_ 🎶
    * `CENTER` (Centro)

---

## 💬 JOptionPane (Caixas de Diálogo)
Uma classe prática para mostrar Pop-ups simples.

* **Uso:**
    ```java
    JOptionPane.showMessageDialog(null, "Sua mensagem aqui");
    ```
* **Para que serve:** Enviar mensagens rápidas ao usuário (ex: avisos de erro ou "Parabéns, você ganhou um iPhone 17" 😉).

---

## Author
Feito por **João Vitor (Losell)** durante estudos de Java.
