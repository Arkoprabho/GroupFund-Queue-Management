# GroupFund Queue Management

Queue Management System using java web framework

#Requirements

Given scenario: The fictional bank "GroupFund Bank" after introducing "No documents required loan scheme" was facing an overflow of customers. To solve this issue we had to design an online queue management system that could handle the customer flow.

Solution: The program consists of 3 main parts
  1. Customer
  2. Banker
  3. Admin


Customer: The customer interacts with the online portal where he/she generates a ticket to join the queue. This queue can be seen from the banker page.
Banker: The banker controls the operations carried out by the banker. Services like loans, deposits etc ar carried out by the banker through the portal. The banker logs in using ID and password that is checked through the database.
Admin: The admin is the controlling authority of the bank. He/She can control all operations of the bank, like adding new banker, services etc.

#Project

Requirements: A database(Apache derby) that has the following tables:
  Banker(Name(Varchar), CountryCode(Integer), StateCode(Integer), ID(Integer), UserName(primary)(Varchar), Password(Varchar), BranchCode(Integer))
  
  Customer(AccountName(Varchar), AccountBalance(Integer), CountryCode(Integer), StateCode(Integer), BranchCode(Integer), AccountNumber(Integer), UserName(Varchar), Password(Varchar))
  
  Products(BranchCode(Integer), ProductCode(Integer))

The CountryCode, StateCode, BranchCode, ID together make up the unique identification of a person.
