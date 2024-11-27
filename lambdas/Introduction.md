
# Introdução ao Lambda no Java

As expressões lambda foram introduzidas no Java 8 e representam um grande avanço na linguagem, tornando-a mais funcional e expressiva. Lambdas são essencialmente funções anônimas que podem ser tratadas como objetos e passadas como argumentos para métodos. Elas permitem escrever código mais conciso e legível, especialmente ao trabalhar com interfaces funcionais, como as usadas em APIs de streams e coleções.

## Estrutura de uma Lambda
Uma expressão lambda tem a seguinte estrutura:

```java
(parameters) -> { body }
```

- **Parâmetros**: os argumentos que a lambda recebe.
- **Operador `->`**: separa os parâmetros da implementação.
- **Corpo**: a lógica ou instrução que a lambda executa.

## Exemplo básico
Imagine um exemplo simples com a interface funcional `Runnable`:

```java
Runnable runnable = () -> System.out.println("Olá, Lambda!");
new Thread(runnable).start();
```

Neste caso:
- `()` indica que a lambda não recebe parâmetros.
- O corpo contém apenas a instrução `System.out.println`.

## Interface Funcional
Uma interface funcional é qualquer interface que possui exatamente um método abstrato. Elas servem como alvos para expressões lambda. Um exemplo é a interface `Comparator<T>`:

```java
Comparator<Integer> comparator = (a, b) -> Integer.compare(a, b);
```

## Benefícios das Lambdas
- **Redução de código boilerplate**: elimina a necessidade de classes anônimas.
- **Legibilidade**: torna o código mais simples e direto.
- **Integração com Streams**: facilita operações como filtragem, mapeamento e redução de coleções.

## Exemplo prático com Streams
Usando lambdas para filtrar uma lista:

```java
List<String> nomes = Arrays.asList("João", "Maria", "Carlos", "Ana");

List<String> filtrados = nomes.stream()
                              .filter(nome -> nome.startsWith("A"))
                              .collect(Collectors.toList());

System.out.println(filtrados); // Saída: [Ana]
```

## Conclusão
Lambdas são uma ferramenta poderosa para simplificar o código no Java moderno, principalmente ao trabalhar com coleções e APIs que exigem lógica concisa. Elas trazem para o Java conceitos de programação funcional, aumentando a flexibilidade e eficiência do código.