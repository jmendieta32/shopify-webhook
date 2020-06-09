-- Adminer 4.7.6 MySQL dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;

CREATE TABLE `orders_webhook` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `currency` varchar(255) DEFAULT NULL,
  `customer_locale` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `line_items` text,
  `order_number` varchar(255) DEFAULT NULL,
  `raw_data` text,
  `status` int(11) NOT NULL,
  `sub_price` double DEFAULT NULL,
  `total_discounts` double DEFAULT NULL,
  `total_line_items` double DEFAULT NULL,
  `total_price` double DEFAULT NULL,
  `updated` datetime DEFAULT NULL,
  `webhook` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;


-- 2020-05-28 22:55:19
