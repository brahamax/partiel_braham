-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Jan 22, 2020 at 10:48 AM
-- Server version: 5.7.26
-- PHP Version: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `partiel`
--
CREATE DATABASE IF NOT EXISTS `partiel` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `partiel`;

-- --------------------------------------------------------

--
-- Table structure for table `Cours`
--

DROP TABLE IF EXISTS `Cours`;
CREATE TABLE `Cours` (
  `idP` int(11) NOT NULL,
  `idE` int(11) NOT NULL,
  `theme` varchar(25) NOT NULL,
  `heures` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `Cours`
--

TRUNCATE TABLE `Cours`;
-- --------------------------------------------------------

--
-- Table structure for table `Etablissements`
--

DROP TABLE IF EXISTS `Etablissements`;
CREATE TABLE `Etablissements` (
  `id` int(11) NOT NULL,
  `mail` int(11) NOT NULL,
  `adresse` int(11) NOT NULL,
  `tel` int(11) NOT NULL,
  `id_D` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `Etablissements`
--

TRUNCATE TABLE `Etablissements`;
-- --------------------------------------------------------

--
-- Table structure for table `Etudiants`
--

DROP TABLE IF EXISTS `Etudiants`;
CREATE TABLE `Etudiants` (
  `idE` int(11) NOT NULL,
  `nom` varchar(25) NOT NULL,
  `prenom` varchar(25) NOT NULL,
  `mail` varchar(50) NOT NULL,
  `adresse` varchar(50) NOT NULL,
  `tel` varchar(10) NOT NULL,
  `date` varchar(10) NOT NULL,
  `authentification` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `Etudiants`
--

TRUNCATE TABLE `Etudiants`;
-- --------------------------------------------------------

--
-- Table structure for table `Matiere`
--

DROP TABLE IF EXISTS `Matiere`;
CREATE TABLE `Matiere` (
  `idM` int(11) NOT NULL,
  `titre` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `Matiere`
--

TRUNCATE TABLE `Matiere`;
-- --------------------------------------------------------

--
-- Table structure for table `Personnels`
--

DROP TABLE IF EXISTS `Personnels`;
CREATE TABLE `Personnels` (
  `idP` int(11) NOT NULL,
  `nom` varchar(25) NOT NULL,
  `prenom` varchar(25) NOT NULL,
  `mail` varchar(50) NOT NULL,
  `adresse` varchar(50) NOT NULL,
  `tel` varchar(10) NOT NULL,
  `matiere` int(11) NOT NULL,
  `poste` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `Personnels`
--

TRUNCATE TABLE `Personnels`;
-- --------------------------------------------------------

--
-- Table structure for table `Poste`
--

DROP TABLE IF EXISTS `Poste`;
CREATE TABLE `Poste` (
  `idPo` int(11) NOT NULL,
  `titre` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `Poste`
--

TRUNCATE TABLE `Poste`;
--
-- Indexes for dumped tables
--

--
-- Indexes for table `Cours`
--
ALTER TABLE `Cours`
  ADD PRIMARY KEY (`idP`,`idE`);

--
-- Indexes for table `Etablissements`
--
ALTER TABLE `Etablissements`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `Matiere`
--
ALTER TABLE `Matiere`
  ADD PRIMARY KEY (`idM`);

--
-- Indexes for table `Personnels`
--
ALTER TABLE `Personnels`
  ADD PRIMARY KEY (`idP`);

--
-- Indexes for table `Poste`
--
ALTER TABLE `Poste`
  ADD PRIMARY KEY (`idPo`);