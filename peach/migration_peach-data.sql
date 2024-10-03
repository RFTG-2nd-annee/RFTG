SET NAMES utf8mb4;
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';
SET @old_autocommit=@@autocommit;

USE peach;


UPDATE `customer` SET age = "57" WHERE customer_id = "1"; 

UPDATE film 
SET original_language_id = 1 WHERE film_id BETWEEN 0 AND 166; 
UPDATE film 
SET original_language_id = 2 WHERE film_id BETWEEN 166 AND 332; 
UPDATE film 
SET original_language_id = 3 WHERE film_id BETWEEN 332 AND 498; 
UPDATE film 
SET original_language_id = 4 WHERE film_id BETWEEN 498 AND 664; 
UPDATE film 
SET original_language_id = 5 WHERE film_id BETWEEN 664 AND 830; 
UPDATE film 
SET original_language_id = 6 WHERE film_id BETWEEN 830 AND 1000; 

UPDATE `customer` SET age = "57" WHERE customer_id = "1"; 
UPDATE `customer` SET age = "53" WHERE customer_id = "2"; 
UPDATE `customer` SET age = "58" WHERE customer_id = "3"; 
UPDATE `customer` SET age = "60" WHERE customer_id = "4"; 
UPDATE `customer` SET age = "32" WHERE customer_id = "5"; 
UPDATE `customer` SET age = "28" WHERE customer_id = "6"; 
UPDATE `customer` SET age = "48" WHERE customer_id = "7"; 
UPDATE `customer` SET age = "17" WHERE customer_id = "8"; 
UPDATE `customer` SET age = "56" WHERE customer_id = "9"; 
UPDATE `customer` SET age = "47" WHERE customer_id = "10"; 
UPDATE `customer` SET age = "19" WHERE customer_id = "11"; 
UPDATE `customer` SET age = "24" WHERE customer_id = "12"; 
UPDATE `customer` SET age = "60" WHERE customer_id = "13"; 
UPDATE `customer` SET age = "42" WHERE customer_id = "14"; 
UPDATE `customer` SET age = "42" WHERE customer_id = "15"; 
UPDATE `customer` SET age = "27" WHERE customer_id = "16"; 
UPDATE `customer` SET age = "46" WHERE customer_id = "17"; 
UPDATE `customer` SET age = "43" WHERE customer_id = "18"; 
UPDATE `customer` SET age = "27" WHERE customer_id = "19"; 
UPDATE `customer` SET age = "20" WHERE customer_id = "20"; 
UPDATE `customer` SET age = "53" WHERE customer_id = "21"; 
UPDATE `customer` SET age = "61" WHERE customer_id = "22"; 
UPDATE `customer` SET age = "61" WHERE customer_id = "23"; 
UPDATE `customer` SET age = "29" WHERE customer_id = "24"; 
UPDATE `customer` SET age = "55" WHERE customer_id = "25";

INSERT INTO director (nom, prenom, date_naissance, nationalite) 
VALUES 
('Spielberg', 'Steven', '1946-12-18', 'Américain'), 
('Nolan', 'Christopher', '1970-07-30', 'Britannique'), 
('Cameron', 'James', '1954-08-16', 'Canadien'); 

UPDATE film SET id_director = 1 WHERE title = 'Jurassic Park'; 
UPDATE film SET id_director = 2 WHERE title = 'Inception'; 
UPDATE film SET id_director = 3 WHERE title = 'Avatar'; 

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
SET autocommit=@old_autocommit;
