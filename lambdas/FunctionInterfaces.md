# Interfaces Funcionais em Java


## 1. Supplier (nada → T)

**Explicação**: Interface funcional que não recebe nenhum argumento e produz um resultado do tipo T.

**Exemplo**:
```java
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        // Supplier que retorna uma mensagem
        Supplier<String> messageSupplier = () -> "Olá, mundo!";
        
        // Obtendo o resultado do Supplier
        String message = messageSupplier.get();
        System.out.println(message); // Saída: Olá, mundo!
        
        // Supplier que gera um número aleatório
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println(randomSupplier.get()); // Saída: Um número aleatório entre 0 e 1
    }
}
```

## 2. Consumer (T → nada)

**Explicação**: Interface funcional que aceita um argumento do tipo T e não retorna nenhum resultado (void).

**Exemplo**:
```java
import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;

public class ConsumerExample {
    public static void main(String[] args) {
        // Consumer que imprime um texto
        Consumer<String> printer = (text) -> System.out.println(text);
        printer.accept("Olá, Consumer!"); // Saída: Olá, Consumer!
        
        // Usando Consumer com uma lista
        List<String> names = Arrays.asList("João", "Maria", "Pedro");
        names.forEach(name -> System.out.println("Nome: " + name));
    }
}
```

## 3. UnaryOperator (T → T)

**Explicação**: Interface funcional que aceita um argumento do tipo T e retorna um resultado do mesmo tipo T.

**Exemplo**:
```java
import java.util.function.UnaryOperator;
import java.util.List;
import java.util.ArrayList;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        // UnaryOperator que converte texto para maiúsculas
        UnaryOperator<String> toUpperCase = str -> str.toUpperCase();
        System.out.println(toUpperCase.apply("java")); // Saída: JAVA
        
        // UnaryOperator para dobrar um número
        UnaryOperator<Integer> doubleValue = n -> n * 2;
        System.out.println(doubleValue.apply(5)); // Saída: 10
        
        // Usando com List.replaceAll()
        List<String> names = new ArrayList<>(List.of("joão", "maria", "pedro"));
        names.replaceAll(String::toUpperCase);
        System.out.println(names); // Saída: [JOÃO, MARIA, PEDRO]
    }
}
```

## 4. BinaryOperator (T,T → T)

**Explicação**: Interface funcional que aceita dois argumentos do tipo T e retorna um resultado do mesmo tipo T.

**Exemplo**:
```java
import java.util.function.BinaryOperator;
import java.util.List;
import java.util.Arrays;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        // BinaryOperator que soma dois números
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        System.out.println(sum.apply(10, 5)); // Saída: 15
        
        // BinaryOperator que encontra o maior valor
        BinaryOperator<Integer> max = (a, b) -> Math.max(a, b);
        System.out.println(max.apply(10, 5)); // Saída: 10
        
        // Usando para reduzir uma lista a um valor único
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int total = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Soma total: " + total); // Saída: Soma total: 15
    }
}
```

## 5. Function (S → T)

**Explicação**: Interface funcional que aceita um argumento do tipo S e retorna um resultado do tipo T (tipos podem ser diferentes).

**Exemplo**:
```java
import java.util.function.Function;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        // Function que converte String para Integer
        Function<String, Integer> stringToLength = str -> str.length();
        System.out.println(stringToLength.apply("Java")); // Saída: 4
        
        // Function para formatar nomes
        Function<String, String> formatName = name -> "Sr. " + name;
        System.out.println(formatName.apply("João")); // Saída: Sr. João
        
        // Usando com stream para transformar dados
        List<String> names = Arrays.asList("João", "Maria", "Pedro");
        List<Integer> nameLengths = names.stream()
                                        .map(name -> name.length())
                                        .collect(Collectors.toList());
        System.out.println(nameLengths); // Saída: [4, 5, 5]
    }
}
```

## 6. Predicate (T → boolean)

**Explicação**: Interface funcional que aceita um argumento do tipo T e retorna um resultado booleano.

**Exemplo**:
```java
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateExample {
    public static void main(String[] args) {
        // Predicate que verifica se um número é par
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(4)); // Saída: true
        System.out.println(isEven.test(7)); // Saída: false
        
        // Predicate que verifica se uma string contém uma letra específica
        Predicate<String> containsA = str -> str.contains("a");
        System.out.println(containsA.test("Java")); // Saída: true
        System.out.println(containsA.test("Python")); // Saída: false
        
        // Usando para filtrar uma lista
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                                          .filter(n -> n % 2 == 0)
                                          .collect(Collectors.toList());
        System.out.println(evenNumbers); // Saída: [2, 4, 6, 8, 10]
    }
}
```

## Resumo

Estas interfaces funcionais são fundamentais para programação funcional em Java e são amplamente utilizadas com as APIs de Stream introduzidas no Java 8:

1. **Supplier**: Fornece um valor sem entrada (nada → T)
2. **Consumer**: Consome um valor sem retornar nada (T → nada)
3. **UnaryOperator**: Transforma um valor em outro do mesmo tipo (T → T)
4. **BinaryOperator**: Combina dois valores do mesmo tipo em um resultado (T,T → T)
5. **Function**: Transforma um valor de um tipo em outro tipo (S → T)
6. **Predicate**: Avalia um valor e retorna um booleano (T → boolean)

Estas interfaces funcionais também podem ser combinadas para criar operações mais complexas, utilizando métodos como `andThen()`, `compose()`, `and()`, `or()`, etc.


doc oficial : https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html