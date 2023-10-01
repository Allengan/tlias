-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: tilas
-- ------------------------------------------------------
-- Server version	8.0.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT = @@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS = @@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION = @@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE = @@TIME_ZONE */;
/*!40103 SET TIME_ZONE = '+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS = @@UNIQUE_CHECKS, UNIQUE_CHECKS = 0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS = @@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS = 0 */;
/*!40101 SET @OLD_SQL_MODE = @@SQL_MODE, SQL_MODE = 'NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES = @@SQL_NOTES, SQL_NOTES = 0 */;

--
-- Table structure for table `clazz`
--

DROP TABLE IF EXISTS `clazz`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clazz`
(
    `id`          int unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID,主键',
    `name`        varchar(30)  NOT NULL COMMENT '班级名称',
    `room`        varchar(20) DEFAULT NULL COMMENT '班级教室',
    `begin`       date         NOT NULL COMMENT '开课时间',
    `end`         date         NOT NULL COMMENT '结课时间',
    `create_time` datetime     NOT NULL COMMENT '创建时间',
    `update_time` datetime     NOT NULL COMMENT '修改时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `name` (`name`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 18
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='班级表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clazz`
--

LOCK TABLES `clazz` WRITE;
/*!40000 ALTER TABLE `clazz`
    DISABLE KEYS */;
INSERT INTO `clazz`
VALUES (1, '成都校区JavaEE01期', '101', '2022-01-01', '2022-06-30', '2023-09-19 08:39:40', '2023-09-19 08:39:40'),
       (2, '成都校区JavaEE02期', '102', '2022-02-01', '2022-07-30', '2023-09-19 08:39:40', '2023-09-19 08:39:40'),
       (3, '成都校区JavaEE03期', '103', '2022-03-01', '2022-08-30', '2023-09-19 08:39:40', '2023-09-19 08:39:40'),
       (4, '成都校区JavaEE04期', '104', '2022-03-01', '2022-09-30', '2023-09-19 08:39:40', '2023-09-19 08:39:40'),
       (6, '成都校区JavaEE06期', '202', '2022-05-01', '2022-11-30', '2023-09-19 08:39:40', '2023-09-19 08:39:40'),
       (7, '成都校区JavaEE07期', '203', '2022-06-01', '2022-12-30', '2023-09-19 08:39:40', '2023-09-19 08:39:40'),
       (8, '昌平校区JavaEE01期', '401', '2022-01-01', '2022-06-30', '2023-09-19 08:39:40', '2023-09-19 08:39:40'),
       (9, '昌平校区JavaEE02期', '402', '2022-01-15', '2022-07-15', '2023-09-19 08:39:40', '2023-09-19 08:39:40'),
       (10, '昌平校区JavaEE03期', '403', '2022-02-01', '2022-07-30', '2023-09-19 08:39:40', '2023-09-19 08:39:40'),
       (11, '昌平校区JavaEE04期', '404', '2022-02-15', '2022-08-15', '2023-09-19 08:39:40', '2023-09-19 08:39:40'),
       (12, '昌平校区JavaEE05期', '405', '2022-03-01', '2022-09-01', '2023-09-19 08:39:40', '2023-09-19 08:39:40'),
       (13, '昌平校区JavaEE06期', '406', '2022-03-15', '2022-09-15', '2023-09-19 08:39:40', '2023-09-19 08:39:40'),
       (14, '昌平校区JavaEE07期', '407', '2022-04-01', '2022-10-01', '2023-09-19 08:39:40', '2023-09-19 08:39:40'),
       (17, '西安校区JavaEE01期', '202', '2023-03-01', '2022-08-01', '2023-09-19 10:13:27', '2023-09-19 10:13:27');
/*!40000 ALTER TABLE `clazz`
    ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dept`
--

DROP TABLE IF EXISTS `dept`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dept`
(
    `id`          int unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `name`        varchar(10)  NOT NULL COMMENT '部门名称',
    `create_time` datetime     NOT NULL COMMENT '创建时间',
    `update_time` datetime     NOT NULL COMMENT '修改时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `name` (`name`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 23
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='部门表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dept`
--

LOCK TABLES `dept` WRITE;
/*!40000 ALTER TABLE `dept`
    DISABLE KEYS */;
