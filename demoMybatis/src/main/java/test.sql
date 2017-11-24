/*
Navicat MySQL Data Transfer

Source Server         : 本地测试
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-11-24 16:34:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for country
-- ----------------------------
DROP TABLE IF EXISTS `country`;
CREATE TABLE `country` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `countryname` varchar(50) NOT NULL,
  `countrycode` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of country
-- ----------------------------
INSERT INTO `country` VALUES ('1', '中国', 'China');
INSERT INTO `country` VALUES ('2', '美国', 'America');
INSERT INTO `country` VALUES ('3', '俄罗斯', 'Russia');
INSERT INTO `country` VALUES ('4', '英国', 'England');
INSERT INTO `country` VALUES ('5', '法国', 'Franch');

-- ----------------------------
-- Table structure for sys_privilege
-- ----------------------------
DROP TABLE IF EXISTS `sys_privilege`;
CREATE TABLE `sys_privilege` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `privilege_name` varchar(50) NOT NULL,
  `privilege_url` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_privilege
-- ----------------------------
INSERT INTO `sys_privilege` VALUES ('1', '用户管理', '/users');
INSERT INTO `sys_privilege` VALUES ('2', '角色管理', '/roles');
INSERT INTO `sys_privilege` VALUES ('3', '系统日志', '/logs');
INSERT INTO `sys_privilege` VALUES ('4', '人员维护', '/persons');
INSERT INTO `sys_privilege` VALUES ('5', '单位维护', '/compaines');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(50) NOT NULL,
  `is_delete` tinyint(1) NOT NULL DEFAULT '0',
  `create_by` bigint(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', '管理员', '0', '1', '2017-11-24 15:30:27');
INSERT INTO `sys_role` VALUES ('2', '普通用户', '0', '1', '2017-11-24 15:31:28');

-- ----------------------------
-- Table structure for sys_role_privilege
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_privilege`;
CREATE TABLE `sys_role_privilege` (
  `role_id` int(11) NOT NULL,
  `privilege_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_privilege
-- ----------------------------
INSERT INTO `sys_role_privilege` VALUES ('1', '1');
INSERT INTO `sys_role_privilege` VALUES ('1', '2');
INSERT INTO `sys_role_privilege` VALUES ('1', '3');
INSERT INTO `sys_role_privilege` VALUES ('2', '4');
INSERT INTO `sys_role_privilege` VALUES ('2', '5');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) NOT NULL,
  `user_password` varchar(50) NOT NULL,
  `user_email` varchar(50) DEFAULT NULL,
  `user_info` varchar(1000) DEFAULT NULL,
  `head_img` blob,
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', ' admin', '123456', ' admin@qq.com', '管理员', null, '2017-11-24 15:28:53');
INSERT INTO `sys_user` VALUES ('2', 'test', '123456', 'test@qq.com', '测试用户', null, '2017-11-24 15:29:31');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `user_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('1', '1');
INSERT INTO `sys_user_role` VALUES ('1', '2');
INSERT INTO `sys_user_role` VALUES ('2', '2');
