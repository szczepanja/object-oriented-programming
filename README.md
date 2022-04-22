# object-oriented-programming

## Exercise 1

Write the following classes so, when executed, use something instance-specific:

``
Logger that prints out a message with a log prefix
``

``
Sender that sends out a message with a message header
``

**"Executed"** means "called" by a "caller".

## Exercise 2: Bank

Write a `Bank` class that may have one or more `Accounts`.

An `Account` has a balance and a number.

- You can make a `deposit` and a `withdrawal` of a specified amount 
- Handle insufficient funds to withdraw 
- Is it enough to return a boolean value to indicate a failure? 
- You can `print` a statement for an account 
- You can `close` an account (which is to make a balance zero)

Define `transfer` method to transfer money from one account to another (only when there is enough money).