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
- Upon receiving a call from `interfaceA`, adapter formats the request as per the `interfaceB` and passes the call to 
  `objectB`.

#### Real world example

Travelling US to Europe, but they have different socket standards.

#### Artifacts:

- [draw.io](drawio/StructuralDesignPatterns/Adapter.drawio.svg)
- [code](src/main/java/com/adapter/Adapter.java)

### Bridge

Bridge is a structural design pattern that lets you split a class or a set of closely related classes into two separate
hierarchies / dimensions, namely abstraction and implementation, which can be developed independently.

To apply bridge patter:

- You extract one of the dimensions into a separate class hierarchy, so that the original class can reference the new
  dimensional object.
- The new class would be responsible for managing all its state and behaviours.

> You can think of you this a separation of a monolith into GUI + API.

#### Real world example

Device + Remote

#### Artifacts

- [Draw IO](drawio/StructuralDesignPatterns/bridge.drawio.svg)
- [Code](src/main/java/com/bridge/Bridge.java)

### Composite

Composite is a structural design pattern that lets you compose objects into tree structures and then work with the
structures as if they were individual objects.

> _I used this in google-cloud-php/Datastore's ([PR](https://github.com/googleapis/google-cloud-php/pull/6557))  
and google-cloud-php/Firestore's ([PR](https://github.com/googleapis/google-cloud-php/pull/6817)) Sum/Avg Aggregation
feature._

#### Artifacts

- [Drawio](drawio/StructuralDesignPatterns/composite.drawio.svg)
- [Code]()