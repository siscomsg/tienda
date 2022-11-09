-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 09-11-2022 a las 22:26:22
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tienda`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `base_undmed`
--

CREATE TABLE `base_undmed` (
  `cod_undmed` varchar(3) NOT NULL,
  `desc_undmed` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `base_undmed`
--

INSERT INTO `base_undmed` (`cod_undmed`, `desc_undmed`) VALUES
('4A', 'BOBINAS'),
('BE', 'FARDO'),
('BG', 'BOLSA'),
('BJ', 'BALDE'),
('BLL', 'BARRILES'),
('BO', 'BOTELLAS'),
('BX', 'CAJA'),
('C62', 'PIEZAS'),
('CA', 'LATAS'),
('CEN', 'CIENTO DE UNIDADES'),
('CJ', 'CONOS'),
('CMK', 'CENTIMETRO CUADRADO'),
('CMQ', 'CENTIMETRO CUBICO'),
('CMT', 'CENTIMETRO LINEAL'),
('CT', 'CARTONES'),
('CY', 'CILINDRO'),
('DR', 'TAMBOR'),
('DZN', 'DOCENA'),
('DZP', 'DOCENA POR 10**6'),
('FOT', 'PIES'),
('FTK', 'PIES CUADRADOS'),
('FTQ', 'PIES CUBICOS'),
('GLI', 'GALON INGLES (4,545956L)'),
('GLL', 'US GALON (3,7843 L)'),
('GRM', 'GRAMO'),
('GRO', 'GRUESA'),
('HLT', 'HECTOLITRO'),
('INH', 'PULGADAS'),
('KGM', 'KILOGRAMO'),
('KT', 'KIT'),
('KTM', 'KILOMETRO'),
('KWH', 'KILOVATIO HORA'),
('LBR', 'LIBRAS'),
('LEF', 'HOJA'),
('LTN', 'TONELADA LARGA'),
('LTR', 'LITRO'),
('MGM', 'MILIGRAMOS'),
('MIL', 'MILLARES'),
('MLT', 'MILILITRO'),
('MMK', 'MILIMETRO CUADRADO'),
('MMQ', 'MILIMETRO CUBICO'),
('MMT', 'MILIMETRO'),
('MTK', 'METRO CUADRADO'),
('MTQ', 'METRO CUBICO'),
('MTR', 'METRO'),
('MWH', 'MEGAWATT HORA'),
('NIU', 'UNIDAD (BIENES)'),
('ONZ', 'ONZAS'),
('PF', 'PALETAS'),
('PG', 'PLACAS'),
('PK', 'PAQUETE'),
('PR', 'PAR'),
('RM', 'RESMA'),
('SET', 'JUEGO'),
('ST', 'PLIEGO'),
('STN', 'TONELADA CORTA'),
('TNE', 'TONELADAS'),
('TU', 'TUBOS'),
('UM', 'MILLON DE UNIDADES'),
('YDK', 'YARDA CUADRADA'),
('YRD', 'YARDA'),
('ZZ', 'UNIDAD (SERVICIOS)');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `boleta`
--

CREATE TABLE `boleta` (
  `num_bol` varchar(8) NOT NULL,
  `cod_cli` varchar(6) NOT NULL,
  `pre_tot` varchar(10) NOT NULL,
  `fecha` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `boleta`
--

INSERT INTO `boleta` (`num_bol`, `cod_cli`, `pre_tot`, `fecha`) VALUES
('00000001', 'CC0001', '76.0', '05/07/2022'),
('00000002', 'CC0001', '35.0', '03/08/2022'),
('00000003', 'CC0001', '310.0', '04/08/2022'),
('00000004', 'CC0001', '25.0', '04/08/2022'),
('00000005', 'CC0002', '80.0', '04/08/2022');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `cod_cli` varchar(6) NOT NULL,
  `nom_cli` varchar(30) NOT NULL,
  `ape_cli` varchar(30) NOT NULL,
  `sexo_cli` varchar(1) NOT NULL,
  `dni_cli` varchar(8) NOT NULL,
  `tel_cli` varchar(9) NOT NULL,
  `ruc_cli` varchar(11) NOT NULL,
  `email_cli` varchar(30) NOT NULL,
  `dir_cli` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`cod_cli`, `nom_cli`, `ape_cli`, `sexo_cli`, `dni_cli`, `tel_cli`, `ruc_cli`, `email_cli`, `dir_cli`) VALUES
('CC0001', 'JUAN', 'PEREZ', 'M', '12345678', '989822233', '', '----', 'LOS ALAMOS 333'),
('CC0002', 'CLIENTE', 'GENERAL', 'M', '00000000', '90909099', '00000000000', '', 'CONCEPCION');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalleboleta`
--

