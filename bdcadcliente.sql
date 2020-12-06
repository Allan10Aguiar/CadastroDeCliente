-- phpMyAdmin SQL Dump
-- version 4.0.4.2
-- http://www.phpmyadmin.net
--
-- Máquina: localhost
-- Data de Criação: 06-Dez-2020 às 21:13
-- Versão do servidor: 5.6.13
-- versão do PHP: 5.4.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de Dados: `bdcadcliente`
--
CREATE DATABASE IF NOT EXISTS `bdcadcliente` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `bdcadcliente`;

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `inserirItemVenda`(IN `produtoFK` INT, IN `qtd` INT)
BEGIN

    set @vendaId = (select MAX(idVenda) from tbVenda);
    set @valorUnit = (select precoVenda from tbProduto where idProduto = produtoFK);
	set @valorItem = (@valorUnit * qtd);
	set @nome = (select nomeProduto from tbProduto where idProduto = produtoFK);

    insert into tbItensVenda (idVendaFK, idProdutoFK, nomeProd, quantidade, valorUnit, valorItem) values (@vendaId, produtoFK, @nome, qtd, @valorUnit, @valorItem);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `inserirVenda`(IN `clienteFK` INT)
BEGIN
    insert into tbVenda (idClienteFK, data, tempo) values (clienteFK, CURDATE(), CURTIME());
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `selecionarItens`()
    READS SQL DATA
BEGIN

    set @vendaId = (select MAX(idVenda) from tbVenda);

    select * from tbItensVenda where idVendaFK = @vendaId;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbcliente`
--

CREATE TABLE IF NOT EXISTS `tbcliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(250) NOT NULL,
  `sexo` varchar(250) NOT NULL,
  `cpf` varchar(250) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Extraindo dados da tabela `tbcliente`
--

INSERT INTO `tbcliente` (`id`, `nome`, `sexo`, `cpf`) VALUES
(1, 'Allan', 'MASCULINO', '12345'),
(2, 'Eduarda', 'FEMININO', '789044'),
(3, 'Isabela', 'FEMININO', '33333');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbitensvenda`
--

CREATE TABLE IF NOT EXISTS `tbitensvenda` (
  `idItemVenda` int(11) NOT NULL AUTO_INCREMENT,
  `idVendaFK` int(11) DEFAULT NULL,
  `idProdutoFK` int(11) DEFAULT NULL,
  `nomeProd` varchar(250) NOT NULL,
  `quantidade` int(11) DEFAULT NULL,
  `valorUnit` decimal(18,2) NOT NULL,
  `valorItem` decimal(18,2) NOT NULL,
  PRIMARY KEY (`idItemVenda`),
  KEY `idVendaFK` (`idVendaFK`),
  KEY `idProdutoFK` (`idProdutoFK`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=40 ;

--
-- Extraindo dados da tabela `tbitensvenda`
--

INSERT INTO `tbitensvenda` (`idItemVenda`, `idVendaFK`, `idProdutoFK`, `nomeProd`, `quantidade`, `valorUnit`, `valorItem`) VALUES
(1, 11, 3, '', 2, '0.00', '0.00'),
(2, 12, 3, '', 4, '0.00', '0.00'),
(3, 13, 3, '', 6, '0.00', '0.00'),
(5, 14, 3, '', 2, '900.00', '1800.00'),
(6, 14, 3, 'Molinete 4000', 4, '900.00', '3600.00'),
(7, 15, 3, 'Molinete 4000', 2, '900.00', '1800.00'),
(8, 15, 3, 'Molinete 4000', 4, '900.00', '3600.00'),
(9, 15, 3, 'Molinete 4000', 6, '900.00', '5400.00'),
(11, 16, 3, 'Molinete 4000', 2, '900.00', '1800.00'),
(12, 17, 3, 'Molinete 4000', 1, '900.00', '900.00'),
(13, 17, 3, 'Molinete 4000', 2, '900.00', '1800.00'),
(14, 18, 3, 'Molinete 4000', 1, '900.00', '900.00'),
(15, 18, 3, 'Molinete 4000', 2, '900.00', '1800.00'),
(16, 19, 3, 'Molinete 4000', 1, '900.00', '900.00'),
(18, 20, 3, 'Molinete 4000', 1, '900.00', '900.00'),
(20, 21, 3, 'Molinete 4000', 1, '900.00', '900.00'),
(22, 21, 3, 'Molinete 4000', 3, '900.00', '2700.00'),
(24, 23, 3, 'Molinete 4000', 1, '900.00', '900.00'),
(26, 24, 3, 'Molinete 4000', 2, '900.00', '1800.00'),
(27, 25, 3, 'Molinete 4000', 2, '900.00', '1800.00'),
(28, 26, 3, 'Molinete 4000', 1, '900.00', '900.00'),
(29, 27, 4, 'Vara Para molinete', 2, '350.00', '700.00'),
(30, 27, 3, 'Molinete 4000', 2, '900.00', '1800.00'),
(32, 28, 4, 'Vara Para molinete', 1, '350.00', '350.00'),
(33, 29, 3, 'Molinete 4000', 2, '900.00', '1800.00'),
(34, 29, 4, 'Vara Para molinete', 2, '350.00', '700.00'),
(35, 30, 3, 'Molinete 4000', 3, '900.00', '2700.00'),
(36, 30, 4, 'Vara Para molinete', 3, '350.00', '1050.00'),
(38, 31, 4, 'Vara Para molinete', 1, '350.00', '350.00'),
(39, 32, 3, 'Molinete 4000', 1, '900.00', '900.00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbproduto`
--

