-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 05, 2024 at 12:03 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `equals`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `uname` varchar(20) DEFAULT NULL,
  `pword` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`uname`, `pword`) VALUES
('admin', 'admin123');

-- --------------------------------------------------------

--
-- Table structure for table `coaches`
--

CREATE TABLE `coaches` (
  `cid` varchar(36) NOT NULL,
  `name` varchar(60) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `gender` varchar(15) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `uname` varchar(20) DEFAULT NULL,
  `pword` varchar(15) DEFAULT NULL,
  `pengalaman` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `coaches`
--

INSERT INTO `coaches` (`cid`, `name`, `email`, `gender`, `dob`, `uname`, `pword`, `pengalaman`) VALUES
('2656f5c9-ead7-426b-841c-88804cc07211', 'r', 'r', 'Laki-laki', '2024-01-01', 'r', 'r', 'r');

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE `courses` (
  `coid` varchar(36) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `kuota` int(5) DEFAULT NULL,
  `cid` varchar(36) NOT NULL,
  `materi` varchar(200) DEFAULT NULL,
  `soal` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `courses`
--

INSERT INTO `courses` (`coid`, `name`, `kuota`, `cid`, `materi`, `soal`) VALUES
('6b9a7c3f-9db9-4123-985f-9f6e54a7fe28', 'cara menjadi  anak hebat', 10, '2656f5c9-ead7-426b-841c-88804cc07211', 'caranya bertobat pada Allah', 'bagaimana cara menjadi anak hebat');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `uid` varchar(36) NOT NULL,
  `name` varchar(60) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `gender` varchar(15) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `uname` varchar(20) DEFAULT NULL,
  `pword` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`uid`, `name`, `email`, `gender`, `dob`, `uname`, `pword`) VALUES
('69ab590c-b5cf-4efc-b643-971da374029f', 'd', 'd', 'Laki-laki', '2024-01-01', 'd', 'd'),
('7f953bfd-e46f-417a-87fc-b17a71604df2', 'z', 'z', 'Laki-laki', '2024-01-01', 'z', 'z'),
('85733ba9-8139-4a10-9692-18d79f458b7c', 'y', 'y', 'Perempuan', '2024-01-02', 'y', 'y'),
('88c68805-27f5-4318-be18-4d34f78785cc', 'c', 'c', 'Laki-laki', '2024-01-01', 'c', 'c'),
('cb26c423-94f5-4a69-8313-d4cce7fcb408', 'b', 'b', 'Laki-laki', '2024-01-01', 'b', 'b'),
('null', 'a', 'a', 'Laki-laki', '2024-01-01', 'a', 'a');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `coaches`
--
ALTER TABLE `coaches`
  ADD PRIMARY KEY (`cid`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `uname` (`uname`);

--
-- Indexes for table `courses`
--
ALTER TABLE `courses`
  ADD PRIMARY KEY (`coid`),
  ADD UNIQUE KEY `cid` (`cid`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`uid`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `uname` (`uname`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
