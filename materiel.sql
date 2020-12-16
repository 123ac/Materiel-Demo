/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : materiel

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2020-12-04 11:11:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `uri` varchar(100) NOT NULL COMMENT '请求接口',
  `method` varchar(10) NOT NULL COMMENT '请求方式',
  `MethodDescribe` varchar(100) DEFAULT NULL COMMENT '描述',
  `params` varchar(255) DEFAULT NULL COMMENT '参数',
  `username` varchar(32) NOT NULL COMMENT '用户名',
  `ip` varchar(32) DEFAULT NULL COMMENT 'ip',
  `create_date` datetime NOT NULL COMMENT '操作时间',
  `browser` varchar(32) DEFAULT NULL COMMENT '浏览器类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_log
-- ----------------------------
INSERT INTO `sys_log` VALUES ('1', '/', 'GET', '访问主页', '[]', 'admin', '0:0:0:0:0:0:0:1', '2020-11-24 17:04:57', 'Chrome 8');
INSERT INTO `sys_log` VALUES ('2', '/login?logout', 'LoginOut', '退出系统', '[]', 'admin', '0:0:0:0:0:0:0:1', '2020-11-24 17:04:58', 'Chrome 8');
INSERT INTO `sys_log` VALUES ('3', '/', 'GET', '访问主页', '[]', 'admin', '0:0:0:0:0:0:0:1', '2020-11-24 17:19:56', 'Chrome 8');
INSERT INTO `sys_log` VALUES ('4', '/', 'GET', '访问主页', '[]', 'admin', '0:0:0:0:0:0:0:1', '2020-11-24 17:19:58', 'Chrome 8');
INSERT INTO `sys_log` VALUES ('5', '/', 'GET', '访问主页', '[]', 'admin', '0:0:0:0:0:0:0:1', '2020-11-24 17:20:00', 'Chrome 8');
INSERT INTO `sys_log` VALUES ('6', '/', 'GET', '访问主页', '[]', 'admin', '0:0:0:0:0:0:0:1', '2020-11-24 17:20:19', 'Chrome 8');
INSERT INTO `sys_log` VALUES ('7', '/', 'GET', '访问主页', '[]', 'admin', '0:0:0:0:0:0:0:1', '2020-11-24 17:20:21', 'Chrome 8');
INSERT INTO `sys_log` VALUES ('8', '/', 'GET', '访问主页', '[]', 'admin', '0:0:0:0:0:0:0:1', '2020-11-24 17:20:23', 'Chrome 8');
INSERT INTO `sys_log` VALUES ('9', '/', 'GET', '访问主页', '[]', 'admin', '0:0:0:0:0:0:0:1', '2020-11-24 17:20:26', 'Chrome 8');
INSERT INTO `sys_log` VALUES ('10', '/', 'GET', '访问主页', '[]', 'admin', '0:0:0:0:0:0:0:1', '2020-11-24 17:21:34', 'Chrome 8');
INSERT INTO `sys_log` VALUES ('11', '/', 'GET', '访问主页', '[]', 'admin', '0:0:0:0:0:0:0:1', '2020-11-24 17:21:36', 'Chrome 8');
INSERT INTO `sys_log` VALUES ('12', '/', 'GET', '访问主页', '[]', 'admin', '0:0:0:0:0:0:0:1', '2020-11-24 17:21:38', 'Chrome 8');
INSERT INTO `sys_log` VALUES ('13', '/', 'GET', '访问主页', '[]', 'admin', '192.168.5.222', '2020-11-24 17:22:14', 'Chrome 8');
INSERT INTO `sys_log` VALUES ('14', '/', 'GET', '访问主页', '[]', 'admin', '0:0:0:0:0:0:0:1', '2020-11-24 17:23:51', 'Chrome 8');
INSERT INTO `sys_log` VALUES ('15', '/', 'GET', '访问主页', '[]', 'admin', '0:0:0:0:0:0:0:1', '2020-11-24 17:23:53', 'Chrome 8');
INSERT INTO `sys_log` VALUES ('16', '/', 'GET', '访问主页', '[]', 'admin', '0:0:0:0:0:0:0:1', '2020-11-24 17:23:55', 'Chrome 8');
INSERT INTO `sys_log` VALUES ('17', '/login?logout', 'LoginOut', '退出系统', '[]', 'admin', '0:0:0:0:0:0:0:1', '2020-11-24 17:23:57', 'Chrome 8');
INSERT INTO `sys_log` VALUES ('18', '/', 'GET', '访问主页', '[]', 'admin', '0:0:0:0:0:0:0:1', '2020-11-24 17:28:55', 'Chrome 8');
INSERT INTO `sys_log` VALUES ('19', '/', 'GET', '访问主页', '[]', 'admin', '0:0:0:0:0:0:0:1', '2020-11-24 17:28:57', 'Chrome 8');
INSERT INTO `sys_log` VALUES ('20', '/login?logout', 'LoginOut', '退出系统', '[]', 'admin', '0:0:0:0:0:0:0:1', '2020-11-24 17:28:58', 'Chrome 8');
INSERT INTO `sys_log` VALUES ('21', '/', 'GET', '访问主页', '[]', 'admin', '0:0:0:0:0:0:0:1', '2020-11-24 17:29:00', 'Chrome 8');
INSERT INTO `sys_log` VALUES ('22', '/', 'GET', '访问主页', '[]', 'admin', '0:0:0:0:0:0:0:1', '2020-12-04 11:09:09', 'Chrome 8');

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `id` int(11) NOT NULL,
  `parentId` int(11) DEFAULT NULL,
  `menuName` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '菜单名称',
  `url` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '访问地址',
  `icon` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '菜单图标',
  `orderNum` int(11) DEFAULT NULL,
  `open` int(11) DEFAULT NULL,
  `disabled` float(1,0) DEFAULT NULL COMMENT '默认false 关闭',
  `perms` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `children` varchar(1000) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '下级菜单配置json数据',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('1', '0', '系统管理', null, 'el-icon-setting', '1', '1', '0', null, '0', '[{\"id\":226,\"parentId\":1,\"menuName\":\"用户管理\",\"url\":\"/users\",\"icon\":\"el-icon-user\",\"orderNum\":2,\"open\":0,\"disabled\":false,\"perms\":\"users\",\"type\":0,\"children\":[]},{\"id\":4,\"parentId\":1,\"menuName\":\"菜单权限\",\"url\":\"/menus\",\"icon\":\"el-icon-help\",\"orderNum\":3,\"open\":0,\"disabled\":false,\"perms\":null,\"type\":0,\"children\":[]}]');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `Id` char(32) NOT NULL,
  `roleName` varchar(16) NOT NULL,
  `detail` varchar(255) DEFAULT NULL COMMENT '描述',
  `delflag` tinyint(1) NOT NULL COMMENT '删除标识：1-删除  0-未删除',
  `createTime` datetime DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限表';

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', 'ROLE_ADMIN', null, '0', null);
INSERT INTO `sys_role` VALUES ('2', 'ROLE_USER', null, '0', null);

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` char(32) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `delflag` tinyint(1) NOT NULL DEFAULT '0' COMMENT '删除标识：1-删除  0-未删除',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', '$2a$10$dB4FzduqBNFKAhEgwEtRae8Bco/c0nXaQyFXivVxiZMoz4Kyxg9Wy', '0', null);
INSERT INTO `sys_user` VALUES ('2', 'user', '$2a$10$jcg0hO4iFFo.15MKZ0MFbuneOwbna7uGBRw0NYCyXkGHSYOSaWg9a\r\n', '0', null);
INSERT INTO `sys_user` VALUES ('3', '小明', '$2a$10$kRhBvIZXB9p7bHNuShjqUe0em.gIznIDhrbd.mFAaTmns3EknAsbK\r\n', '0', null);
INSERT INTO `sys_user` VALUES ('4', '小红', '$2a$10$kRhBvIZXB9p7bHNuShjqUe0em.gIznIDhrbd.mFAaTmns3EknAsbK\r\n', '0', null);
INSERT INTO `sys_user` VALUES ('5', '小梅', '$2a$10$kRhBvIZXB9p7bHNuShjqUe0em.gIznIDhrbd.mFAaTmns3EknAsbK\r\n', '0', null);
INSERT INTO `sys_user` VALUES ('6', '小刚', '$2a$10$kRhBvIZXB9p7bHNuShjqUe0em.gIznIDhrbd.mFAaTmns3EknAsbK\r\n', '0', null);
INSERT INTO `sys_user` VALUES ('7', '小智', '$2a$10$61K6xRiuNpB5rR/Z7syvb.upcy0nNb0nsM9Il07h5jyHUG7vnnjwK\r\n', '0', null);
-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `user_id` char(32) NOT NULL,
  `role_id` char(32) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `fk_role_id` (`role_id`),
  CONSTRAINT `fk_role_id` FOREIGN KEY (`role_id`) REFERENCES `sys_role` (`Id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_user_id` FOREIGN KEY (`user_id`) REFERENCES `sys_user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户-角色表';

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('1', '1');
INSERT INTO `sys_user_role` VALUES ('1', '2');
INSERT INTO `materiel`.`sys_user_role` (`user_id`, `role_id`) VALUES ('2', '2');
INSERT INTO `materiel`.`sys_user_role` (`user_id`, `role_id`) VALUES ('3', '2');
INSERT INTO `materiel`.`sys_user_role` (`user_id`, `role_id`) VALUES ('4', '2');
INSERT INTO `materiel`.`sys_user_role` (`user_id`, `role_id`) VALUES ('5', '2');
INSERT INTO `materiel`.`sys_user_role` (`user_id`, `role_id`) VALUES ('6', '2');
INSERT INTO `materiel`.`sys_user_role` (`user_id`, `role_id`) VALUES ('7', '2');