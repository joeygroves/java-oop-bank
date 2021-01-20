# java-oop-bank

###### CO1105 Project of Joe Groves. Originally written in February 2019.
-----------

A simple Java program which uses inheritance, overloaded methods, *super* & *this*, class hierarchies under an object oriented design.

## Problem (Taken directly from the problem sheet)
-----------

You will create a small financial consultancy system for two built-in users, and based on a specific scenario. 

This system will provide information on three different types of bank accounts, to help users choose which account is best for them.

* *BankAccount* - contains a method which calculates the monthly interest by multiplying *accountBalance* with *annualInterestRate*, all divided by 12.<br>

* *GoldAccount* - *accountBalance* must be greater or equal to £2000 otherwise the account the holder should pay a monthly penalty of £50. This penalty should be taken away from the *accountBalance* before interest is applied; monthly interest rate is 2.8 times the monthly interest of *BankAccount*.<br>

* *ClassicAccount* - has a monthly interest rate that us 1.15 times the monthly interest of *BankAccount*.<br>

* *SavingsAccount* - If the monthly deposit of *accountBalance* is greater than or equal to £500, then its monthly interest rate becomes 2 times the monthly interest of *BankAccount*. Otherwise, its monthly interest becomes zero.
