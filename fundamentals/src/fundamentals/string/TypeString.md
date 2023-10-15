# Resumo Explicativo - Classe String em Java

A classe `String` em Java é uma classe fundamental que representa cadeias de caracteres. Ela é parte da biblioteca padrão do Java (`java.lang`) e é amplamente utilizada em programas Java para manipular e armazenar texto.

## Características Principais

- **Imutabilidade**: O conteúdo de uma string não pode ser modificado após a criação, garantindo consistência e segurança nos dados.

- **Construção de Strings**: Pode ser criada usando literais de string (delimitados por aspas duplas) ou utilizando o construtor da classe String.

- **Concatenação**: Permite a concatenação de strings usando o operador "+", o método `concat()` ou a concatenação direta de literais de string.

- **Comparação**: Oferece métodos para comparar strings, como `equals()`, `equalsIgnoreCase()`, `compareTo()`.

- **Acesso a Caracteres**: Permite acessar caracteres individuais da string usando o método `charAt()` e obter substrings usando `substring()`.

- **Transformação**: Fornece métodos para transformar a string em letras maiúsculas ou minúsculas (`toUpperCase()`, `toLowerCase()`).

- **Busca e Substituição**: Oferece métodos como `indexOf()`, `lastIndexOf()` para buscar substrings, `replace()` para substituir caracteres ou substrings.

- **Divisão e Junção**: Permite dividir uma string em substrings usando `split()` e unir várias strings usando `join()`.

## Exemplo de Uso

```java
String str1 = "Olá, Mundo!";
String str2 = new String("Java é poderoso.");

System.out.println(str1);
System.out.println(str1.length()); // Retorna o comprimento da string

String concatStr = str1 + " " + str2; // Concatenação usando operador '+'
System.out.println(concatStr);

System.out.println(str1.charAt(0)); // Acessa o primeiro caractere da string

String subStr = str2.substring(0, 4); // Obtém uma substring de índice 0 a 3
System.out.println(subStr);