SET NAMES utf8mb4;
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

USE peach;

CREATE TABLE role (
  role_id INT UNSIGNED NOT NULL AUTO_INCREMENT, 
  role_name VARCHAR(50) NOT NULL, 
  PRIMARY KEY (role_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
 
ALTER TABLE staff 
ADD COLUMN role_id INT UNSIGNED NOT NULL;

ALTER TABLE staff
ADD CONSTRAINT fk_staff_role
FOREIGN KEY (role_id) REFERENCES role(role_id);
 
INSERT INTO role (role_name)
VALUES 
('standard'),
('manager'),
('advanced');

ALTER TABLE customer
ADD COLUMN password VARCHAR(25) NOT NULL DEFAULT '1234';

CREATE TABLE film_language_translation ( 
translation_id SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT, 
film_id SMALLINT UNSIGNED NOT NULL, 
language_id TINYINT UNSIGNED NOT NULL, 
PRIMARY KEY (translation_id), 
KEY idx_language (language_id), 
KEY idx_film (film_id), 
CONSTRAINT fk_translation_language_id FOREIGN KEY (language_id) REFERENCES language (language_id) ON DELETE RESTRICT ON UPDATE CASCADE, 
CONSTRAINT fk_translation_film_id FOREIGN KEY (film_id) REFERENCES film (film_id) ON DELETE RESTRICT ON UPDATE CASCADE 
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4; 

CREATE TABLE film_language_subtitle ( 
subtitle_id SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT, 
film_id SMALLINT UNSIGNED NOT NULL, 
language_id TINYINT UNSIGNED NOT NULL, 
PRIMARY KEY (subtitle_id), 
KEY idx_language (language_id), 
KEY idx_film (film_id), 
CONSTRAINT fk__subtitle_language_id FOREIGN KEY (language_id) REFERENCES language (language_id) ON DELETE RESTRICT ON UPDATE CASCADE, 
CONSTRAINT fk_subtitle_film_id FOREIGN KEY (film_id) REFERENCES film (film_id) ON DELETE RESTRICT ON UPDATE CASCADE 
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4; 


ALTER TABLE customer ADD COLUMN age SMALLINT UNSIGNED DEFAULT NULL;


-- TABLE director
CREATE TABLE `director` (
  `director_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nom` varchar(45) DEFAULT NULL,
  `prenom` varchar(45) DEFAULT NULL,
  `date_naissance` DATE DEFAULT '1000-01-01',
  `nationnalite` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`director_id`)
) ENGINE=InnoDB AUTO_INCREMENT=113 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
 
-- TABLE film_director
CREATE TABLE `film_director` (
  `film_id` smallint(5) unsigned NOT NULL,
  `director_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`film_id`,`director_id`),
  KEY `idx_film_director_director` (`director_id`),
  KEY `idx_film_director_film` (`film_id`),
  CONSTRAINT `fk_film_director_director` FOREIGN KEY (`director_id`) REFERENCES `director` (`director_id`) ON UPDATE CASCADE,
  CONSTRAINT `fk_film_director_film` FOREIGN KEY (`film_id`) REFERENCES `film` (`film_id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


DELIMITER ;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


