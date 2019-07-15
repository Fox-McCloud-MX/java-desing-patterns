# Java Design Patterns
Project based on book [Java Desing Patterns](<https://books.google.com.mx/books?id=vPt9DwAAQBAJ&printsec=frontcover&dq=java+design+patterns+vaskaran&hl=es-419&sa=X&ved=0ahUKEwiRytzx06XjAhUPUK0KHfRRC4IQ6AEILDAA#v=onepage&q=java%20design%20patterns%20vaskaran&f=false>) Vaskaran Sarcar.

---

### Observer Pattern.

**Definition**: Define a one-to-many dependency between objects so that when one object changes state,
all its dependents are notified and updated automatically.

**Concept:** In this pattern, there are many observers (objects) which are observing a particular subject (object). Observers are basically interested and want to be notified when there is a change made inside that subject. So, they register themselves to that subject. When they lose interest in the subject they simply unregister from the subject. Sometimes this model is also referred to as the Publisher-Subscriber model.

---

### Singleton Pattern.

**Definition:** Ensure a class only has one instance, and provide a global point of access to it.

**Concept:** A particular class should have only one instance. We will use only that instance whenever we are in need.

---

### Proxy Pattern.

**Definition:** Provide a surrogate or placeholder for another object to control access to it.

**Concept:** We want to use a class which can perform as an interface to something else.

---

### Decorator Pattern.

**Definition:** Attach additional responsibilities to an object dynamically. Decorators provide a flexible
alternative to subclassing for extending functionality.

**Concept:** This main principle of this pattern says that we cannot modify existing functionalities but we can extend them.  In other words, this pattern is open for extension but closed for modification. The core concept applies when we want to add some specific functionalities to some specific object instead of to the
whole class.

---

### Template Method Pattern.

**Definition:** Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. The
template method lets subclasses redefine certain steps of an algorithm without changing the algorithm’s
structure.

**Concept:** In a template method, we define the minimum or essential structure of an algorithm. Then we defer some functionalities (responsibilities) to the subclasses. As a result, we can redefine certain steps of an algorithm by keeping the key structure fixed for that algorithm.

---

### Strategy Pattern.

**Definition:** Define a family of algorithms, encapsulate each one, and make them interchangeable. The
strategy pattern lets the algorithm vary independently from client to client.

**Concept:** We can select the behavior of an algorithm dynamically at runtime.

---

### Adapter Pattern.

**Definition:** Convert the interface of a class into another interface that clients expect. The adapter
pattern lets classes work together that couldn’t otherwise because of incompatible interfaces.

GoF tells us about two major kinds of adapters:

A. Class adapters. They generally use multiple inheritance to adapt one interface to
another. (But we must remember, in Java, multiple inheritance through classes is not
supported. We need interfaces to implement the concept of multiple inheritance.)

B. Object adapters. They depend on the object compositions.

----

### Command Pattern.

**Definition:** Encapsulate a request as an object, thereby letting you parameterize clients with different
requests, queue or log requests, and support undoable operations.

**Concept:** Here requests are encapsulated as objects. In general, four terms are associated—invoker, client, command, and receiver. A command object is capable of calling a particular method in the receiver. It stores the parameters of the methods in receiver. An invoker only knows about the command interface, but it is totally unware about the concrete commands. The client object holds the invoker object and the command object(s). The client decides which of these commands needs to execute at a particular point in time. To do that, he/she passes the command object to the invoker to execute that particular command.

---

### Iterator Pattern.

**Definition:** Provide a way to access the elements of an aggregate object sequentially without exposing
its underlying representation.

**Concept:** Iterators are generally used to traverse a container to access its elements.

---