INSERT INTO `dept`
VALUES (1, '咨询部', '2023-09-26 22:41:44', '2023-09-24 23:09:39'),
       (6, '人事部', '2023-09-17 23:55:16', '2023-09-17 23:55:16'),
       (15, '保卫科', '2023-09-23 20:50:54', '2023-09-23 21:32:16'),
       (17, '研究院', '2023-09-24 23:09:27', '2023-09-24 23:09:27'),
       (18, '销售部', '2023-09-24 23:09:39', '2023-09-24 23:09:39'),
       (22, '运维部', '2023-09-30 17:59:06', '2023-09-30 17:59:06');
/*!40000 ALTER TABLE `dept`
    ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dept_log`
--

DROP TABLE IF EXISTS `dept_log`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dept_log`
(
    `id`          int NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `create_time` datetime     DEFAULT NULL COMMENT '操作时间',
    `description` varchar(300) DEFAULT NULL COMMENT '操作描述',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 3
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='部门操作日志表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dept_log`
--

LOCK TABLES `dept_log` WRITE;
/*!40000 ALTER TABLE `dept_log`
    DISABLE KEYS */;
INSERT INTO `dept_log`
VALUES (1, '2023-09-21 12:24:11', '执行了解散部门的操作，此时解散的是13号部门'),
       (2, '2023-09-21 12:29:01', '执行了解散部门的操作，此时解散的是13号部门');
/*!40000 ALTER TABLE `dept_log`
    ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emp`
--

DROP TABLE IF EXISTS `emp`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `emp`
(
    `id`          int unsigned     NOT NULL AUTO_INCREMENT COMMENT 'ID',
    `username`    varchar(20)      NOT NULL COMMENT '用户名',
    `password`    varchar(32)      DEFAULT '123456' COMMENT '密码',
    `name`        varchar(10)      NOT NULL COMMENT '姓名',
    `gender`      tinyint unsigned NOT NULL COMMENT '性别, 说明: 1 男, 2 女',
    `image`       varchar(300)     DEFAULT NULL COMMENT '图像',
    `job`         tinyint unsigned DEFAULT NULL COMMENT '职位, 说明: 1 班主任,2 讲师, 3 学工主管, 4 教研主管, 5 咨询师',
    `entrydate`   date             DEFAULT NULL COMMENT '入职时间',
    `dept_id`     int unsigned     DEFAULT NULL COMMENT '部门ID',
    `create_time` datetime         NOT NULL COMMENT '创建时间',
    `update_time` datetime         NOT NULL COMMENT '修改时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `username` (`username`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 31
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='员工表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emp`
--

LOCK TABLES `emp` WRITE;
/*!40000 ALTER TABLE `emp`
    DISABLE KEYS */;
