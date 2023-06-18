-- MariaDB dump 10.19  Distrib 10.4.24-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: tabunganmahasiswa
-- ------------------------------------------------------
-- Server version	10.4.24-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `mahasiswa`
--

DROP TABLE IF EXISTS `mahasiswa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mahasiswa` (
  `nim` varchar(50) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `jenis_kelamin` varchar(100) NOT NULL,
  `jurusan` varchar(100) NOT NULL,
  `tsaldo` int(100) NOT NULL,
  `status` varchar(100) NOT NULL,
  PRIMARY KEY (`nim`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mahasiswa`
--

LOCK TABLES `mahasiswa` WRITE;
/*!40000 ALTER TABLE `mahasiswa` DISABLE KEYS */;
INSERT INTO `mahasiswa` VALUES ('1001','Rid','Laki-laki','Teknik Informatika',67000,'Aktif'),('1002','fany','Perempuan','Farmasi',4001,'Aktif'),('1003','loki','Laki-laki','Teknik Elektro',25000,'Aktif'),('1004','fereya','Perempuan','PGSD',11000,'Aktif'),('1005','ridoo','Laki-laki','Sistem Informasi',12500,'Aktif'),('1006','seele','Perempuan','Sistem Informasi',0,'Aktif'),('1007','cloe','Perempuan','PGSD',0,'Aktif'),('1008','wolf','Laki-laki','Teknik Informatika',1500,'Aktif'),('1009','arik','Laki-laki','Teknik Informatika',0,'Aktif'),('1010','ibnu a','Laki-laki','Teknik Informatika',0,'Aktif');
/*!40000 ALTER TABLE `mahasiswa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_setor`
--

DROP TABLE IF EXISTS `t_setor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_setor` (
  `id_setor` varchar(100) NOT NULL,
  `nim` varchar(100) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `tanggal` varchar(100) NOT NULL,
  `dsaldo` int(100) NOT NULL,
  PRIMARY KEY (`id_setor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_setor`
--

LOCK TABLES `t_setor` WRITE;
/*!40000 ALTER TABLE `t_setor` DISABLE KEYS */;
INSERT INTO `t_setor` VALUES ('','1001','Rid','2023-05-20',1000),('DT001','1001','Rid','2023-05-20',1000),('DT002','1001','Rid','2023-05-20',2000),('DT003','','','2023-05-20',1002),('DT004','1001','Rid','2023-05-20',4000),('DT005','1002','','2023-05-20',1000),('DT006','12345','','2023-05-20',1),('DT007','1002','fany','2023-05-20',1000),('DT008','1002','','2023-05-20',1),('DT009','1003','loki','2023-05-20',1000),('DT010','1003','loki','2023-05-26',500),('DT011','1003','loki','2023-05-26',1200),('DT012','1004','fereya','2023-05-31',10000),('DT013','1001','Rid','2023-06-01',2000),('DT014','1003','loki','2023-06-01',10000),('DT015','1003','loki','2023-06-01',1000),('DT016','1003','loki','2023-06-01',500),('DT017','1004','fereya','2023-06-04',1000),('DT018','1003','loki','2023-06-04',2000),('DT019','1005','ridoo','2023-06-07',15000),('DT020','1008','wolf','2023-06-07',1000),('DT021','1008','wolf','2023-06-07',500),('DT022','1001','Rid','2023-06-15',5000);
/*!40000 ALTER TABLE `t_setor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_tarik`
--

DROP TABLE IF EXISTS `t_tarik`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_tarik` (
  `id_tarik` varchar(100) NOT NULL,
  `nim` varchar(100) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `tanggal` varchar(100) NOT NULL,
  `wsaldo` int(100) NOT NULL,
  PRIMARY KEY (`id_tarik`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_tarik`
--

LOCK TABLES `t_tarik` WRITE;
/*!40000 ALTER TABLE `t_tarik` DISABLE KEYS */;
INSERT INTO `t_tarik` VALUES ('WT001','1003','loki','2023-05-26',200),('WT002','1003','loki','2023-05-26',500),('WT003','1001','Rid','2023-06-01',2000),('WT004','1003','loki','2023-06-01',500),('WT005','1003','loki','2023-06-01',1000),('WT006','1005','ridoo','2023-06-07',2500),('WT007','1001','Rid','2023-06-15',5000);
/*!40000 ALTER TABLE `t_tarik` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `username` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('1','1','1'),('admin','admin','admin'),('ridhwan','ridhwan','1'),('ridwan','ridwan','1');
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

-- Dump completed on 2023-06-18 13:19:10
