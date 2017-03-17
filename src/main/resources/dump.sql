-- MySQL dump 10.13  Distrib 5.7.17, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: ecomm
-- ------------------------------------------------------
-- Server version	5.7.17-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Customer`
--

DROP TABLE IF EXISTS `Customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Customer` (
  `cu_customer_id` int(8) NOT NULL,
  `cu_first_name` varchar(40) DEFAULT NULL,
  `cu_last_name` varchar(40) DEFAULT NULL,
  `cu_address` varchar(255) DEFAULT NULL,
  `cu_city` varchar(16) DEFAULT NULL,
  `cu_state` varchar(2) DEFAULT NULL,
  `cu_zip_code` int(9) DEFAULT NULL,
  `cu_telephone` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`cu_customer_id`),
  KEY `cu_state` (`cu_state`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Customer`
--

LOCK TABLES `Customer` WRITE;
/*!40000 ALTER TABLE `Customer` DISABLE KEYS */;
INSERT INTO `Customer` VALUES (123,'Jesus','Arana','123 S Front St','Memphis','TN',38003,'901 123-4567'),(324,'Molly','Campbell','320 Summerfield Ln','TN','TN',38018,'(901) 678-2537'),(327,'Barney','Campbell','675 N Bear Dr.','Ashville','NC',79032,'(901) 678-2538');
/*!40000 ALTER TABLE `Customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Part`
--

DROP TABLE IF EXISTS `Part`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Part` (
  `pa_sku_number` int(8) NOT NULL,
  `pa_part_number` varchar(12) DEFAULT NULL,
  `pa_description` varchar(255) DEFAULT NULL,
  `pa_vendor_number` int(11) DEFAULT NULL,
  `pa_cost_amt` decimal(6,2) DEFAULT NULL,
  `pa_price_amt` decimal(6,2) DEFAULT NULL,
  PRIMARY KEY (`pa_sku_number`),
  KEY `pa_vendor_number` (`pa_vendor_number`),
  CONSTRAINT `Part_ibfk_1` FOREIGN KEY (`pa_vendor_number`) REFERENCES `Vendor` (`ve_vendor_number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Part`
--

LOCK TABLES `Part` WRITE;
/*!40000 ALTER TABLE `Part` DISABLE KEYS */;
INSERT INTO `Part` VALUES (23456,'SP-4589','Bush Spark Plug HP',678,3.54,5.21),(24578,'BatGold-348','Battery DuraGold',682,78.23,112.59);
/*!40000 ALTER TABLE `Part` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Inventory`
--

DROP TABLE IF EXISTS `Inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Inventory` (
  `in_location` varchar(12) NOT NULL,
  `in_sku_number` int(8) DEFAULT NULL,
  `in_quantity_on_hand` int(11) DEFAULT NULL,
  PRIMARY KEY (`in_location`),
  KEY `in_sku_number` (`in_sku_number`),
  CONSTRAINT `Inventory_ibfk_1` FOREIGN KEY (`in_sku_number`) REFERENCES `Part` (`pa_sku_number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Inventory`
--

LOCK TABLES `Inventory` WRITE;
/*!40000 ALTER TABLE `Inventory` DISABLE KEYS */;
INSERT INTO `Inventory` VALUES ('AB12',23456,220);
/*!40000 ALTER TABLE `Inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `language`
--

DROP TABLE IF EXISTS `language`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `language` (
  `languageId` int(11) NOT NULL,
  `languageName` varchar(20) NOT NULL,
  PRIMARY KEY (`languageId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `language`
--

LOCK TABLES `language` WRITE;
/*!40000 ALTER TABLE `language` DISABLE KEYS */;
/*!40000 ALTER TABLE `language` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Sale`
--

DROP TABLE IF EXISTS `Sale`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Sale` (
  `sa_invoice_number` int(8) NOT NULL,
  `sa_sku_number` int(8) DEFAULT NULL,
  `sa_quantity_sold` int(5) DEFAULT NULL,
  `sa_customer_id` int(8) DEFAULT NULL,
  `sa_price_amount` decimal(6,2) DEFAULT NULL,
  `sa_tax_id` int(10) NOT NULL,
  PRIMARY KEY (`sa_invoice_number`),
  KEY `sa_sku_number` (`sa_sku_number`),
  KEY `sa_customer_id` (`sa_customer_id`),
  KEY `Sale_ibfk_tax` (`sa_tax_id`),
  CONSTRAINT `Sale_ibfk_1` FOREIGN KEY (`sa_sku_number`) REFERENCES `Part` (`pa_sku_number`),
  CONSTRAINT `Sale_ibfk_2` FOREIGN KEY (`sa_customer_id`) REFERENCES `Customer` (`cu_customer_id`),
  CONSTRAINT `Sale_ibfk_tax` FOREIGN KEY (`sa_tax_id`) REFERENCES `Tax` (`ta_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Sale`
--

LOCK TABLES `Sale` WRITE;
/*!40000 ALTER TABLE `Sale` DISABLE KEYS */;
INSERT INTO `Sale` VALUES (1,23456,6,123,5.21,1),(3,24578,2,123,112.59,2);
/*!40000 ALTER TABLE `Sale` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Tax`
--

DROP TABLE IF EXISTS `Tax`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Tax` (
  `ta_id` int(10) NOT NULL,
  `ta_state_code` varchar(2) NOT NULL,
  `ta_category` varchar(12) DEFAULT NULL,
  `ta_tax_pct` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`ta_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Tax`
--

LOCK TABLES `Tax` WRITE;
/*!40000 ALTER TABLE `Tax` DISABLE KEYS */;
INSERT INTO `Tax` VALUES (1,'CA','clothing',0.11),(2,'NC','autoparts',0.09),(3,'NY','clothing',0.00),(4,'OR','autoparts',0.10),(5,'TN','autoparts',0.08);
/*!40000 ALTER TABLE `Tax` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Vendor`
--

DROP TABLE IF EXISTS `Vendor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Vendor` (
  `ve_vendor_number` int(8) NOT NULL,
  `ve_vendor_name` varchar(60) DEFAULT NULL,
  `ve_address` varchar(255) DEFAULT NULL,
  `ve_city` varchar(16) DEFAULT NULL,
  `ve_state` varchar(2) DEFAULT NULL,
  `ve_zip_code` int(9) DEFAULT NULL,
  `ve_telephone` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`ve_vendor_number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Vendor`
--

LOCK TABLES `Vendor` WRITE;
/*!40000 ALTER TABLE `Vendor` DISABLE KEYS */;
INSERT INTO `Vendor` VALUES (678,'Bush','567 Washington St','Dearborn','MI',56788,'(648)347-4721'),(682,'Valucraft','123 S Front St','Memphis','TN',38103,'(901)495-6500');
/*!40000 ALTER TABLE `Vendor` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-11 18:34:24
