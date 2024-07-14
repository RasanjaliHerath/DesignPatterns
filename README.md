# Design Patterns
## Visitor Pattern

## Intent
Represent an operation to be performed on elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.

## Example
Calculating different tax amounts for different types of products without modifying their respective classes.

## Key Participants:
 Visitor: Declares a visit method for each type of element in the object structure.
 Concrete Visitor: Implements each visit method and performs the necessary operations on elements.
  Element: Defines an accept method that accepts a visitor.
 Concrete Element: Implements the accept method to call the visitor's visit method.
