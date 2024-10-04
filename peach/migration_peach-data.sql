SET NAMES utf8mb4;
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';
SET @old_autocommit=@@autocommit;

USE peach;

INSERT INTO film_language_translation (film_id, language_id) 
SELECT film_id, 1 
FROM film; 
INSERT INTO film_language_translation (film_id, language_id) 
SELECT film_id, 2 
FROM film; 
INSERT INTO film_language_translation (film_id, language_id) 
SELECT film_id, 3 
FROM film; 
INSERT INTO film_language_translation (film_id, language_id) 
SELECT film_id, 4 
FROM film; 
INSERT INTO film_language_translation (film_id, language_id) 
SELECT film_id, 5 
FROM film; 
INSERT INTO film_language_translation (film_id, language_id) 
SELECT film_id, 6 
FROM film; 

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

-- DATA director
INSERT INTO `director` (`director_id`, `nom`, `prenom`, `date_naissance`, `nationnalite`) VALUES
(1, 'Spielberg', 'Steven', '1946-12-18', 'Américain'),
(2, 'Nolan', 'Christopher', '1970-07-30', 'Britannique'),
(3, 'Cameron', 'James', '1954-08-16', 'Canadien'),
(4, 'Spielberg', 'Steven', '1946-12-18', 'Américain'),
(5, 'Nolan', 'Christopher', '1970-07-30', 'Britannique'),
(6, 'Cameron', 'James', '1954-08-16', 'Canadien');
 
-- DATA film_director
INSERT INTO `film_director`
SELECT film_id, 1 FROM film
WHERE film_id between 1 and 100;
INSERT INTO `film_director`
SELECT film_id, 2 FROM film
WHERE film_id between 101 and 200;
INSERT INTO `film_director`
SELECT film_id, 3 FROM film
WHERE film_id between 201 and 300;
INSERT INTO `film_director`
SELECT film_id, 4 FROM film
WHERE film_id between 301 and 400;
INSERT INTO `film_director`
SELECT film_id, 5 FROM film
WHERE film_id between 401 and 500;
INSERT INTO `film_director`
SELECT film_id, 6 FROM film
WHERE film_id between 501 and 1000;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
SET autocommit=@old_autocommit;