CREATE TABLE IF NOT EXISTS `tbproduto` (
  `idProduto` int(11) NOT NULL AUTO_INCREMENT,
  `nomeProduto` varchar(110) DEFAULT NULL,
  `descricao` varchar(350) DEFAULT NULL,
  `precoCusto` decimal(18,2) DEFAULT NULL,
  `precoVenda` decimal(18,2) DEFAULT NULL,
  PRIMARY KEY (`idProduto`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Extraindo dados da tabela `tbproduto`
--

INSERT INTO `tbproduto` (`idProduto`, `nomeProduto`, `descricao`, `precoCusto`, `precoVenda`) VALUES
(3, 'Molinete 4000', 'Marca daiwa, 12 rolamentos, drag de 9kg', '450.00', '900.00'),
(4, 'Vara Para molinete', 'Vara de 100% carbono para molinetes', '200.00', '350.00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbusuario`
--

CREATE TABLE IF NOT EXISTS `tbusuario` (
  `idUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `nomeUsuario` varchar(250) NOT NULL,
  `senhaUsuario` varchar(250) NOT NULL,
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Extraindo dados da tabela `tbusuario`
--

INSERT INTO `tbusuario` (`idUsuario`, `nomeUsuario`, `senhaUsuario`) VALUES
(1, 'Allan', '1234'),
(2, 'Pedro', '1111');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbvenda`
--

CREATE TABLE IF NOT EXISTS `tbvenda` (
  `idVenda` int(11) NOT NULL AUTO_INCREMENT,
  `idClienteFK` int(11) DEFAULT NULL,
  `data` date DEFAULT NULL,
  `tempo` time DEFAULT NULL,
  `pagamento` varchar(250) NOT NULL,
  PRIMARY KEY (`idVenda`),
  KEY `idClienteFK` (`idClienteFK`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=33 ;

--
-- Extraindo dados da tabela `tbvenda`
--

INSERT INTO `tbvenda` (`idVenda`, `idClienteFK`, `data`, `tempo`, `pagamento`) VALUES
(11, 1, '2020-12-04', '23:14:09', ''),
(12, 1, '2020-12-04', '23:21:07', ''),
(13, 1, '2020-12-04', '23:25:41', ''),
(14, 1, '2020-12-04', '23:26:42', ''),
(15, 1, '2020-12-05', '14:22:07', ''),
(16, 1, '2020-12-05', '14:43:00', ''),
(17, 1, '2020-12-05', '14:52:57', ''),
(18, 1, '2020-12-05', '14:54:41', ''),
(19, 1, '2020-12-05', '14:56:02', ''),
(20, 1, '2020-12-05', '15:00:54', ''),
(21, 1, '2020-12-05', '15:02:01', ''),
(23, 1, '2020-12-05', '15:24:26', 'CARTÃO'),
(24, 1, '2020-12-05', '22:23:20', ''),
(25, 1, '2020-12-05', '22:26:39', 'DINHEIRO'),
(26, 1, '2020-12-05', '22:29:05', 'CARTÃO'),
(27, 1, '2020-12-05', '22:31:08', 'APPLE PAY'),
(28, 3, '2020-12-06', '17:54:26', 'DINHEIRO'),
(29, 3, '2020-12-06', '17:58:03', 'APPLE PAY'),
(30, 2, '2020-12-06', '17:59:01', 'CARTÃO'),
(31, 2, '2020-12-06', '18:01:56', 'DINHEIRO'),
(32, 1, '2020-12-06', '18:07:32', 'CARTÃO');

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `tbitensvenda`
--
ALTER TABLE `tbitensvenda`
  ADD CONSTRAINT `tbitensvenda_ibfk_1` FOREIGN KEY (`idVendaFK`) REFERENCES `tbvenda` (`idVenda`),
  ADD CONSTRAINT `tbitensvenda_ibfk_2` FOREIGN KEY (`idProdutoFK`) REFERENCES `tbproduto` (`idProduto`);

--
-- Limitadores para a tabela `tbvenda`
--
ALTER TABLE `tbvenda`
  ADD CONSTRAINT `tbvenda_ibfk_1` FOREIGN KEY (`idClienteFK`) REFERENCES `tbcliente` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