INSERT INTO `emp`
VALUES (5, 'changyuchun', '123456', '常遇春', 1, '5.jpg', 2, '2012-12-05', 2, '2023-09-17 12:17:46',
        '2023-09-17 12:17:46'),
       (7, 'jixiaofu', '123456', '纪晓芙', 2, '7.jpg', 1, '2005-08-01', 1, '2023-09-17 12:17:46',
        '2023-09-17 12:17:46'),
       (8, 'zhouzhiruo', '123456', '周芷若', 2, '8.jpg', 1, '2014-11-09', 1, '2023-09-17 12:17:46',
        '2023-09-17 12:17:46'),
       (9, 'dingminjun', '123456', '丁敏君', 2, '9.jpg', 1, '2011-03-11', 1, '2023-09-17 12:17:46',
        '2023-09-17 12:17:46'),
       (10, 'zhaomin', '123456', '赵敏', 2, '10.jpg', 1, '2013-09-05', 1, '2023-09-17 12:17:46', '2023-09-17 12:17:46'),
       (11, 'luzhangke', '123456', '鹿杖客', 1, '11.jpg', 5, '2007-02-01', 3, '2023-09-17 12:17:46',
        '2023-09-17 12:17:46'),
       (12, 'hebiweng', '123456', '鹤笔翁', 1, '12.jpg', 5, '2008-08-18', 3, '2023-09-17 12:17:46',
        '2023-09-17 12:17:46'),
       (13, 'fangdongbai', '123456', '方东白', 1, '13.jpg', 5, '2012-11-01', 3, '2023-09-17 12:17:46',
        '2023-09-17 12:17:46'),
       (14, 'zhangsanfeng', '123456', '张三丰', 1, '14.jpg', 2, '2002-08-01', 2, '2023-09-17 12:17:46',
        '2023-09-17 12:17:46'),
       (15, 'yulianzhou', '123456', '俞莲舟', 1, '15.jpg', 2, '2011-05-01', 2, '2023-09-17 12:17:46',
        '2023-09-17 12:17:46'),
       (16, 'songyuanqiao', '123456', '宋远桥', 1, '16.jpg', 2, '2007-01-01', 2, '2023-09-17 12:17:46',
        '2023-09-17 12:17:46'),
       (17, 'chenyouliang', '123456', '陈友谅', 1, '17.jpg', NULL, '2015-03-21', NULL, '2023-09-17 12:17:46',
        '2023-09-17 12:17:46'),
       (25, 'Allen', '123456', 'Allen', 1,
        'https://xa-106-web-case.oss-cn-chengdu.aliyuncs.com/20544200-8835-467b-b455-8cc6cbf27d56.jpg', 1, '2023-09-16',
        7, '2023-09-18 17:43:27', '2023-09-18 17:43:27'),
       (26, 'admin', 'adminadmin', 'admin', 1,
        'https://xa-106-web-case.oss-cn-chengdu.aliyuncs.com/7c9e6092-387b-4c8d-bc1e-82764054a76e.jpg', 4, '2023-09-18',
        2, '2023-09-19 15:02:38', '2023-09-19 15:02:38'),
       (27, 'jinyong', '123456', '金庸', 1,
        'https://xa-106-web-case.oss-cn-chengdu.aliyuncs.com/3ae6a82f-1356-4d54-ab20-e984b2d41c41.jpg', 4, '2023-09-19',
        7, '2023-09-20 16:43:32', '2023-09-20 16:43:32'),
       (29, 'zhaoyun', '123456', '赵四', 1,
        'https://xa-106-web-case.oss-cn-chengdu.aliyuncs.com/29cf9875-8e12-496a-985f-de80eb5952f9.jpg', 1, '2023-09-10',
        18, '2023-09-25 20:55:18', '2023-09-25 20:55:18');
/*!40000 ALTER TABLE `emp`
    ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operate_log`
--

DROP TABLE IF EXISTS `operate_log`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `operate_log`
(
    `id`            int unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID',
    `operate_user`  int unsigned  DEFAULT NULL COMMENT '操作人',
    `operate_time`  datetime      DEFAULT NULL COMMENT '操作时间',
    `class_name`    varchar(100)  DEFAULT NULL COMMENT '操作的类名',
    `method_name`   varchar(100)  DEFAULT NULL COMMENT '操作的方法名',
    `method_params` varchar(1000) DEFAULT NULL COMMENT '方法参数',
    `return_value`  varchar(2000) DEFAULT NULL COMMENT '返回值',
    `cost_time`     bigint        DEFAULT NULL COMMENT '方法执行耗时, 单位:ms',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 8
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='操作日志表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operate_log`
--

LOCK TABLES `operate_log` WRITE;
/*!40000 ALTER TABLE `operate_log`
    DISABLE KEYS */;
