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

### Decorator Patterns.

**Definition:** Attach additional responsibilities to an object dynamically. Decorators provide a flexible
alternative to subclassing for extending functionality.

**Concept:** This main principle of this pattern says that we cannot modify existing functionalities but we can extend them.  In other words, this pattern is open for extension but closed for modification. The core concept applies when we want to add some specific functionalities to some specific object instead of to the
whole class.