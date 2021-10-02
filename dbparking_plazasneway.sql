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
-- Table structure for table `plazasneway`
--

DROP TABLE IF EXISTS `plazasneway`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `plazasneway` (
  `idPlazasNeway` int NOT NULL AUTO_INCREMENT,
  `tipoPlaza` varchar(45) NOT NULL,
  `codigoPlaza` varchar(45) NOT NULL,
  `EstadoPlaza` varchar(45) NOT NULL,
  PRIMARY KEY (`idPlazasNeway`),
  UNIQUE KEY `codigoPlaza_UNIQUE` (`codigoPlaza`),
  UNIQUE KEY `idPlazasNeway_UNIQUE` (`idPlazasNeway`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plazasneway`
--

LOCK TABLES `plazasneway` WRITE;
/*!40000 ALTER TABLE `plazasneway` DISABLE KEYS */;
INSERT INTO `plazasneway` VALUES (1,'carro','C1','vacio'),(2,'carro','C2','vacio'),(3,'carro','C3','vacio'),(4,'carro','C4','vacio'),(5,'varro','C5','vacio'),(6,'varro','C6','vacio'),(7,'varro','C7','vacio'),(8,'carro','C8','vacio'),(9,'carro','C9','vacio'),(10,'carro','C10','vacio'),(11,'moto','M11','vacio'),(12,'moto','M12','vacio'),(13,'moto','M13','vacio'),(14,'moto','M14','vacio'),(15,'moto','M15','vacio');
/*!40000 ALTER TABLE `plazasneway` ENABLE KEYS */;
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
