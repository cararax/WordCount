This code demonstrates **SOLID** principles by implementing a solution to CodeSHare's WordCounter problem.

It has an interface to count words from a .txt file using two different approaches (imperative and declarative with **Streams**).

It uses programming best practices to create flexible, extensible and maintainable code.

**SOLID Principles**

- **S: Single Responsibility Principle**
    - I demonstrated this principle by creating a WordCounter interface, which has a single responsibility of counting words from a .txt file.
- **O: Open/Closed Principle**
    - I demonstrated this principle by making the WordCounter open for extension and closed for modification, allowing new implementations of the interface to be added without changing the code that uses the interface.
- **L: Liskov Substitution Principle**
    - I demonstrated this principle by creating two implementations of the WordCounter interface (one imperative and the other declarative with Streams) that can be used interchangeably without affecting the correctness of the program.
- **I: Interface Segregation Principle**
    - I demonstrated this principle by defining a minimal set of methods that are needed to count words and not forcing the implementations to implement methods that aren't needed.
- **D: Dependency Inversion Principle**
    - I demonstrated this principle by depending on abstractions (the WordCounter interface) instead of concrete implementations (the ImperativeExample and DeclarativeExample classes).