INSERT INTO `operate_log`
VALUES (1, 1, '2023-09-21 20:02:57', 'com.itcast.service.impl.DeptService', 'deleteById', '[1]', 'null', 202),
       (2, 1, '2023-09-21 20:04:02', 'com.itcast.service.impl.DeptService', 'insertDept',
        '[Dept(id=null, name=保卫科, createTime=null, updateTime=null)]', 'null', 12),
       (3, 1, '2023-09-21 20:04:15', 'com.itcast.service.impl.EmpService', 'deleteEmp',
        '[[Ljava.lang.Integer;@2b1abd37]', 'null', 10),
       (4, 1, '2023-09-21 20:04:21', 'com.itcast.service.impl.EmpService', 'selectById', '[20]',
        '{\"createTime\":1695010406000,\"deptId\":1,\"entrydate\":1663430400000,\"gender\":1,\"id\":20,\"image\":\"https://web-framework.oss-cn-hangzhou.aliyuncs.com/2022-09-03-07-37-38222.jpg\",\"job\":1,\"name\":\"张大狗\",\"password\":\"123456\",\"updateTime\":1695010406000,\"username\":\"zhangdagou\"}',
        46),
       (5, 1, '2023-09-21 20:04:37', 'com.itcast.service.impl.EmpService', 'updateEmp',
        '[Emp(id=20, username=zhangdagou, password=123456, name=张狗蛋, gender=1, image=https://web-framework.oss-cn-hangzhou.aliyuncs.com/2022-09-03-07-37-38222.jpg, job=1, entrydate=2022-09-18, deptId=1, createTime=2023-09-18T12:13:26, updateTime=2023-09-18T12:13:26)]',
        'null', 20),
       (6, 27, '2023-09-30 17:59:06', 'com.itcast.controller.DeptController', 'insertDept',
        '[Dept(id=null, name=运维部, createTime=null, updateTime=null)]', 'Result(code=1, msg=success, data=null)', 36),
       (7, 27, '2023-09-30 17:59:44', 'com.itcast.controller.EmpController', 'deleteEmpByIds',
        '[[Ljava.lang.Integer;@3bbc2deb]', 'Result(code=1, msg=success, data=null)', 14);
/*!40000 ALTER TABLE `operate_log`
    ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student`
(
    `id`              int unsigned     NOT NULL AUTO_INCREMENT COMMENT 'ID,主键',
    `name`            varchar(10)      NOT NULL COMMENT '姓名',
    `no`              char(10)         NOT NULL COMMENT '学号',
    `gender`          tinyint unsigned NOT NULL COMMENT '性别, 1: 男, 2: 女',
    `phone`           varchar(11)      NOT NULL COMMENT '手机号',
    `degree`          tinyint unsigned          DEFAULT NULL COMMENT '最高学历, 1:初中, 2:高中, 3:大专, 4:本科, 5:硕士, 6:博士',
    `violation_count` tinyint unsigned NOT NULL DEFAULT '0' COMMENT '违纪次数',
    `violation_score` tinyint unsigned NOT NULL DEFAULT '0' COMMENT '违纪扣分',
    `class_id`        int unsigned     NOT NULL COMMENT '班级ID, 关联班级表ID',
    `create_time`     datetime         NOT NULL COMMENT '创建时间',
    `update_time`     datetime         NOT NULL COMMENT '修改时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `no` (`no`),
    UNIQUE KEY `phone` (`phone`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 19
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='学员表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student`
    DISABLE KEYS */;
