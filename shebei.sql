-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: shebei
-- ------------------------------------------------------
-- Server version	5.7.16-log

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
-- Table structure for table `content`
--

DROP TABLE IF EXISTS `content`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `content` (
  `Cid` int(11) NOT NULL AUTO_INCREMENT,
  `Tid` int(11) NOT NULL,
  `Project` varchar(100) NOT NULL,
  PRIMARY KEY (`Cid`)
) ENGINE=InnoDB AUTO_INCREMENT=175 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `content`
--

LOCK TABLES `content` WRITE;
/*!40000 ALTER TABLE `content` DISABLE KEYS */;
INSERT INTO `content` VALUES (1,1,'检查6000V接线盒内瓷瓶、端子；'),(2,1,'接线盒内卫生清洁；'),(3,1,'检查电缆引线、穿线管、接地线；'),(4,1,'检查进线口密封情况；'),(5,1,'检查前后轴承温度传感器的接线盒；'),(6,1,'检查定子绕组温度传感器的接线盒。'),(7,1,'检查防潮加热器的接线盒。'),(8,2,'接线盒开盖检查'),(9,2,'电机电缆头固定、磨损情况；'),(10,2,'电机接线柱螺栓紧固和电机线压紧检查；'),(11,2,'电机绝缘电阻测试（每千伏1兆欧以上）；'),(12,2,'电机接线盒的密封情况；'),(13,2,'电机接地线连接是否可靠；'),(14,2,'电机上是否有杂物，多要通知工艺处理。'),(15,3,'接线盒开盖检查'),(16,3,'电机电缆头固定、磨损情况；'),(17,3,'电机接线柱螺栓紧固和电机线压紧检查；'),(18,3,'电机绝缘电阻测试（每千伏1兆欧以上）；'),(19,3,'电机接线盒的密封情况；'),(20,3,'电机接地线连接是否可靠；'),(21,3,'电机上是否有杂物，多要通知工艺处理。'),(22,4,'检查温度传感器、加热器的完好情况。'),(23,4,'检查压力（冷却、润滑、系统、工作）传感器的完好情况。'),(24,4,'检查频率（速度）传感器的完好情况。'),(25,4,'检查电磁阀的好坏。'),(26,4,'检查线缆、穿线管的固定情况、线缆的磨损情况。'),(27,4,'清扫控制箱，紧固接线。'),(28,4,'检查按钮是否灵活工作可靠。'),(29,4,'检查CST触摸屏操作参数是否合理。'),(30,4,'检查CST控制箱内照明灯。'),(31,4,'检查CST控制箱电缆头、门的密封。'),(32,5,'PLC模块除尘保养；(注意吹风机外壳要接地）'),(33,5,'PLC机柜内线路整理；'),(34,5,'记录各模块工作是否正常，有无报警，有无强制；'),(35,5,'检查模块接线端子是否紧固；'),(36,5,'检查线路标号是否清晰规范；'),(37,5,'UPS工作是否正常；'),(38,5,'检查各模块指示灯工作是否正常；'),(39,5,'备份程序；'),(40,5,'机柜进风口过滤网除尘；'),(41,5,'检查机柜温度和散热风扇运转情况；'),(42,5,'PLC机柜门关闭要严。'),(43,6,'测量γ源泄露情况（月检）；'),(44,6,'检查接线紧固情况和电缆磨损情况；'),(45,6,'检查仪表、传感器的密封、固定情况；'),(46,6,'校对比重计准确度；'),(47,6,'检查γ源警示牌是否齐全；'),(48,6,'检查γ源防护栏是否完好；'),(49,6,'检查液位仪传感器周围漏液和磨损情况；'),(50,6,'校对液位仪准确度。'),(51,7,'除尘保养时，先断电五分钟后再开门进行，除尘前确认风机挂好接地线后再保养；'),(52,7,'变频器箱外的过滤网、柜顶除尘；（ABB一个月吹一次），'),(53,7,'变频器箱内除尘（开关进线柜，整流柜，电容柜）；'),(54,7,'变频器整流、逆变模块的除尘；'),(55,7,'变频器箱内接线紧固和整理；'),(56,7,'检查电缆头密封，电缆卡子固定情况；'),(57,7,'检查散热风机是否完好；'),(58,7,'检查变频器的锁电机构是否正常。'),(59,8,'检查电缆电缆头固定情况；'),(60,8,'检查各部位限位开关是否灵活；'),(61,8,'检查电机接线盒密封情况；'),(62,8,'检查各部位电磁阀有无松动情况，工作是否正常；'),(63,8,'控制柜内接线紧固、除尘、密封；'),(64,8,'检查启停按钮是否灵活，动作可靠；'),(65,8,'检查勺头或小车位置和位置开关是否正常；'),(66,8,'检查控制箱内空开、接触器、热继电器工作情况和触点是否良好；'),(67,8,'ATB120采样机要检查气泵的压力开关是否工作正常；'),(68,8,'ATB120气泵要放水。'),(69,9,'检查现场实际仓位和仪表显示是否一致；'),(70,9,'检查仪表显示与集控室显示是否一致；'),(71,9,'检查现场仪表密封情况，清扫卫生；'),(72,9,'检查探头固定情况；'),(73,9,'线路是否整齐规范有无破损现象；'),(74,9,'仪表探头清洁。'),(75,10,'除铁器控制箱内除尘；'),(76,10,'除铁器线路有无破裂，磨损；'),(77,10,'除铁器电缆卡滑线是否顺畅；'),(78,10,'除铁器限位开关是否灵活；'),(79,10,'控制箱内端子线紧固；'),(80,10,'除铁器箱体是否漏油和油位；'),(81,10,'除铁器磁力检查；'),(82,10,'除铁器控制箱和现场风扇运转情况检查；'),(83,10,'除铁器电动葫芦的移入、移出动作检查。'),(84,11,'清除加热器、暖风机表面煤泥。'),(85,11,'检查加热元件的完好情况。'),(86,11,'检查接线紧固情况和电缆磨损情况。'),(87,11,'检查加热器、暖风机及伴热电缆的工作情况。'),(88,11,'紧固伴热带电缆接线情况。'),(89,11,'检查伴热带电流情况。'),(90,12,'防冻液喷洒系统电磁阀密封、防腐检；'),(91,12,'防冻液喷洒系统泵和液压站电机接线、密封、防腐；'),(92,12,'防冻液喷洒系统现场开关检查、接线箱接线、密封、防腐；'),(93,12,'防冻液喷洒系统模块接线、电源检查；'),(94,12,'防冻液喷洒系统大臂移入、移出工作检查；'),(95,12,'防冻液喷洒系统小臂上、下工作检查；'),(96,12,'防冻液喷洒系统限位开关接线、密封、防腐检查；'),(97,12,'防冻液喷洒系统控制柜、电源柜保养；'),(98,12,'防冻液喷洒系统操作台开关、指示灯；'),(99,12,'防冻液喷洒系统电视监视系统检查。'),(100,13,'检查电缆（管路）固定情况；'),(101,13,'检查电机接线盒的密封情况；'),(102,13,'检查扭矩开关是否正常；'),(103,13,'检查提升电机电位器滑环有无磨损并清洗；'),(104,13,'检查启停按钮固定、工作情况；'),(105,13,'提升电机提耙时限位开关动作情况；'),(106,13,'检查设备标牌是否完整'),(107,14,'检查皮带秤称重传感器是否正常；（工作电压DC10V，空载8-15MV、有载28MV以下）如双传感器需分别拆开线加工作电压测返回电压要一样才可以，如不平衡需要调整并校秤。'),(108,14,'检查皮带秤速度传感器是否正常；'),(109,14,'清理皮带秤悬架上杂物；'),(110,14,'检查皮带秤称量托辊是否符合要求；（皮带秤前后三组托辊要运转正常；'),(111,14,'检查皮带秤悬架与皮带架的间隙（3mm以上）'),(112,14,'检查链码箱钢丝绳的磨损情况及各砝码之间的连接情况'),(113,14,'检查链码电源箱内各电器元件的工作情况'),(114,14,'链码电源箱内各电器元件端子紧固'),(115,15,'开盖检查拉线开关；跑偏开关和汇线箱（年检）'),(116,15,'减速机加热器、皮带走廊电加热器；（年检）'),(117,15,'跑偏杆、拉线开关复位到位（系统检）；'),(118,15,'堵溜槽开关（倾斜15度动作）；（系统检）；'),(119,15,'失速开关；（系统检）；'),(120,15,'启停按钮操作是否灵活可靠；（系统检）；'),(121,15,'起车电笛；（系统检）；'),(122,15,'压力传感器；（系统检）；'),(123,15,'温度传感器；（系统检）；'),(124,15,'高温传感器；（系统检）；'),(125,15,'执行机构；（系统检）；'),(126,15,'低油位传感器；（系统检）；'),(127,15,'检查CR继电器触头工作是否正常；（系统检）；'),(128,15,'照明装置是否正常。（系统检）；'),(129,16,'球磨机润滑系统检查'),(130,16,'球磨机风压系统检查'),(131,16,'球磨机启停按钮检查'),(132,16,'球磨机线路检查'),(133,16,'球磨机接线盒密封检查'),(134,16,'球磨机接线检查'),(135,16,'球磨机开关、保护检查'),(136,17,'除尘保养（注意人体、吹风机外壳要接地）；'),(137,17,'检查机箱外部是否接地良好；'),(138,17,'电源插座是否完整可用，电压输出是否正常；'),(139,17,'上位机输入输出设备是否完好可用；'),(140,17,'画面及系统备份；'),(141,17,'上位机风扇运转是否正常。'),(142,18,'箱变内清理灰尘、杂物；'),(143,18,'清楚瓷瓶上的污物、检查瓷瓶完好情况；'),(144,18,'检查机械合闸装置是够灵活可靠；'),(145,18,'检查各种互感器的完好情况；'),(146,18,'检查各种保护装置的设置及动作的可靠性；'),(147,18,'检查油位是否在允许范围内；'),(148,18,'检查箱体和瓷瓶是否漏油；'),(149,18,'检查进出电缆的电缆头是否有放电现象；'),(150,18,'测接地电阻是否小于4欧姆；'),(151,18,'检查过电压保护装置和放电计数器；'),(152,18,'检查隔离开关接触面和分断操作情况；'),(153,18,'测量断路器分断电阻。'),(154,19,'检查接线紧固情况和电缆磨损情况；'),(155,19,'检查液位仪传感器周围漏液和磨损情况；'),(156,19,'校对液位仪准确度。'),(157,20,'检查现场线路；'),(158,20,'检查进线口密封情况；'),(159,20,'检查现场控制执行机构是否正常；'),(160,20,'检查集控室控制执行机构是否和现场一致；'),(161,20,'检查按钮是否完好；'),(162,20,'检查限位开关是否正常；'),(163,20,'检查执行机构和闸板、阀门连接情况；'),(164,20,'检查闸板、阀门有无变形和发卡现象。'),(165,21,'检查定量仓和装车塔楼支架的间隙；'),(166,21,'检查定量仓四个承重传感器固定螺栓情况；'),(167,21,'检查定量仓四个承重传感器支撑点情况；'),(168,21,'检查定量仓四个承重传感器有无变形情况；'),(169,21,'检查挂码落地有无吃劲和平稳情况；'),(170,21,'校秤时检查挂码有无全部挂起和落地情况；'),(171,21,'记录零点间隔值和10吨的间隔值；'),(172,22,'卸料闸板的位置开关固定情况；'),(173,22,'卸料闸板的位置开关工作情况；'),(174,22,'卸料闸板的位置开关接线、接线盒密封、穿线管固定检查；');
/*!40000 ALTER TABLE `content` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `device`
--

DROP TABLE IF EXISTS `device`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `device` (
  `Did` int(11) NOT NULL AUTO_INCREMENT,
  `Tid` int(11) NOT NULL,
  PRIMARY KEY (`Did`)
) ENGINE=InnoDB AUTO_INCREMENT=457 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `device`
--

LOCK TABLES `device` WRITE;
/*!40000 ALTER TABLE `device` DISABLE KEYS */;
INSERT INTO `device` VALUES (123,1),(456,2);
/*!40000 ALTER TABLE `device` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `expend`
--

DROP TABLE IF EXISTS `expend`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `expend` (
  `Eid` int(11) NOT NULL AUTO_INCREMENT,
  `Iid` int(11) NOT NULL,
  `Material` varchar(100) DEFAULT NULL,
  `Count` int(11) DEFAULT NULL,
  PRIMARY KEY (`Eid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `expend`
--

LOCK TABLES `expend` WRITE;
/*!40000 ALTER TABLE `expend` DISABLE KEYS */;
INSERT INTO `expend` VALUES (1,1,'黄油',2),(2,3,'螺丝',5),(3,9,'榔头',2),(4,11,'毛铁',10);
/*!40000 ALTER TABLE `expend` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item` (
  `Iid` int(11) NOT NULL AUTO_INCREMENT,
  `Did` int(11) NOT NULL,
  `Tid` int(11) NOT NULL,
  `Cid` int(11) NOT NULL,
  `Pid` int(11) NOT NULL,
  `Date` date NOT NULL,
  `Condition` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Iid`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
INSERT INTO `item` VALUES (1,123,1,1,111,'2015-11-20','修理完成'),(2,123,1,2,111,'2015-11-20','正常'),(3,123,1,3,111,'2015-11-20','修理完成'),(4,123,1,4,111,'2015-11-20','正常'),(5,123,1,5,111,'2015-11-20','正常'),(6,123,1,6,111,'2015-11-20','正常'),(7,123,1,7,111,'2015-11-20','正常'),(8,456,2,8,111,'2015-10-11','正常'),(9,456,2,9,111,'2015-10-11','修理完成'),(10,456,2,10,111,'2015-10-11','正常'),(11,456,2,11,111,'2015-10-11','修理完成'),(12,456,2,12,111,'2015-10-11','正常'),(13,456,2,13,111,'2015-10-11','正常'),(14,456,2,14,111,'2015-10-11','正常');
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `person`
--

DROP TABLE IF EXISTS `person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `person` (
  `Pid` int(11) NOT NULL AUTO_INCREMENT,
  `Pname` varchar(100) NOT NULL,
  PRIMARY KEY (`Pid`)
) ENGINE=InnoDB AUTO_INCREMENT=112 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` VALUES (111,'lee');
/*!40000 ALTER TABLE `person` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `type`
--

DROP TABLE IF EXISTS `type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `type` (
  `Tid` int(11) NOT NULL AUTO_INCREMENT,
  `Tname` varchar(100) NOT NULL,
  `Time` varchar(100) NOT NULL,
  `Substance` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Tid`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `type`
--

LOCK TABLES `type` WRITE;
/*!40000 ALTER TABLE `type` DISABLE KEYS */;
INSERT INTO `type` VALUES (1,'6000V及以上电机','年检',NULL),(2,'6000V以下不带振动电机','年检',NULL),(3,'6000V以下带振动电机','半年检',NULL),(4,'CST','月检',NULL),(5,'PLC','月检',NULL),(6,'比重计、液位仪','月检',NULL),(7,'变频器（100KW以上皮带、泵电机驱动的）','双月检','（ATB101、201 、202月检）'),(8,'采样机','月检',NULL),(9,'仓位传感器','月检',NULL),(10,'除铁器','月检','(ATB坑下定周检)'),(11,'防冻设施','月检',NULL),(12,'装车站防冻液喷洒系统','周检','（11月20日至明年4月1日）'),(13,'浓缩机','半年检',NULL),(14,'皮带秤','月检',NULL),(15,'皮带运输机','年检',NULL),(16,'球磨机','年检',NULL),(17,'上位机','月检',NULL),(18,'箱变','半年检',NULL),(19,'角执行机构、直执行机构','月检',NULL),(20,'装车定量秤','周检',NULL),(21,'装车站卸料闸板','周检',NULL);
/*!40000 ALTER TABLE `type` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-10-16 15:17:25
