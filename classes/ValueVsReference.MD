Atribuição por valor (Tipos Primitivos):

    Quando você trabalha com tipos primitivos, como int, float, char, etc., a atribuição é feita por valor.
    Isso significa que o valor real da variável é copiado para a nova variável, e as duas variáveis são independentes uma da outra.
    Mudar o valor de uma variável não afeta a outra.

Atribuição por referência (Objetos):

    Ao lidar com objetos em Java, a atribuição é feita por referência.
    Isso significa que, em vez de copiar todo o conteúdo do objeto, você está copiando uma referência ao objeto na memória.
    As duas referências apontam para o mesmo objeto na memória, portanto, alterações no objeto são refletidas através de ambas as referências.

```java

    public class ValueVsReference {
        public static void main(String[] args) 

            // atribuicao por valor (assignment by value) 
            double a = 2;
            double b = a; 
            System.out.println(a + " = a and b=: " + b);

            a++;
            b--;
            System.out.println(a + " = a and b=: " + b);

            // atribuicao por referencia(Objeto) //
            Data d1 = new Data(1, 6, 2022);
            Data d2 = d1;

            d1.dia = 31;
            d2.mes = 12;

            d1.showDateFormat();
            d2.showDateFormat();

            returnToDefaultValue(d1);

            d1.showDateFormat();
            d2.showDateFormat();

            int c = 5;

            changePrimitiveTypeValue(c);
            
            System.out.println(c);

        }

        private static void returnToDefaultValue(Data d1) {
            d1.dia = 1;
            d1.mes = 1;
            d1.ano = 19970;
        }

        static void changePrimitiveTypeValue(int c) {
            c++;
        }


```


Tipos Primitivos (atribuição por valor):

```java
double a = 2;
double b = a;
```
Aqui, a é do tipo primitivo double, e a atribuição é feita por valor. b recebe uma cópia do valor de a. Modificando a ou b não afetará o outro.

```java

a++;
b--;
```
a é incrementado em 1, e b é decrementado em 1. Isso não afeta o valor original de a que foi copiado para b.

Objetos (atribuição por referência):

```java

Data d1 = new Data(1, 6, 2022);
Data d2 = d1;
d1 e d2 são referências ao mesmo objeto na memória. Qualquer alteração nos atributos de d1 ou d2 afetará o mesmo objeto.
```
```java

d1.dia = 31;
d2.mes = 12;
```
Ambas as referências d1 e d2 apontam para o mesmo objeto Data, então ao modificar os atributos, ambos são afetados.

Método com objeto como parâmetro (atribuição por referência):

```java

returnToDefaultValue(d1);
```
O método returnToDefaultValue recebe uma referência ao objeto d1. As alterações feitas dentro do método afetarão diretamente o objeto referenciado por d1.

Método com tipo primitivo como parâmetro (atribuição por valor):

```java

int c = 5;
changePrimitiveTypeValue(c);
```
O método changePrimitiveTypeValue recebe uma cópia do valor de c. Qualquer alteração dentro do método não afeta o valor original de c.

```java

System.out.println(c);
```
O valor original de c (5) permanece inalterado, pois o método apenas operou sobre uma cópia do valor.

Em resumo, em Java, a passagem de parâmetros para métodos é sempre por valor. Para tipos primitivos, a cópia do valor é passada. Para objetos, a cópia da referência (endereço de memória) é passada, o que significa que alterações nos objetos dentro de métodos podem ser refletidas fora deles.