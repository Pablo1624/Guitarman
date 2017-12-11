-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-12-2017 a las 16:56:46
-- Versión del servidor: 5.6.24
-- Versión de PHP: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `tienda_juegos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tabla_juego`
--

CREATE TABLE IF NOT EXISTS `tabla_juego` (
  `id` int(11) NOT NULL,
  `nombre_jue` varchar(50) NOT NULL,
  `precio_jue` int(11) NOT NULL,
  `categoria_jue` varchar(30) NOT NULL,
  `stock_jue` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tabla_juego`
--

INSERT INTO `tabla_juego` (`id`, `nombre_jue`, `precio_jue`, `categoria_jue`, `stock_jue`) VALUES
(12, 'GTAV', 30000, 'Acción', 115),
(213, 'mellaqlo', 12345, 'Aventura', 340),
(4564, 'Pato purific', 1234, 'Aventura', 344);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tabla_ventas`
--

CREATE TABLE IF NOT EXISTS `tabla_ventas` (
  `id` int(11) NOT NULL,
  `nombre_jue` varchar(20) NOT NULL,
  `precio_jue` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tabla_ventas`
--

INSERT INTO `tabla_ventas` (`id`, `nombre_jue`, `precio_jue`) VALUES
(12, 'GTAV', 30000),
(12, 'GTAV', 30000),
(12, 'GTAV', 30000),
(213, 'mellaqlo', 12345),
(213, 'mellaqlo', 12345),
(4564, 'Pato purific', 1234);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tabla_juego`
--
ALTER TABLE `tabla_juego`
  ADD PRIMARY KEY (`id`), ADD KEY `id` (`id`,`nombre_jue`,`precio_jue`,`categoria_jue`,`stock_jue`);

--
-- Indices de la tabla `tabla_ventas`
--
ALTER TABLE `tabla_ventas`
  ADD KEY `id` (`id`,`nombre_jue`,`precio_jue`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tabla_ventas`
--
ALTER TABLE `tabla_ventas`
ADD CONSTRAINT `tabla_ventas_ibfk_1` FOREIGN KEY (`id`) REFERENCES `tabla_juego` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
