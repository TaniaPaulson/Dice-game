-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 30, 2024 at 11:59 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ngpdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `dresults`
--

CREATE TABLE `dresults` (
  `Matches` varchar(100) NOT NULL,
  `WinPlayer1` varchar(100) NOT NULL,
  `WinPlayer2` varchar(100) NOT NULL,
  `losses1` varchar(100) NOT NULL,
  `losses2` varchar(100) NOT NULL,
  `draws1` varchar(100) NOT NULL,
  `draws2` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `dresults`
--

INSERT INTO `dresults` (`Matches`, `WinPlayer1`, `WinPlayer2`, `losses1`, `losses2`, `draws1`, `draws2`) VALUES
('3', '1', '1', '1', '1', '1', '1'),
('4', '1', '2', '2', '1', '1', '1'),
('4', '4', '0', '0', '4', '0', '0'),
('', '0', '1', '1', '0', '0', '0'),
('2', '2', '0', '0', '2', '0', '0'),
('2', '2', '0', '0', '2', '0', '0'),
('4', '1', '2', '2', '1', '1', '1'),
('5', '1', '3', '3', '1', '1', '1'),
('2', '1', '1', '1', '1', '0', '0'),
('5', '3', '2', '2', '3', '0', '0'),
('2', '1', '1', '1', '1', '0', '0'),
('2', '1', '1', '1', '1', '0', '0');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
