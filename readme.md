# Exercícios de SOLID - Uso de SOLID e POO

Esse repositório é referente ao exercícios da Lista 07, referente a modelagem de classes com SOLID

---

# 📋 O que propõe o exercício?

Criar um sistema que gerencie algumas informações dos países

1. Escreva uma classe que represente um país. Um país é representado através dos atributos: código ISO 3166-1 (ex.: BRA), nome (ex.: Brasil), população (ex.: 193.946.886) e a sua dimensão em Km2 (ex.: 8.515.767,049). Além disso, cada país mantém uma lista de outros países com os quais ele faz fronteira. Escreva a classe em Java e forneça os seus membros a seguir:
2. Construtor que inicialize o código ISO, o nome e a dimensão do país;
3. Métodos de acesso (getter/setter) para as propriedades código ISSO, nome, população e dimensão do país;
4. Um método que informe se outro país é vizinho do país que recebeu a mensagem;
5. Um método que retorne a densidade populacional do país;
6. BÔNUS) Crie um método que receba um país como parâmetro e retorne a lista de vizinhos comuns aos dois países.

# 🗂️ Classes criadas

1. [Pais](https://github.com/joaocruzzup/L7-ModelagemDeClasses/blob/main/src/main/java/org/example/Pais.java) → Responsável por definir o país
2. [CodigoPais](https://github.com/joaocruzzup/L7-ModelagemDeClasses/blob/main/src/main/java/org/example/CodigoPais.java) → Enum que define paises disponíveis
3. [BancoFronteiras](https://github.com/joaocruzzup/L7-ModelagemDeClasses/blob/main/src/main/java/org/example/BancoFronteiras.java) → Responsável por gerar as fronteiras dos paises
4. [PaisGerenciamento](https://github.com/joaocruzzup/L7-ModelagemDeClasses/blob/main/src/main/java/org/example/PaisGerenciamento.java) → Responsável por definir lógica dos métodos
5. [PaisOperacao](https://github.com/joaocruzzup/L7-ModelagemDeClasses/blob/main/src/main/java/org/example/PaisOperacao.java) → Interface que define contrato dos métodos
6. [PaisServico](https://github.com/joaocruzzup/L7-ModelagemDeClasses/blob/main/src/main/java/org/example/PaisServico.java) → Responsável por fazer a inversão de dependência

---

# ⏯️ Como executar os Programas

- Você precisará ter o [JDK 11](https://www.oracle.com/java/technologies/downloads/#java11) instalado no seu computador;
- Baixe o repositório do projeto (com todos os algoritmos);
- Abra o terminal e navegue até o o arquivo main presente na pasta de exercicio que você deseja executar;
- Compile o arquivo executando o comando `javac`, como mostra abaixo o exemplo executando o [Main](https://github.com/joaocruzzup/L7-ModelagemDeClasses/blob/main/src/main/java/org/example/Main.java) :
```
javac TesteMain.java
```
- Após compilar, execute o comando `java`, como mostra abaixo:
```
java Main.java
```

## 👨‍💻 Autor

Nome: João Cruz<br>Linkedin: https://www.linkedin.com/in/joaosilvacruz/

---

<h4 align=center>Made with 💚 by <a href="https://github.com/joaocruzzup">João Cruz</a></h4>
