-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 13-Abr-2023 às 04:21
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
-- Banco de dados: `universidade`
--
CREATE DATABASE IF NOT EXISTS `universidade` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `universidade`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `aluno`
--

CREATE TABLE `aluno` (
  `matricula` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `dataNascimento` date NOT NULL,
  `curso` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `aluno`
--

INSERT INTO `aluno` (`matricula`, `nome`, `dataNascimento`, `curso`) VALUES
(1828201, 'Pedro Santos', '2000-09-02', 'COM'),
(1918023, 'Camila Braga', '1999-03-12', 'COM'),
(1918142, 'João Lage', '2001-11-20', 'PRO');

-- --------------------------------------------------------

--
-- Estrutura da tabela `disciplina`
--

CREATE TABLE `disciplina` (
  `codigo` varchar(6) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `horas` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `disciplina`
--

INSERT INTO `disciplina` (`codigo`, `nome`, `horas`) VALUES
('CEA160', 'Calculo Diferencial e Integral I', 60),
('CSI030', 'Programação de Computadores I', 60),
('CSI440', 'Banco de Dados I', 60),
('CSI443', 'Matemática Discreta', 60),
('CSI488', 'Algoritmo e Estrutura de Dados I', 60);

-- --------------------------------------------------------

--
-- Estrutura da tabela `oferta`
--

CREATE TABLE `oferta` (
  `codigo` int(11) NOT NULL,
  `codigoDisciplina` varchar(10) NOT NULL,
  `semestre` int(11) NOT NULL,
  `ano` int(11) NOT NULL,
  `nota` float NOT NULL,
  `frequencia` varchar(4) NOT NULL,
  `aluno` int(11) NOT NULL,
  `professor` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `oferta`
--

INSERT INTO `oferta` (`codigo`, `codigoDisciplina`, `semestre`, `ano`, `nota`, `frequencia`, `aluno`, `professor`) VALUES
(1, 'CSI030', 1, 2019, 8.6, '90%', 1918023, '10120214450'),
(2, 'CSI030', 1, 2019, 7.4, '95%', 1918142, '10120214450'),
(3, 'CSI030', 1, 2019, 2.5, '50%', 1828201, '10120214450'),
(4, 'CSI440', 1, 2019, 4.7, '75%', 1918142, '11040540330'),
(5, 'CSI160', 1, 2019, 9.5, '100%', 1828201, '10560930210'),
(6, 'CSI443', 1, 2019, 7.7, '82%', 1918023, '10010220470'),
(7, 'CSI030', 2, 2019, 6, '90%', 1828201, '10432029020'),
(8, 'CSI440', 2, 2019, 6.7, '85%', 1918142, '10190267390'),
(9, 'CSI160', 2, 2019, 8.2, '92%', 1918023, '10560930210'),
(10, 'CSI443', 2, 2019, 9, '100%', 1828201, '10010220470');

-- --------------------------------------------------------

--
-- Estrutura da tabela `prerequisito`
--

CREATE TABLE `prerequisito` (
  `codigo` int(11) NOT NULL,
  `codigoDisciplina` varchar(6) NOT NULL,
  `codigoPrerequisito` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `prerequisito`
--

INSERT INTO `prerequisito` (`codigo`, `codigoDisciplina`, `codigoPrerequisito`) VALUES
(1, 'CSI440', 'CSI443'),
(2, 'CSI440', 'CSI488'),
(3, 'CSI488', 'CSI030');

-- --------------------------------------------------------

--
-- Estrutura da tabela `professor`
--

CREATE TABLE `professor` (
  `CPF` varchar(15) NOT NULL,
  `Nome` varchar(100) NOT NULL,
  `Salario` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `professor`
--

INSERT INTO `professor` (`CPF`, `Nome`, `Salario`) VALUES
('01120214450', 'Lucas Menezes', 5420),
('10010220470', 'Elton Cardoso', 6500),
('10190267390', 'Rafael Silva', 2500),
('10432029020', 'Fernando Vaz', 3880),
('10560930210', 'Marcos Lima', 7150),
('11040540330', 'Bruno Santos', 4200);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `aluno`
--
ALTER TABLE `aluno`
  ADD PRIMARY KEY (`matricula`);

--
-- Índices para tabela `disciplina`
--
ALTER TABLE `disciplina`
  ADD PRIMARY KEY (`codigo`);

--
-- Índices para tabela `oferta`
--
ALTER TABLE `oferta`
  ADD PRIMARY KEY (`codigo`);

--
-- Índices para tabela `prerequisito`
--
ALTER TABLE `prerequisito`
  ADD PRIMARY KEY (`codigo`);

--
-- Índices para tabela `professor`
--
ALTER TABLE `professor`
  ADD PRIMARY KEY (`CPF`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `prerequisito`
--
ALTER TABLE `prerequisito`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
