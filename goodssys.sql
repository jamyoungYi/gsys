/*
Navicat MySQL Data Transfer

Source Server         : aaa
Source Server Version : 50556
Source Host           : localhost:3306
Source Database       : goodssys

Target Server Type    : MYSQL
Target Server Version : 50556
File Encoding         : 65001

Date: 2022-06-16 16:47:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `customer`
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `c_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `contacts` varchar(20) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `address` varchar(50) NOT NULL,
  `remarks` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('6', '一年级小朋友', '1', '1', '翻斗小学', '');
INSERT INTO `customer` VALUES ('7', '二年级小朋友', '1', '1', '翻斗小学', '');
INSERT INTO `customer` VALUES ('8', '三年级小朋友', '1', '1', '翻斗小学', '');
INSERT INTO `customer` VALUES ('9', '四年级小朋友', '1', '1', '翻斗小学', '');

-- ----------------------------
-- Table structure for `customerorder`
-- ----------------------------
DROP TABLE IF EXISTS `customerorder`;
CREATE TABLE `customerorder` (
  `co_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_id` int(11) NOT NULL,
  `g_id` int(11) NOT NULL,
  `type` varchar(50) NOT NULL,
  `count` int(30) NOT NULL,
  `createTime` date NOT NULL,
  `remarks` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`co_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customerorder
-- ----------------------------
INSERT INTO `customerorder` VALUES ('2', '8', '5', '销售出库', '50', '2022-06-15', '');
INSERT INTO `customerorder` VALUES ('3', '8', '6', '销售出库', '50', '2022-06-03', '');
INSERT INTO `customerorder` VALUES ('4', '7', '5', '销售出库', '500', '2022-06-15', '');
INSERT INTO `customerorder` VALUES ('6', '8', '6', '客户退货', '50', '2022-06-15', null);
INSERT INTO `customerorder` VALUES ('7', '9', '5', '销售出库', '500', '2022-05-16', '');
INSERT INTO `customerorder` VALUES ('8', '7', '5', '销售出库', '500', '2022-05-11', '');
INSERT INTO `customerorder` VALUES ('9', '9', '5', '客户退货', '50', '2022-05-19', null);

-- ----------------------------
-- Table structure for `goods`
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `type` varchar(50) NOT NULL,
  `count` int(11) NOT NULL,
  `buyprice` double NOT NULL,
  `price` double NOT NULL,
  `manufacturer` varchar(300) NOT NULL,
  `lbid` int(11) NOT NULL,
  `pic` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `lbid` (`lbid`),
  CONSTRAINT `goods_ibfk_1` FOREIGN KEY (`lbid`) REFERENCES `goodstype` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('5', '可乐', '饮料', '500', '2.5', '3', '可口可乐公司', '1', 'images/1655361671347.jpg');
INSERT INTO `goods` VALUES ('6', '薯片', '乐事', '100', '3', '4', '乐事', '1', 'images/1655261901323.jpg');
INSERT INTO `goods` VALUES ('7', '辣条', '辣条', '50', '2', '3', '卫龙', '1', null);
INSERT INTO `goods` VALUES ('8', '农夫山泉', '饮料', '500', '1.5', '2', '农夫山泉', '1', 'images/1655365540724.jpg');

-- ----------------------------
-- Table structure for `goodstype`
-- ----------------------------
DROP TABLE IF EXISTS `goodstype`;
CREATE TABLE `goodstype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goodstype
-- ----------------------------
INSERT INTO `goodstype` VALUES ('1', '1');
INSERT INTO `goodstype` VALUES ('2', '2');
INSERT INTO `goodstype` VALUES ('3', '3');
INSERT INTO `goodstype` VALUES ('4', '4');
INSERT INTO `goodstype` VALUES ('5', '饮料');

-- ----------------------------
-- Table structure for `supplier`
-- ----------------------------
DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier` (
  `s_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `contacts` varchar(30) NOT NULL,
  `phone` varchar(30) NOT NULL,
  `address` varchar(30) NOT NULL,
  `remarks` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of supplier
-- ----------------------------
INSERT INTO `supplier` VALUES ('1', '百事可乐', '1', '111', '南宁', '1');
INSERT INTO `supplier` VALUES ('5', '农夫山泉', '1', '1111', '四川', '');
INSERT INTO `supplier` VALUES ('6', '乐事', '9', '999', '杭州', '');
INSERT INTO `supplier` VALUES ('7', '卫龙', '8', '888', '天津', '');

-- ----------------------------
-- Table structure for `supplierorder`
-- ----------------------------
DROP TABLE IF EXISTS `supplierorder`;
CREATE TABLE `supplierorder` (
  `so_id` int(11) NOT NULL AUTO_INCREMENT,
  `s_id` int(11) NOT NULL,
  `g_id` int(11) NOT NULL,
  `type` varchar(30) NOT NULL,
  `count` int(30) NOT NULL,
  `createTime` date NOT NULL,
  `remarks` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`so_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of supplierorder
-- ----------------------------
INSERT INTO `supplierorder` VALUES ('4', '2', '1', '进货入库', '1', '2022-06-15', '1');
INSERT INTO `supplierorder` VALUES ('5', '1', '5', '进货入库', '50', '2022-06-15', '');
INSERT INTO `supplierorder` VALUES ('6', '1', '5', '进货入库', '50', '2022-06-15', '');
INSERT INTO `supplierorder` VALUES ('7', '1', '5', '退货出库', '50', '2022-06-15', '');
INSERT INTO `supplierorder` VALUES ('8', '1', '5', '进货入库', '100', '2022-05-16', '');
INSERT INTO `supplierorder` VALUES ('9', '1', '5', '退货出库', '100', '2022-05-16', '');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `pic` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '123', '123', null);
