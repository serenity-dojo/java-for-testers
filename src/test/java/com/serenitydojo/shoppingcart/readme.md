# Coding with intent - refactoring code to make it express the WHAT as well as the HOW

In this exercise, we take a piece of existing code, try to understand it, and reorganise it into methods and objects so that it is easier to understand and easier to read. We will refactor both the test code _and_ the application code.

The domain is a shopping cart module, that finds the total cost of an order based on the number of articles and the shipping cost.

Techniques to explore include:
* Using builders to reduce incidental data
* 