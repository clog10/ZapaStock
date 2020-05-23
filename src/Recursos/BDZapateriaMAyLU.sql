-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: bdzapateriamaylu
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `apartado`
--

DROP TABLE IF EXISTS `apartado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `apartado` (
  `codigo_a` int(11) NOT NULL,
  `nom_cliente` varchar(30) NOT NULL,
  `codigo_z` int(11) NOT NULL,
  `codigo_b` int(11) NOT NULL,
  `cantidad` int(2) NOT NULL,
  `fecha_inicio` date NOT NULL,
  `fecha_termino` date NOT NULL,
  `abono` decimal(4,2) NOT NULL,
  `Resta_producto` decimal(4,2) NOT NULL,
  PRIMARY KEY (`codigo_a`),
  KEY `codigo_z_idx` (`codigo_b`),
  KEY `codigo_z_idx1` (`codigo_z`),
  CONSTRAINT `codigo_b` FOREIGN KEY (`codigo_b`) REFERENCES `producto_b` (`codigo_b`),
  CONSTRAINT `codigo_z` FOREIGN KEY (`codigo_z`) REFERENCES `producto_z` (`codigo_z`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `apartado`
--

LOCK TABLES `apartado` WRITE;
/*!40000 ALTER TABLE `apartado` DISABLE KEYS */;
/*!40000 ALTER TABLE `apartado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalle_venta`
--

DROP TABLE IF EXISTS `detalle_venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detalle_venta` (
  `codigo_ven_det` int(11) NOT NULL,
  `cantidad_prod` int(2) NOT NULL,
  `precio_unitario` decimal(4,2) NOT NULL,
  `codigo_z` int(11) NOT NULL,
  `codigo_b` int(11) NOT NULL,
  `descuento` int(5) NOT NULL,
  PRIMARY KEY (`codigo_ven_det`),
  KEY `producto_z_idx` (`codigo_z`),
  KEY `producto_b_idx` (`codigo_b`),
  CONSTRAINT `producto_b` FOREIGN KEY (`codigo_b`) REFERENCES `producto_b` (`codigo_b`),
  CONSTRAINT `producto_z` FOREIGN KEY (`codigo_z`) REFERENCES `producto_z` (`codigo_z`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_venta`
--

LOCK TABLES `detalle_venta` WRITE;
/*!40000 ALTER TABLE `detalle_venta` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalle_venta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto_b`
--

DROP TABLE IF EXISTS `producto_b`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto_b` (
  `codigo_b` int(11) NOT NULL,
  `color` varchar(15) NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  `marca` varchar(25) NOT NULL,
  `modelo` varchar(40) NOT NULL,
  `stock` int(2) NOT NULL,
  `precio_b` decimal(4,2) NOT NULL,
  `imagen_b` blob NOT NULL,
  PRIMARY KEY (`codigo_b`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto_b`
--

LOCK TABLES `producto_b` WRITE;
/*!40000 ALTER TABLE `producto_b` DISABLE KEYS */;
/*!40000 ALTER TABLE `producto_b` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto_z`
--

DROP TABLE IF EXISTS `producto_z`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto_z` (
  `codigo_z` int(11) NOT NULL,
  `color` varchar(15) NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  `marca` varchar(25) NOT NULL,
  `modelo` varchar(40) NOT NULL,
  `stock` int(2) NOT NULL,
  `precio_z` decimal(4,2) NOT NULL,
  `imagen_z` blob NOT NULL,
  `numeracion` decimal(2,1) NOT NULL,
  PRIMARY KEY (`codigo_z`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto_z`
--

LOCK TABLES `producto_z` WRITE;
/*!40000 ALTER TABLE `producto_z` DISABLE KEYS */;
/*!40000 ALTER TABLE `producto_z` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL,
  `Usuario` varchar(30) NOT NULL,
  `Contraseña` varchar(15) NOT NULL,
  `tipo_usuario` varchar(45) NOT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venta`
--

DROP TABLE IF EXISTS `venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venta` (
  `codigo_v` int(11) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  `fecha` date NOT NULL,
  `importe` decimal(6,2) NOT NULL,
  `total` decimal(6,2) NOT NULL,
  `codigo_vent_det` int(11) NOT NULL,
  PRIMARY KEY (`codigo_v`),
  KEY `codigo_det_vent_idx` (`codigo_vent_det`),
  CONSTRAINT `codigo_det_vent` FOREIGN KEY (`codigo_vent_det`) REFERENCES `detalle_venta` (`codigo_ven_det`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta`
--

LOCK TABLES `venta` WRITE;
/*!40000 ALTER TABLE `venta` DISABLE KEYS */;
/*!40000 ALTER TABLE `venta` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-16 21:32:05
