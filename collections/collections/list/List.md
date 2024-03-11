# Java List Interface Examples

## Métodos da Interface `List`

### `add(E e)`
Adiciona o elemento especificado ao final da lista.

### `add(int index, E element)`
Insere o elemento especificado na posição especificada na lista.

### `addAll(Collection<? extends E> c)`
Adiciona todos os elementos da coleção especificada ao final da lista.

### `addAll(int index, Collection<? extends E> c)`
Adiciona todos os elementos da coleção especificada, começando pela posição especificada na lista.

### `remove(Object o)`
Remove a primeira ocorrência do elemento especificado da lista, se estiver presente.

### `remove(int index)`
Remove o elemento na posição especificada na lista.

### `removeAll(Collection<?> c)`
Remove da lista todos os elementos que estão contidos na coleção especificada.

### `retainAll(Collection<?> c)`
Mantém apenas os elementos na lista que estão contidos na coleção especificada.

### `clear()`
Remove todos os elementos da lista.

### `size()`
Retorna o número de elementos na lista.

### `isEmpty()`
Verifica se a lista está vazia.

### `contains(Object o)`
Verifica se a lista contém o elemento especificado.

### `get(int index)`
Retorna o elemento na posição especificada na lista.

### `set(int index, E element)`
Substitui o elemento na posição especificada na lista pelo elemento especificado.

### `indexOf(Object o)`
Retorna o índice da primeira ocorrência do elemento especificado na lista, ou -1 se a lista não contiver o elemento.

### `lastIndexOf(Object o)`
Retorna o índice da última ocorrência do elemento especificado na lista, ou -1 se a lista não contiver o elemento.

### `iterator()`
Retorna um iterador sobre os elementos na lista.

### `listIterator()`
Retorna um iterador de lista sobre os elementos na lista.

### `listIterator(int index)`
Retorna um iterador de lista sobre os elementos na lista, começando na posição especificada.

### `subList(int fromIndex, int toIndex)`
Retorna uma visualização da porção da lista entre os índices especificados, inclusive o início e exclusivo no final.

## Implementações de `List`

- **`ArrayList`**: Implementação baseada em array que cresce automaticamente. Permite acesso rápido a elementos aleatórios.
- **`LinkedList`**: Implementação de lista duplamente encadeada. Ideal para inserções e exclusões frequentes.
