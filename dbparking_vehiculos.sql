-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: dbparking
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `vehiculos`
--

DROP TABLE IF EXISTS `vehiculos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehiculos` (
  `idVehiculos` int NOT NULL AUTO_INCREMENT,
  `placa` varchar(10) NOT NULL,
  `tipoVehiculo` varchar(10) NOT NULL,
  `horaEntrada` date NOT NULL,
  `horaSalida` date DEFAULT NULL,
  `valorMinuto` varchar(10) NOT NULL,
  `valorPagar` double DEFAULT NULL,
  `idPlazaVehiculo` int NOT NULL,
  `idUsuarioVehiculo` int NOT NULL,
  PRIMARY KEY (`idVehiculos`),
  UNIQUE KEY `Ticket_UNIQUE` (`idVehiculos`),
  KEY `VehiculoPlaza_idx` (`idPlazaVehiculo`),
  KEY `usuariosVehiculos_idx` (`idUsuarioVehiculo`),
  CONSTRAINT `usuariosVehiculos` FOREIGN KEY (`idUsuarioVehiculo`) REFERENCES `usuarios` (`idUsuarios`),
  CONSTRAINT `VehiculoPlaza` FOREIGN KEY (`idPlazaVehiculo`) REFERENCES `plazasneway` (`idPlazasNeway`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiculos`
--

LOCK TABLES `vehiculos` WRITE;
/*!40000 ALTER TABLE `vehiculos` DISABLE KEYS */;
INSERT INTO `vehiculos` VALUES (1,'CDF345','carro','2021-09-16','2021-09-16','100',2000,1,1),(2,'BFD234','carro','2021-09-16','2021-09-16','100',2000,2,1),(3,'ZDF324','carro','2021-09-16','2021-09-16','100',2000,3,1);
/*!40000 ALTER TABLE `vehiculos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-01 20:10:48