CREATE TABLE `detalleboleta` (
  `num_bol` varchar(10) NOT NULL,
  `cod_pro` varchar(6) NOT NULL,
  `des_pro` varchar(30) NOT NULL,
  `cant_pro` varchar(3) NOT NULL,
  `pre_unit` varchar(10) NOT NULL,
  `pre_venta` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detalleboleta`
--

INSERT INTO `detalleboleta` (`num_bol`, `cod_pro`, `des_pro`, `cant_pro`, `pre_unit`, `pre_venta`) VALUES
('00000001', 'CP0002', 'PINTURA DE PRUEBA', '2', '38', '76.0'),
('00000002', 'CP0001', 'SELLOS DE AGUA', '1', '35', '35.0'),
('00000003', 'CP0001', 'SELLOS DE AGUA', '10', '23', '230.0'),
('00000003', 'CP0002', 'PINTURA DE PRUEBA', '2', '40', '80.0'),
('00000004', 'CP0001', 'SELLOS DE AGUA', '1', '25', '25.0'),
('00000005', 'CP0002', 'PINTURA DE PRUEBA', '2', '40', '80.0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallefactura`
--

CREATE TABLE `detallefactura` (
  `num_fac` varchar(10) NOT NULL,
  `cod_pro` varchar(6) NOT NULL,
  `des_pro` varchar(30) NOT NULL,
  `cant_pro` varchar(3) NOT NULL,
  `pre_unit` varchar(10) NOT NULL,
  `pre_tot` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detallefactura`
--

INSERT INTO `detallefactura` (`num_fac`, `cod_pro`, `des_pro`, `cant_pro`, `pre_unit`, `pre_tot`) VALUES
('00000001', 'CP0001', 'SELLOS DE AGUA', '3', '25', '75.0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `num_fac` varchar(8) NOT NULL,
  `cod_cli` varchar(6) NOT NULL,
  `ruc_cli` varchar(11) NOT NULL,
  `subtotal` varchar(10) NOT NULL,
  `igv` varchar(40) NOT NULL,
  `total` varchar(20) NOT NULL,
  `fec_fac` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`num_fac`, `cod_cli`, `ruc_cli`, `subtotal`, `igv`, `total`, `fec_fac`) VALUES
('00000001', 'CC0001', '', '75.0', '13.5', '88.5', '01/06/2015');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ingresostock`
--

CREATE TABLE `ingresostock` (
  `id_ingresostock` int(11) NOT NULL,
  `desc_doc` varchar(30) NOT NULL,
  `num_doc` varchar(30) NOT NULL,
  `fecha` varchar(20) NOT NULL,
  `cod_pro` varchar(6) NOT NULL,
  `precio` double NOT NULL,
  `stock` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `ingresostock`
--

INSERT INTO `ingresostock` (`id_ingresostock`, `desc_doc`, `num_doc`, `fecha`, `cod_pro`, `precio`, `stock`) VALUES
(1, 'Factura', '2323', '01/06/2015', 'CP0001', 20, 20),
(2, 'Boleta', '0320432', '05/07/2022', 'CP0001', 34, 23),
(3, 'Boleta', '0324032', '05/07/2022', 'CP0002', 36, 20),
(4, 'Factura', '1212', '04/08/2022', 'CP0001', 20, 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `cod_pro` varchar(11) NOT NULL,
  `cod_undmed` varchar(5) NOT NULL,
  `descripcion` varchar(30) NOT NULL,
  `precio` varchar(10) NOT NULL,
  `Stock` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`cod_pro`, `cod_undmed`, `descripcion`, `precio`, `Stock`) VALUES
('CP0001', 'NIU', 'SELLOS DE AGUA', '20', '19'),
('CP0002', 'ZZ', 'PINTURA DE PRUEBA', '36', '34');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `base_undmed`
--
ALTER TABLE `base_undmed`
  ADD PRIMARY KEY (`cod_undmed`);

--
-- Indices de la tabla `boleta`
--
ALTER TABLE `boleta`
  ADD PRIMARY KEY (`num_bol`),
  ADD KEY `cod_cli` (`cod_cli`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`cod_cli`);

--
-- Indices de la tabla `detalleboleta`
--
ALTER TABLE `detalleboleta`
  ADD KEY `num_bol` (`num_bol`),
  ADD KEY `cod_pro` (`cod_pro`);

--
-- Indices de la tabla `detallefactura`
--
ALTER TABLE `detallefactura`
  ADD KEY `num_fac` (`num_fac`),
  ADD KEY `cod_pro` (`cod_pro`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`num_fac`),
  ADD KEY `cod_cli` (`cod_cli`);

--
-- Indices de la tabla `ingresostock`
--
ALTER TABLE `ingresostock`
  ADD PRIMARY KEY (`id_ingresostock`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`cod_pro`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ingresostock`
--
ALTER TABLE `ingresostock`
  MODIFY `id_ingresostock` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `boleta`
--
ALTER TABLE `boleta`
  ADD CONSTRAINT `boleta_ibfk_1` FOREIGN KEY (`cod_cli`) REFERENCES `cliente` (`cod_cli`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `detalleboleta`
--
ALTER TABLE `detalleboleta`
  ADD CONSTRAINT `detalleboleta_ibfk_1` FOREIGN KEY (`num_bol`) REFERENCES `boleta` (`num_bol`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `detalleboleta_ibfk_2` FOREIGN KEY (`cod_pro`) REFERENCES `producto` (`cod_pro`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `detallefactura`
--
ALTER TABLE `detallefactura`
  ADD CONSTRAINT `detallefactura_ibfk_1` FOREIGN KEY (`num_fac`) REFERENCES `factura` (`num_fac`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `detallefactura_ibfk_2` FOREIGN KEY (`cod_pro`) REFERENCES `producto` (`cod_pro`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `factura_ibfk_1` FOREIGN KEY (`cod_cli`) REFERENCES `cliente` (`cod_cli`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
