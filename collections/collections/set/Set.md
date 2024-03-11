
# Java Set Interface Examples

## Métodos da Interface `Set`

### `add(E e)`
Adiciona o elemento especificado ao conjunto se ele ainda não estiver presente.

### `addAll(Collection<? extends E> c)`
Adiciona todos os elementos da coleção especificada ao conjunto se eles ainda não estiverem presentes.

### `remove(Object o)`
Remove o elemento especificado do conjunto, se presente.

### `removeAll(Collection<?> c)`
Remove do conjunto todos os elementos que estão contidos na coleção especificada.

### `retainAll(Collection<?> c)`
Mantém apenas os elementos no conjunto que estão contidos na coleção especificada.

### `clear()`
Remove todos os elementos do conjunto.

### `size()`
Retorna o número de elementos no conjunto.

### `isEmpty()`
Verifica se o conjunto está vazio.

### `contains(Object o)`
Verifica se o conjunto contém o elemento especificado.

### `iterator()`
Retorna um iterador sobre os elementos no conjunto.

## Implementações de `Set`

- **`HashSet`**: Não mantém a ordem dos elementos.
- **`LinkedHashSet`**: Mantém a ordem de inserção dos elementos.
- **`TreeSet`**: Mantém os elementos ordenados de acordo com sua ordem natural ou por um `Comparator` fornecido no momento da criação do conjunto.
