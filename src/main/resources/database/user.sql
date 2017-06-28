/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50712
Source Host           : localhost:3306
Source Database       : timetable

Target Server Type    : MYSQL
Target Server Version : 50712
File Encoding         : 65001

Date: 2017-06-28 22:18:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_account` varchar(255) DEFAULT NULL,
  `u_password` varchar(255) DEFAULT NULL,
  `u_create_time` char(19) DEFAULT NULL,
  `u_available` smallint(1) DEFAULT NULL,
  `role` char(20) DEFAULT NULL,
  `u_type_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'chly', '769c483f53d222d325d86ed05f1511a1', '2017-06-28 22:14:13', '1', 'admin', '1');
