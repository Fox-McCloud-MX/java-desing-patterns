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

### Facade Pattern.

**Definition:** Provide a unified interface to a set of interfaces in a system. Facade defines a higher-level
interface that makes the subsystem easier to use.

**Concept:** It is one of those patterns that supports loose coupling. Here we emphasize the abstraction and hide the complex details by exposing a simple interface.

----

### Factory Pattern.

**Definition:** Define an interface for creating an object, but let subclasses decide which class to
instantiate. The factory method lets a class defer instantiation to subclasses.

---

### Memento Pattern.

**Definition:** Without violating encapsulation, capture and externalize an object’s internal state so that
the object can be restored to this state later.

**Concept:** Our aim is to save the state of an object, so that in the future, we can go back to the specified state. Three objects are playing the game here—a memento, a caretaker, and the originator. The memento will store the internal states of the originator. The originator can have the internal states and it has the ability to restore into its earlier state. An originator can also retrieve information from the memento. The caretaker takes care of the memento’s safekeeping or protection and it should not examine the contents of the memento.

---

### State Pattern.

**Definition:** Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.

---

### Builder Pattern.

**Definition:** Separate the construction of a complex object from its representation so that the same construction processes can create different representations.

**Concept:** The pattern is useful when a creational algorithm of a complex object is independent of the assembly of the parts of the object. The construction process is also capable of building a different representation of that object under consideration.

---

### Flyweight Pattern.

**Definition:** Use sharing to support large numbers of fine-grained objects efficiently.

**Concept:** A flyweight is an object through which we try to minimize memory usage by sharing data as much as possible. Two common terms are used here—intrinsic state and extrinsic state. The first category (intrinsic)  can be stored in the flyweight and is shareable. The other one depends on the flyweight’s context and is non-shareable. Client objects need to pass the extrinsic state to the flyweight.

---

### Abstract Factory Pattern.

**Definition:** Provides an interface for creating families of related or dependent objects without specifying
their concrete classes.

**Concept:** In this pattern, we provide an encapsulation mechanism to a group of individual factories. These factories have a theme in common. In this process, an interface is used to create related objects. Here we do not call their implementer or concrete classes directly. We sometimes refer to this pattern as a factory of factories or a Super factory.
With this pattern, we can interchange the specific implementations without changing the user’s code.
But to achieve this, we need to compensate for the complexity of the system. As a result, debugging may be difficult in many scenarios.

---

### Mediator Pattern.

**Definition:** Define an object that encapsulates how a set of objects interacts. The mediator pattern promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.

**Concept:** A mediator is the one who takes the responsibility of communication among a group of objects. The mediator acts as an intermediary who can track the communication between two objects. The other objects in the system are also aware of this mediator and they know that if they need to communicate among themselves, they need to go through the mediator. The advantage of using such a mediator is that we can reduce the direct interconnections among the objects and thus lower the coupling.

---

### Prototype Pattern.

**Definition:** Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

**Concept:** The prototype pattern provides an alternative method for instantiating new objects by copying or cloning an instance of an existing one. Creating a new instance, in a real-world scenario, is normally treated as an expensive operation. This pattern helps us to deal with this issue. Our focus here is to reduce the expense of this creational process of a new instance.

---

### Chain of Responsibility Pattern.

**Definition:** Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.

**Concept:** Here we process a series of objects one by one (i.e., in a sequential manner). A source will initiate this processing. With this pattern, we constitute a chain where each of the processing objects can have some logic to handle a particular type of command object. After one’s processing is done, if anything is still pending, it can be forwarded to the next object in the chain. We can add new objects anytime at the end of a chain.

---

### Composite Pattern.

**Definition:** Compose objects into tree structures to represent part-whole hierarchies. The composite pattern lets clients treat individual objects and compositions of objects uniformly.

**Concept:** This pattern can show part-whole hierarchy among objects. A client can treat a composite object just like a single object. In object-oriented programming, we make a composite object when we have many objects with common functionalities. This relationship is also termed a “has-a” relationship among objects.

---

### Bridge Pattern (Or Handle/Body Patterns)

**Definition:** Decouple an abstraction from its implementation so that the two can vary independently.

**Concept:** In this pattern, the abstract class is separated from the implementation class and we provide a bridge interface between them. This interface helps us to make concrete class functionalities independent from the interface implementer class. We can alter these different kind of classes structurally without affecting each other.

---

