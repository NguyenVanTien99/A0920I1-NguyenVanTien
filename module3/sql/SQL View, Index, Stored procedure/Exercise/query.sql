use module3;

create table Product (
	id int primary key,
    productCode int,
    productName varchar(50),
    productPrice double,
    productAmount int,
    productDescription text,
    productStatus text
);

CREATE UNIQUE INDEX productCode_index ON Product(productCode);

CREATE INDEX product_name_price_index ON Product(productName,productPrice);

EXPLAIN select * from Product where productCode = 1;

CREATE VIEW Product_views AS

SELECT productCode, productName, productPrice, productStatus 

FROM  Product;

select * from Product_views;

CREATE OR REPLACE VIEW Product_views AS

SELECT productCode, productName, productPrice, productStatus 

FROM  Product;

DROP VIEW Product_views;


use module3;
DELIMITER //
CREATE PROCEDURE getProductInfor()

BEGIN

  SELECT * FROM Product ;

END //

DELIMITER ;

call getProductInfor();