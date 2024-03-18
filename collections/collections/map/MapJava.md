
# Map 

## Introdução ao Map
O `Map` em Java é uma interface do pacote java.util que mapeia chaves únicas a valores. Uma chave pode mapear no máximo um valor. Essa estrutura de dados é ideal para busca rápida de valores, dado uma chave.

## Implementações do Map
Java fornece várias implementações da interface `Map`, incluindo:

- **HashMap**: armazena as chaves em uma tabela hash. É a implementação mais eficiente.
- **TreeMap**: armazena as chaves em uma árvore vermelha-preta, ordenando-as conforme sua ordem natural ou por um `Comparator` fornecido na criação do mapa.
- **LinkedHashMap**: uma combinação de hash table e lista encadeada, mantendo a ordem de inserção dos elementos.

## Métodos Principais

- **put(K key, V value)**: Adiciona uma associação de chave-valor ao mapa.
- **get(Object key)**: Retorna o valor associado à chave, ou `null` se a chave não estiver mapeada.
- **remove(Object key)**: Remove a associação da chave, se estiver presente.
- **containsKey(Object key)**: Verifica se o mapa contém uma associação para a chave.
- **containsValue(Object value)**: Verifica se o mapa mapeia uma ou mais chaves para o valor especificado.
- **size()**: Retorna o número de associações chave-valor no mapa.
- **isEmpty()**: Verifica se o mapa está vazio.
- **putAll(Map<? extends K,? extends V> m)**: Copia todas as associações do mapa especificado para este mapa.
- **clear()**: Remove todas as associações do mapa.
- **keySet()**: Retorna um conjunto de todas as chaves contidas neste mapa.
- **values()**: Retorna uma coleção de todos os valores contidos neste mapa.
- **entrySet()**: Retorna um conjunto de todas as associações chave-valor contidas neste mapa.

## Boas Práticas

- **Escolha da Implementação Correta**: Use `HashMap` para busca rápida, `TreeMap` para ordenação natural e `LinkedHashMap` para manter a ordem de inserção.
- **Uso de Generics**: Use generics para garantir a segurança de tipo.
- **Tratamento de Concorrência**: Considere usar `ConcurrentHashMap` para ambientes multi-thread.
- **Precauções ao Usar Chaves Mutáveis**: Evite usar objetos mutáveis como chaves para prevenir comportamento indefinido.
- **Iteração Eficiente**: Para iterar sobre um `Map`, prefira usar `entrySet()` para melhor eficiência quando precisar de acesso tanto às chaves quanto aos valores.

Este guia oferece uma visão geral das funcionalidades e boas práticas do uso de `Map` em Java.
