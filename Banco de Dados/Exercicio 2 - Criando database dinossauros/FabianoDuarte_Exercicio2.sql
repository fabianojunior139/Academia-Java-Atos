-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 11-Abr-2023 às 00:05
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `dinossauros`
--
CREATE DATABASE IF NOT EXISTS `dinossauros` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `dinossauros`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `dinossauros_descobertos`
--

CREATE TABLE `dinossauros_descobertos` (
  `Dinossauro` varchar(100) NOT NULL,
  `Grupo` varchar(50) NOT NULL,
  `Toneladas` int(10) NOT NULL,
  `AnoDescoberta` int(4) NOT NULL,
  `Descobridor` varchar(50) NOT NULL,
  `Era` varchar(50) NOT NULL,
  `Inicio` int(15) NOT NULL,
  `Fim` int(15) NOT NULL,
  `Pais` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `dinossauros_descobertos`
--

INSERT INTO `dinossauros_descobertos` (`Dinossauro`, `Grupo`, `Toneladas`, `AnoDescoberta`, `Descobridor`, `Era`, `Inicio`, `Fim`, `Pais`) VALUES
('Kentrossauro', 'Estegossauros', 2, 1909, 'Cientistas Alemães', 'Jurássico', 200, 145, 'China'),
('Pinacossauro', 'Anquilossauros', 6, 1999, 'Museu Americano de História Natural', 'Triássico', 85, 75, 'Tanzânia'),
('Saichania', 'Anquilossauros', 4, 1977, 'Maruanska', 'Cretáceo', 70, 66, 'Mongólia'),
('Tricerátops', 'Ceratopsídeos', 6, 1887, 'John Bell Hatcher', 'Cratáceo', 70, 66, 'Canadá');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `dinossauros_descobertos`
--
ALTER TABLE `dinossauros_descobertos`
  ADD PRIMARY KEY (`Dinossauro`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
