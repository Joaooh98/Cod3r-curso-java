
# Stack Data Structure

A stack is a fundamental data structure that follows the Last In, First Out (LIFO) principle. This means that the last element added to the stack will be the first one to be removed. Stacks are widely used in programming for tasks such as backtracking, parsing expressions, and managing program execution contexts.

## Implementation

In our `StackExample` Java class, we implement a generic stack using an `ArrayList`. This approach allows our stack to hold elements of any type.

### Methods

- `push(T item)`: Adds an item to the top of the stack.
- `pop()`: Removes and returns the top item from the stack. If the stack is empty, an `IllegalStateException` is thrown.
- `peek()`: Returns the top item from the stack without removing it. If the stack is empty, an `IllegalStateException` is thrown.
- `isEmpty()`: Returns `true` if the stack is empty, otherwise `false`.

