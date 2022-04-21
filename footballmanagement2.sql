-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: footballmanagement2
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `groupa`
--

DROP TABLE IF EXISTS `groupa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `groupa` (
  `Group_ID` int NOT NULL AUTO_INCREMENT,
  `Team_ID` int NOT NULL,
  `Team_Name` varchar(100) NOT NULL,
  `Played` int DEFAULT '0',
  `Win` int DEFAULT '0',
  `Draw` int DEFAULT '0',
  `Loss` int DEFAULT '0',
  `Point` int DEFAULT '0',
  `Goal_Scored` int DEFAULT '0',
  `Goal_Conceded` int DEFAULT '0',
  `Goal_Def` int DEFAULT '0',
  PRIMARY KEY (`Group_ID`),
  KEY `Team_ID` (`Team_ID`),
  CONSTRAINT `groupa_ibfk_1` FOREIGN KEY (`Team_ID`) REFERENCES `team` (`Team_ID`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=153 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `groupa`
--

LOCK TABLES `groupa` WRITE;
/*!40000 ALTER TABLE `groupa` DISABLE KEYS */;
INSERT INTO `groupa` VALUES (146,1,'Manchester City',0,0,0,0,0,0,0,0),(147,7,'Bayern Munich',0,0,0,0,0,0,0,0),(148,14,'Napoli',0,0,0,0,0,0,0,0),(149,15,'AS Roma',0,0,0,0,0,0,0,0);
/*!40000 ALTER TABLE `groupa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `groupb`
--

DROP TABLE IF EXISTS `groupb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `groupb` (
  `Group_ID` int NOT NULL AUTO_INCREMENT,
  `Team_ID` int NOT NULL,
  `Team_Name` varchar(100) NOT NULL,
  `Played` int DEFAULT '0',
  `Win` int DEFAULT '0',
  `Draw` int DEFAULT '0',
  `Loss` int DEFAULT '0',
  `Point` int DEFAULT '0',
  `Goal_Scored` int DEFAULT '0',
  `Goal_Conceded` int DEFAULT '0',
  `Goal_Def` int DEFAULT '0',
  PRIMARY KEY (`Group_ID`),
  KEY `Team_ID` (`Team_ID`),
  CONSTRAINT `groupb_ibfk_1` FOREIGN KEY (`Team_ID`) REFERENCES `team` (`Team_ID`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=163 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `groupb`
--

LOCK TABLES `groupb` WRITE;
/*!40000 ALTER TABLE `groupb` DISABLE KEYS */;
INSERT INTO `groupb` VALUES (156,2,'Arsenal',0,0,0,0,0,0,0,0),(157,8,'FC Schalke 04',0,0,0,0,0,0,0,0),(158,12,'Paris Saint Germain',0,0,0,0,0,0,0,0),(159,16,'Inter Milan',0,0,0,0,0,0,0,0);
/*!40000 ALTER TABLE `groupb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `groupc`
--

DROP TABLE IF EXISTS `groupc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `groupc` (
  `Group_ID` int NOT NULL AUTO_INCREMENT,
  `Team_ID` int NOT NULL,
  `Team_Name` varchar(100) NOT NULL,
  `Played` int DEFAULT '0',
  `Win` int DEFAULT '0',
  `Draw` int DEFAULT '0',
  `Loss` int DEFAULT '0',
  `Point` int DEFAULT '0',
  `Goal_Scored` int DEFAULT '0',
  `Goal_Conceded` int DEFAULT '0',
  `Goal_Def` int DEFAULT '0',
  PRIMARY KEY (`Group_ID`),
  KEY `Team_ID` (`Team_ID`),
  CONSTRAINT `groupc_ibfk_1` FOREIGN KEY (`Team_ID`) REFERENCES `team` (`Team_ID`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=173 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `groupc`
--

LOCK TABLES `groupc` WRITE;
/*!40000 ALTER TABLE `groupc` DISABLE KEYS */;
INSERT INTO `groupc` VALUES (166,3,'Manchester United',0,0,0,0,0,0,0,0),(167,6,'Borussia Dortmund',0,0,0,0,0,0,0,0),(168,10,'Shakhtar Donetsk',0,0,0,0,0,0,0,0),(169,11,'FC Barcelona',0,0,0,0,0,0,0,0);
/*!40000 ALTER TABLE `groupc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `groupd`
--

