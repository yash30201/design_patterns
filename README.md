# Design Patterns

## Creational Design patterns

### Factory Method

This is a creational design pattern which provides an interface for creating objects in a superclass, but allows the subclasses to alter the type of objects that will be created.

Artifacts:

- [draw.io](drawio/CreationalDesignPatterns/FactoryMethod.drawio.svg)
- [Code](src/main/java/com/factory_method/FactoryMethod.java)

## Structural Design Patterns

### Adapter

This structural design pattern provides a unified interface that allows objects with incompatible interfaces to collaborate.

This is how 1-way adapter works:

- Adapter gets an `interfaceA` compatible with one of the existing `objectA`.
- Using this interface, `objectA` can safely call the adapter methods.
- Adapter also gets an `objectB` of the other `interfaceB` (via constructor or via calling method).
  - `interfaceA` and `interfaceB` are not compatible.
- Upon receiving a call from `interfaceA`, adapter formats the request as per the `interfaceB` and passes the call to `objectB`.

#### Real world example

Travelling US to Europe, but they have different socket standards.

#### Artifacts:

- [draw.io](drawio/StructuralDesignPatterns/Adapter.drawio.svg)
- [code](src/main/java/com/adapter/Adapter.java)