INSERT INTO `student`
VALUES (3, '虚竹', '2022000003', 1, '18800013001', 2, 0, 0, 1, '2023-09-18 18:02:19', '2023-09-18 18:02:19'),
       (4, '段誉', '2022000004', 1, '18009091215', 4, 1, 10, 2, '2023-09-18 18:02:19', '2023-09-18 18:02:19'),
       (5, '阿朱', '2022000005', 2, '18800160002', 4, 0, 0, 1, '2023-09-18 18:02:19', '2023-09-18 18:02:19'),
       (6, '阿紫', '2022000006', 2, '18800000034', 4, 0, 0, 2, '2023-09-18 18:02:19', '2023-09-18 18:02:19'),
       (7, '游坦之', '2022000007', 1, '18800000067', 4, 0, 0, 2, '2023-09-18 18:02:19', '2023-09-18 18:02:19'),
       (8, '康敏', '2022000008', 2, '18800000077', 5, 0, 0, 2, '2023-09-18 18:02:19', '2023-09-18 18:02:19'),
       (9, '徐长老', '2022000009', 1, '18800000341', 3, 0, 0, 2, '2023-09-18 18:02:19', '2023-09-18 18:02:19'),
       (10, '云中鹤', '2022000010', 1, '18800006571', 2, 0, 0, 2, '2023-09-18 18:02:19', '2023-09-18 18:02:19'),
       (11, '钟万仇', '2022000011', 1, '18800000391', 4, 0, 0, 3, '2023-09-18 18:02:19', '2023-09-18 18:02:19'),
       (12, '崔百泉', '2022000012', 1, '18800000781', 4, 0, 0, 3, '2023-09-18 18:02:19', '2023-09-18 18:02:19'),
       (13, '耶律洪基', '2022000013', 1, '18800008901', 4, 0, 0, 3, '2023-09-18 18:02:19', '2023-09-18 18:02:19'),
       (14, '天山童姥', '2022000014', 2, '18800009201', 4, 0, 0, 3, '2023-09-18 18:02:19', '2023-09-18 18:02:19'),
       (15, '刘竹庄', '2022000015', 1, '18800009401', 3, 0, 0, 4, '2023-09-18 18:02:19', '2023-09-18 18:02:19'),
       (16, '李春来', '2022000016', 1, '18800008501', 4, 0, 0, 4, '2023-09-18 18:02:19', '2023-09-18 18:02:19'),
       (17, '王语嫣', '2022000017', 2, '18800007601', 2, 0, 0, 4, '2023-09-18 18:02:19', '2023-09-18 18:02:19'),
       (18, '段誉', '2023000005', 1, '18009091212', 4, 0, 0, 2, '2023-09-18 23:44:18', '2023-09-18 23:44:18');
/*!40000 ALTER TABLE `student`
    ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_class`
--

DROP TABLE IF EXISTS `tb_class`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_class`
(
    `id`               tinyint     NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `class_name`       varchar(30) NOT NULL COMMENT '班级名称',
    `class_room`       varchar(20) DEFAULT NULL COMMENT '班级教室',
    `class_start_time` date        NOT NULL COMMENT '开课时间',
    `class_end_time`   date        NOT NULL COMMENT '结课时间',
    `create_time`      datetime    DEFAULT NULL COMMENT '创建时间',
    `update_time`      datetime    DEFAULT NULL COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `tb_class_pk2` (`class_name`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 10
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='班级表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_class`
--

LOCK TABLES `tb_class` WRITE;
/*!40000 ALTER TABLE `tb_class`
    DISABLE KEYS */;
INSERT INTO `tb_class`
VALUES (2, '上海黑马JavaEE就业258期', '1204', '2022-05-05', '2023-12-31', '2023-09-10 23:18:40', '2023-09-10 23:18:40'),
       (4, '西安黑马JavaEE就业101期', '308', '2022-08-01', '2023-12-31', '2023-09-10 23:19:08', '2023-09-10 23:19:08'),
       (5, '西安黑马JavaEE就业102期', '308', '2022-08-01', '2023-12-31', '2023-09-10 23:19:17', '2023-09-10 23:19:17'),
       (6, '西安黑马JavaEE就业118期', '10086', '2022-09-01', '2023-12-31', '2023-09-11 09:21:19',
        '2023-09-11 09:21:19'),
       (7, '西安黑马JavaEE就业120期', '103', '2022-02-01', '2023-12-31', '2023-09-11 09:21:19', '2023-09-11 09:21:19'),
       (8, '西安黑马JavaEE就业110期', '165', '2022-01-01', '2023-12-31', '2023-09-11 09:21:19', '2023-09-11 09:21:19'),
       (9, '西安黑马JavaEE就业99期', '125', '2022-03-01', '2023-12-31', '2023-09-11 09:21:19', '2023-09-11 09:21:19');
/*!40000 ALTER TABLE `tb_class`
    ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE = @OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE = @OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS = @OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS = @OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT = @OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS = @OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION = @OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES = @OLD_SQL_NOTES */;

-- Dump completed on 2023-09-30 20:34:14