DROP TABLE IF EXISTS `groupd`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `groupd` (
  `Group_ID` int NOT NULL AUTO_INCREMENT,
  `Team_ID` int NOT NULL,
  `Team_Name` varchar(100) NOT NULL,
  `Played` int DEFAULT '0',
  `Win` int DEFAULT '0',
  `Draw` int DEFAULT '0',
  `Loss` int DEFAULT '0',
  `Point` int DEFAULT '0',
  `Goal_Scored` int DEFAULT '0',
  `Goal_Conceded` int DEFAULT '0',
  `Goal_Def` int DEFAULT '0',
  PRIMARY KEY (`Group_ID`),
  KEY `Team_ID` (`Team_ID`),
  CONSTRAINT `groupd_ibfk_1` FOREIGN KEY (`Team_ID`) REFERENCES `team` (`Team_ID`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=183 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `groupd`
--

LOCK TABLES `groupd` WRITE;
/*!40000 ALTER TABLE `groupd` DISABLE KEYS */;
INSERT INTO `groupd` VALUES (176,4,'Chealsea',0,0,0,0,0,0,0,0),(177,5,'Juventus',0,0,0,0,0,0,0,0),(178,9,'Real Madrid',0,0,0,0,0,0,0,0),(179,13,'AC Milan',0,0,0,0,0,0,0,0);
/*!40000 ALTER TABLE `groupd` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `league_standing`
--

DROP TABLE IF EXISTS `league_standing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `league_standing` (
  `Team_ID` int NOT NULL,
  `Team_Name` varchar(100) NOT NULL,
  `Played` int DEFAULT '0',
  `Win` int DEFAULT '0',
  `Draw` int DEFAULT '0',
  `Loss` int DEFAULT '0',
  `Point` int DEFAULT '0',
  KEY `Team_ID` (`Team_ID`),
  CONSTRAINT `league_standing_ibfk_1` FOREIGN KEY (`Team_ID`) REFERENCES `team` (`Team_ID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `league_standing`
--

LOCK TABLES `league_standing` WRITE;
/*!40000 ALTER TABLE `league_standing` DISABLE KEYS */;
INSERT INTO `league_standing` VALUES (1,'Manchester City',0,1,0,0,0),(2,'Arsenal',0,1,0,0,0),(3,'Manchester United',0,0,0,0,0),(4,'Chealsea',0,0,1,0,0),(5,'Juventus',0,0,0,0,0),(6,'Borussia Dortmund',0,0,0,0,0),(7,'Bayern Munich',0,0,0,0,0),(8,'FC Schalke 04',0,0,0,0,0),(9,'Real Madrid',0,0,0,0,0),(10,'Shakhtar Donetsk',0,0,0,0,0),(11,'FC Barcelona',0,0,0,0,0),(12,'Paris Saint Germain',0,0,0,0,0),(13,'AC Milan',0,0,0,0,0),(14,'Napoli',0,0,0,1,0),(15,'AS Roma',0,0,0,0,0),(16,'Inter Milan',0,0,0,0,0);
/*!40000 ALTER TABLE `league_standing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `player_attributes`
--

DROP TABLE IF EXISTS `player_attributes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `player_attributes` (
  `Player_ID` int NOT NULL,
  `Physical` int DEFAULT NULL,
  `Speed` int DEFAULT NULL,
  `Mental` int DEFAULT NULL,
  `Defending` int DEFAULT NULL,
  `Attacking` int DEFAULT NULL,
  `Technical` int DEFAULT NULL,
  KEY `Player_ID` (`Player_ID`),
  CONSTRAINT `player_attributes_ibfk_1` FOREIGN KEY (`Player_ID`) REFERENCES `player_info` (`Player_ID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `player_attributes`
--

LOCK TABLES `player_attributes` WRITE;
/*!40000 ALTER TABLE `player_attributes` DISABLE KEYS */;
INSERT INTO `player_attributes` VALUES (2012331002,3,2,4,4,4,2),(2012331049,4,3,4,3,3,4),(2012331067,4,3,4,3,3,4),(201233105,4,3,4,3,3,4),(2012331009,4,3,4,3,3,4),(2012331010,4,3,4,3,3,4),(2012331012,4,3,4,3,3,4),(2012331013,4,3,4,3,3,4),(2012331025,4,3,4,3,3,4),(2012331060,4,3,4,3,3,4),(2012331057,4,3,4,3,3,4),(2011331066,4,1,4,3,1,4),(2009331024,2,1,4,3,3,5),(2009332016,2,1,1,0,2,5),(2012331059,0,4,0,3,2,5),(2012331039,3,3,4,4,2,5);
/*!40000 ALTER TABLE `player_attributes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `player_info`
--

DROP TABLE IF EXISTS `player_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `player_info` (
  `Player_ID` int NOT NULL,
  `Team_ID` int DEFAULT NULL,
  `First_Name` varchar(100) NOT NULL,
  `Last_Name` varchar(100) NOT NULL,
  `Position` varchar(20) DEFAULT NULL,
  `Country_Name` varchar(100) NOT NULL DEFAULT 'Bangladesh',
  PRIMARY KEY (`Player_ID`),
  KEY `Team_ID` (`Team_ID`),
  CONSTRAINT `player_info_ibfk_1` FOREIGN KEY (`Team_ID`) REFERENCES `team` (`Team_ID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `player_info`
--

LOCK TABLES `player_info` WRITE;
/*!40000 ALTER TABLE `player_info` DISABLE KEYS */;
INSERT INTO `player_info` VALUES (201233105,4,'Farzad','Khan','ST','Bangladesh'),(2009331024,13,'Rumie','Mirajul','MID','Bangladesh'),(2009332016,14,'Sunny','Bhai','MID','Bangladesh'),(2011331066,12,'Rafsan','Alu','MID','Bangladesh'),(2012331002,2,'Summit','Haque','ST','Bangladesh'),(2012331009,5,'Abu','Talha','ST','Bangladesh'),(2012331010,6,'Tanvir','Preom','ST','Bangladesh'),(2012331012,7,'Sharon','Datta','ST','Bangladesh'),(2012331013,8,'Moqsedur','Rahman','ST','Bangladesh'),(2012331025,9,'Sharif','Siddiq','ST','Bangladesh'),(2012331039,16,'Obydul','Sajid','MID','Bangladesh'),(2012331049,1,'Moshiur ','Rahman','MID','Bangladesh'),(2012331057,11,'Sazzad','Khatun','MID','Bangladesh'),(2012331059,15,'Al-Amin','Nowshad','MID','Bangladesh'),(2012331060,10,'Shiam','Chowdhury','MID','Bangladesh'),(2012331067,3,'Jillur ','Rahman','ST','Bangladesh');
/*!40000 ALTER TABLE `player_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `result`
--

DROP TABLE IF EXISTS `result`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `result` (
  `Team_One` varchar(100) NOT NULL,
  `Team_Two` varchar(100) NOT NULL,
  `Category` varchar(20) NOT NULL,
  `Match_Date` date DEFAULT NULL,
  `Match_Time` varchar(100) DEFAULT NULL,
  `Match_Result` varchar(100) DEFAULT NULL,
  `Goal_T1` int DEFAULT '0',
  `Goal_T2` int DEFAULT '0',
  `Year` int DEFAULT NULL,
  `Match_ID` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`Match_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=193 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `result`
--

LOCK TABLES `result` WRITE;
/*!40000 ALTER TABLE `result` DISABLE KEYS */;
INSERT INTO `result` VALUES ('Manchester City','Real Madrid','A',NULL,NULL,NULL,0,0,2016,73),('Manchester City','Shakhtar Donetsk','A',NULL,NULL,NULL,0,0,2016,74),('Manchester City','AC Milan','A',NULL,NULL,NULL,0,0,2016,75),('Real Madrid','Shakhtar Donetsk','A',NULL,NULL,NULL,0,0,2016,76),('Real Madrid','AC Milan','A',NULL,NULL,NULL,0,0,2016,77),('Shakhtar Donetsk','AC Milan','A',NULL,NULL,NULL,0,0,2016,78),('Arsenal','Bayern Munich','B',NULL,NULL,NULL,0,0,2016,79),('Arsenal','FC Barcelona','B',NULL,NULL,NULL,0,0,2016,80),('Arsenal','Inter Milan','B',NULL,NULL,NULL,0,0,2016,81),('Bayern Munich','FC Barcelona','B',NULL,NULL,NULL,0,0,2016,82),('Bayern Munich','Inter Milan','B',NULL,NULL,NULL,0,0,2016,83),('FC Barcelona','Inter Milan','B',NULL,NULL,NULL,0,0,2016,84),('Manchester United','Borussia Dortmund','C',NULL,NULL,NULL,0,0,2016,85),('Manchester United','Paris Saint Germain','C',NULL,NULL,NULL,0,0,2016,86),('Manchester United','AS Roma','C',NULL,NULL,NULL,0,0,2016,87),('Borussia Dortmund','Paris Saint Germain','C',NULL,NULL,NULL,0,0,2016,88),('Borussia Dortmund','AS Roma','C',NULL,NULL,NULL,0,0,2016,89),('Paris Saint Germain','AS Roma','C',NULL,NULL,NULL,0,0,2016,90),('Chealsea','Juventus','D',NULL,NULL,NULL,0,0,2016,91),('Chealsea','FC Schalke 04','D',NULL,NULL,NULL,0,0,2016,92),('Chealsea','Napoli','D',NULL,NULL,NULL,0,0,2016,93),('Juventus','FC Schalke 04','D',NULL,NULL,NULL,0,0,2016,94),('Juventus','Napoli','D',NULL,NULL,NULL,0,0,2016,95),('FC Schalke 04','Napoli','D',NULL,NULL,NULL,0,0,2016,96),('Manchester City','Bayern Munich','A',NULL,NULL,NULL,0,0,2022,169),('Manchester City','Napoli','A',NULL,NULL,NULL,0,0,2022,170),('Manchester City','AS Roma','A',NULL,NULL,NULL,0,0,2022,171),('Bayern Munich','Napoli','A',NULL,NULL,NULL,0,0,2022,172),('Bayern Munich','AS Roma','A',NULL,NULL,NULL,0,0,2022,173),('Napoli','AS Roma','A',NULL,NULL,NULL,0,0,2022,174),('Arsenal','FC Schalke 04','B',NULL,NULL,NULL,0,0,2022,175),('Arsenal','Paris Saint Germain','B',NULL,NULL,NULL,0,0,2022,176),('Arsenal','Inter Milan','B',NULL,NULL,NULL,0,0,2022,177),('FC Schalke 04','Paris Saint Germain','B',NULL,NULL,NULL,0,0,2022,178),('FC Schalke 04','Inter Milan','B',NULL,NULL,NULL,0,0,2022,179),('Paris Saint Germain','Inter Milan','B',NULL,NULL,NULL,0,0,2022,180),('Manchester United','Borussia Dortmund','C',NULL,NULL,NULL,0,0,2022,181),('Manchester United','Shakhtar Donetsk','C',NULL,NULL,NULL,0,0,2022,182),('Manchester United','FC Barcelona','C',NULL,NULL,NULL,0,0,2022,183),('Borussia Dortmund','Shakhtar Donetsk','C',NULL,NULL,NULL,0,0,2022,184),('Borussia Dortmund','FC Barcelona','C',NULL,NULL,NULL,0,0,2022,185),('Shakhtar Donetsk','FC Barcelona','C',NULL,NULL,NULL,0,0,2022,186),('Chealsea','Juventus','D',NULL,NULL,NULL,0,0,2022,187),('Chealsea','Real Madrid','D',NULL,NULL,NULL,0,0,2022,188),('Chealsea','AC Milan','D',NULL,NULL,NULL,0,0,2022,189),('Juventus','Real Madrid','D',NULL,NULL,NULL,0,0,2022,190),('Juventus','AC Milan','D',NULL,NULL,NULL,0,0,2022,191),('Real Madrid','AC Milan','D',NULL,NULL,NULL,0,0,2022,192);
/*!40000 ALTER TABLE `result` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `team`
--

DROP TABLE IF EXISTS `team`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `team` (
  `Team_ID` int NOT NULL,
  `Team_Name` varchar(100) NOT NULL,
  `Year_Founded` int NOT NULL,
  `Value` int NOT NULL,
  `Last_Year_Position` int DEFAULT NULL,
  PRIMARY KEY (`Team_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `team`
--

LOCK TABLES `team` WRITE;
/*!40000 ALTER TABLE `team` DISABLE KEYS */;
INSERT INTO `team` VALUES (1,'Manchester City',2008,20000,1),(2,'Arsenal',1950,20000,2),(3,'Manchester United',2009,20000,3),(4,'Chealsea',2008,20000,4),(5,'Juventus',1999,20000,5),(6,'Borussia Dortmund',2001,20000,6),(7,'Bayern Munich',2000,20000,7),(8,'FC Schalke 04',2005,20000,8),(9,'Real Madrid',1998,20000,9),(10,'Shakhtar Donetsk',2006,20000,10),(11,'FC Barcelona',2004,20000,11),(12,'Paris Saint Germain',2007,20000,12),(13,'AC Milan',2000,20000,13),(14,'Napoli',2003,20000,14),(15,'AS Roma',2005,20000,15),(16,'Inter Milan',2001,20000,16),(17,'No Team',0,0,0);
/*!40000 ALTER TABLE `team` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('admin','admin');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-21 20:12:36
