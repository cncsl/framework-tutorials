CREATE TABLE country
(
    primary_code   VARCHAR(3)  DEFAULT '' NOT NULL PRIMARY KEY,
    country_name   VARCHAR(52) DEFAULT '' NOT NULL,
    capital        INT                    NULL,
    secondary_code VARCHAR(2)  DEFAULT '' NOT NULL
);

CREATE TABLE country_language
(
    country_code     VARCHAR(3)      DEFAULT ''  NOT NULL,
    country_language VARCHAR(30)     DEFAULT ''  NOT NULL,
    is_official      ENUM ('T', 'F') DEFAULT 'F' NOT NULL,
    percentage       DECIMAL(4, 1)   DEFAULT 0.0 NOT NULL,
    PRIMARY KEY (country_code, country_language),
    INDEX idx_country_primary_code (country_code)
);

CREATE TABLE city
(
    id            INT AUTO_INCREMENT PRIMARY KEY,
    city_name     VARCHAR(35) DEFAULT '' NOT NULL,
    country_code  VARCHAR(3)  DEFAULT '' NOT NULL,
    city_district VARCHAR(20) DEFAULT '' NOT NULL,
    info          JSON                   NULL
);