The BankCard System is a Java-based application designed to manage and interact with different types of bank cards,
including debit and credit cards. This system provides functionalities for adding, displaying, and managing bank cards 
through a graphical user interface (GUI).

Features

BankCard Class:   Represents a generic bank card with attributes such as card ID, client name, issuer bank, bank account, and balance amount.
CreditCard Class: Extends BankCard with additional features such as credit limit, CVC number, interest rate, and expiration date.
DebitCard Class:  Extends BankCard with features for managing withdrawals and PIN validation.
BankGUI Class:    Provides a graphical user interface to interact with the bank card system, allowing users to switch between debit and credit card
                  management, and perform actions like adding cards and withdrawals.

BankCard Class

Attributes: cardID, clientName, issuerBank, bankAccount, balanceAmount
Constructor: Initializes attributes based on input values.
Methods:
        getCardID(): Returns the card ID.
        getIssuerBank(): Returns the issuer bank.
        getBankAccount(): Returns the bank account.
        getBalanceAmount(): Returns the balance amount.
        getClientName(): Returns the client name.
        setClientName(String clientName): Sets the client name.
        setBalanceAmount(int balanceAmount): Sets the balance amount.
        display(): Displays card details. If the client name is not set, a message is displayed.
        
CreditCard Class

Attributes: cVCnumber, creditLimit, interestRate, expirationDate, gracePeriod, isGranted
Constructor: Initializes attributes based on input values and sets isGranted to false.
Methods:
        setCreditLimit(double creditLimit, int gracePeriod): Sets credit limit and grace period if the credit limit condition is met.
        cancelCreditCard(): Cancels the credit card by resetting its attributes.
        display(): Displays credit card details if isGranted is true.
        
DebitCard Class

Attributes: pinNumber, withdrawalAmount, dateOfWithdrawal, hasWithdrawn
Constructor: Initializes attributes based on input values and sets hasWithdrawn to false.
Methods:
        withdrawn(int withdrawalAmount, String dateOfWithdrawal, int pinNumber): Processes the withdrawal if the PIN is correct and balance is sufficient.
        display(): Displays debit card details if a withdrawal has been made.
        
BankGUI Class

Purpose: Provides a graphical user interface for interacting with the bank card system.
Components:
        Panels for BankCard, DebitCard, and CreditCard management.
        Text fields and buttons for input and actions.
        Methods to handle user actions such as adding cards, clearing fields, and displaying card information.
        
