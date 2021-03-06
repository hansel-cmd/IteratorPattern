# Iterator Design Pattern in Java

- In object-oriented programming, the iterator pattern is a design pattern in which an iterator is used to traverse a container and access the container's elements. 
- The iterator pattern decouples algorithms from containers; it places the responsibility of traversals to where it should be.

## What problems can the Iterator Design Pattern solve?

- The elements of an aggregate object should be accessed and traversed without exposing its representation (data structures).
- New traversal operations should be defined for an aggregate object without changing its interface.

Defining access and traversal operations in the aggregate interface is inflexible because it commits the aggregate to particular access and traversal operations and makes it impossible to add new operations later without having to change the aggregate interface.

## What solution does the Iterator Design Pattern describe?

- Define a separate (iterator) object that encapsulates accessing and traversing an aggregate object.
- Clients use an iterator to access and traverse an aggregate without knowing its representation (data structures).

Different iterators can be used to access and traverse an aggregate in different ways.
New access and traversal operations can be defined independently by defining new iterators.
