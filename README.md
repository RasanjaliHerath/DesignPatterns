# Design Patterns
### Visitor Pattern

## Intent
Represent an operation to be performed on elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.

## Example
Calculating different tax amounts for different types of products without modifying their respective classes.

## Key Participants:
 01.Visitor: Declares a visit method for each type of element in the object structure.
 02.Concrete Visitor: Implements each visit method and performs the necessary operations on elements.
 03.Element: Defines an accept method that accepts a visitor.
04.Concrete Element: Implements the accept method to call the visitor's visit method.

## Template Method Pattern
## Intent
Define the skeleton of an algorithm in a method, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing its structure.

## Example
A recipe template where the overall steps (mix, bake, serve) are fixed but ingredients and methods can vary.

## Key Participants
  Abstract Class: Defines the template method (algorithm skeleton) and abstract methods that subclasses implement.
  Concrete Class: Implements the abstract methods to carry out specific steps of the algorithm.
