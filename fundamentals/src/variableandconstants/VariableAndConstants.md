Variavel:

    Uma variável em Java é um local na memória do computador que armazena um valor específico. Ela possui um tipo de dado associado que determina o tipo e tamanho do valor que pode ser armazenado. As variáveis são fundamentais para armazenar informações de forma literal ("temporárias") que facilita a manipulação de dados em um programa Java. Elas podem ser modificadas durante a execução do programa e são identificadas por um nome único.

Por exemplo:

    tipo(String) identificador(name) = valor("joao");
    String name = "joao";


Variavel constante:
   
    Uma constante em Java é um valor que não pode ser alterado durante a execução do programa. Ela é declarada com a palavra-chave "final" e é usada para representar dados que não devem ser modificados ao longo do código. Seguinto os padroes do Java, as constantes são escritas em letras maiúsculas e separadas por underscores para melhor legibilidade.

Por exemplo:

    final int MAX_SCORE = 100;

Inference:

    A partir da versão do java 10 temos uma funcionalidade para declaração de variável que não é necessário informar o tipo na declaração de uma variável.

Por exemplo:

    var valorInteiro = 1; 
    var valorDouble = 1.2; 
    var valorString = "joao"; 
    var valorChar = 'A';

    Importante ressaltar que não é permitido atribuir um valor diferente do que foi inicializado a variável

Por exemplo:  

    var valorInteiro = 1;
    valorInteiro = 1.2;