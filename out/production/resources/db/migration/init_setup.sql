DROP SCHEMA if exists `wc2019basketball`;
CREATE SCHEMA `wc2019basketball` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci ;


DROP TABLE IF EXISTS `wc2019basketball`.`user`;
CREATE TABLE `wc2019basketball`.`user` (
  `id` int(11) NOT NULL,
  `first_name` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `last_name` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `username` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `password` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
   PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;