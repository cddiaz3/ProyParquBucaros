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
-- Temporary view structure for view `vistavehiculos`
--

DROP TABLE IF EXISTS `vistavehiculos`;
/*!50001 DROP VIEW IF EXISTS `vistavehiculos`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vistavehiculos` AS SELECT 
 1 AS `idVehiculos`,
 1 AS `placa`,
 1 AS `tipoVehiculo`,
 1 AS `horaEntrada`,
 1 AS `horaSalida`,
 1 AS `valorMinuto`,
 1 AS `valorPagar`,
 1 AS `idPlazaVehiculo`,
 1 AS `idUsuarioVehiculo`,
 1 AS `idPlazasNeway`,
 1 AS `tipoPlaza`,
 1 AS `codigoPlaza`,
 1 AS `EstadoPlaza`,
 1 AS `idUsuarios`,
 1 AS `usuario`,
 1 AS `contraseña`,
 1 AS `nombre`,
 1 AS `apellido`,
 1 AS `email`,
 1 AS `tipoDocumento`,
 1 AS `documento`,
 1 AS `celular`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `vistavehiculos`
--

/*!50001 DROP VIEW IF EXISTS `vistavehiculos`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vistavehiculos` AS select `vehiculos`.`idVehiculos` AS `idVehiculos`,`vehiculos`.`placa` AS `placa`,`vehiculos`.`tipoVehiculo` AS `tipoVehiculo`,`vehiculos`.`horaEntrada` AS `horaEntrada`,`vehiculos`.`horaSalida` AS `horaSalida`,`vehiculos`.`valorMinuto` AS `valorMinuto`,`vehiculos`.`valorPagar` AS `valorPagar`,`vehiculos`.`idPlazaVehiculo` AS `idPlazaVehiculo`,`vehiculos`.`idUsuarioVehiculo` AS `idUsuarioVehiculo`,`plazasneway`.`idPlazasNeway` AS `idPlazasNeway`,`plazasneway`.`tipoPlaza` AS `tipoPlaza`,`plazasneway`.`codigoPlaza` AS `codigoPlaza`,`plazasneway`.`EstadoPlaza` AS `EstadoPlaza`,`usuarios`.`idUsuarios` AS `idUsuarios`,`usuarios`.`usuario` AS `usuario`,`usuarios`.`contraseña` AS `contraseña`,`usuarios`.`nombre` AS `nombre`,`usuarios`.`apellido` AS `apellido`,`usuarios`.`email` AS `email`,`usuarios`.`tipoDocumento` AS `tipoDocumento`,`usuarios`.`documento` AS `documento`,`usuarios`.`celular` AS `celular` from ((`vehiculos` join `plazasneway` on((`vehiculos`.`idPlazaVehiculo` = `plazasneway`.`idPlazasNeway`))) join `usuarios` on((`vehiculos`.`idUsuarioVehiculo` = `usuarios`.`idUsuarios`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-01 20:10:48
