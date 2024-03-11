# Java Queue Interface Examples

## Métodos da Interface `Queue`

### `boolean add(E e)`
Insere o elemento especificado na fila se for possível fazer isso imediatamente sem violar restrições de capacidade, retornando `true` após a inserção bem-sucedida. Se não houver espaço disponível, lança uma `IllegalStateException`.

### `boolean offer(E e)`
Insere o elemento especificado nesta fila se for possível fazer assim imediatamente sem violar restrições de capacidade, retornando `true` após a inserção bem-sucedida, ou `false` se não houver espaço disponível na fila.

### `E remove()`
Remove e retorna a cabeça da fila. Lança uma `NoSuchElementException` se a fila estiver vazia.

### `E poll()`
Remove e retorna a cabeça da fila, ou retorna `null` se a fila estiver vazia.

### `E element()`
Retorna, mas não remove, a cabeça da fila. Lança uma `NoSuchElementException` se a fila estiver vazia.

### `E peek()`
Retorna, mas não remove, a cabeça da fila, ou retorna `null` se a fila estiver vazia.

## Implementações de `Queue`

- **`LinkedList`**: Além de implementar a interface `List`, também é uma implementação da interface `Queue`. É uma lista duplamente encadeada que ordena os elementos em FIFO (primeiro a entrar, primeiro a sair).
- **`PriorityQueue`**: Uma fila de prioridade não ordenada. Os elementos da fila são ordenados de acordo com a sua ordem natural ou por um `Comparator` fornecido no momento da construção da fila.
- **`ArrayBlockingQueue`**: Uma fila de array bloqueante de tamanho fixo que implementa uma política FIFO.
- **`LinkedBlockingQueue`**: Uma fila bloqueante opcionalmente limitada baseada em links de nós.
- **`PriorityBlockingQueue`**: Uma implementação bloqueante da interface `BlockingQueue` para uma fila de prioridade.
- **`DelayQueue`**: Uma implementação bloqueante da interface `BlockingQueue` de elementos com um atraso.

Cada uma dessas implementações possui características específicas em relação ao tempo de execução das operações, à ordem dos elementos e ao comportamento em situações de concorrência ou quando a fila está cheia ou vazia.
