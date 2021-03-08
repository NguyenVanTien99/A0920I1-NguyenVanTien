use classicmodels;

SELECT * FROM customers WHERE customerNumber = 175;

explain select * from customers where customerNumber = 175;

alter table customers add index idx_customerNumber(customerNUmber);

EXPLAIN SELECT * FROM customers WHERE customerNumber = 175;

ALTER TABLE customers ADD INDEX idx_customerNumber(customerNumber);

EXPLAIN SELECT * FROM customers WHERE customerNumber = 175;

ALTER TABLE customers ADD INDEX idx_full_name(contactFirstName, contactLastName);

EXPLAIN SELECT * FROM customers WHERE contactFirstName = 'Jean' or contactFirstName = 'King';

