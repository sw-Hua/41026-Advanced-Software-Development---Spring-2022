/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 80029
 Source Host           : localhost:3306
 Source Schema         : restarant

 Target Server Type    : MySQL
 Target Server Version : 80029
 File Encoding         : 65001

 Date: 04/09/2022 22:37:50
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee`  (
  `id` bigint NOT NULL COMMENT 'primaryKey',
  `name` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT 'fullName',
  `username` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT 'userName',
  `password` varchar(64) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT 'password',
  `phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT 'phoneNumber',
  `sex` varchar(2) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT 'gender',
  `id_number` varchar(18) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT 'identityNumber',
  `status` int NOT NULL DEFAULT 1 COMMENT 'status0Disabled1Normal',
  `create_time` datetime NOT NULL COMMENT 'creationTime',
  `update_time` datetime NOT NULL COMMENT 'updateTime',
  `create_user` bigint NOT NULL COMMENT 'founder',
  `update_user` bigint NOT NULL COMMENT 'modifiedBy',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `idx_username`(`username` ASC) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = 'information' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES (1, 'administrator', 'admin', 'e10adc3949ba59abbe56e057f20f883e', '13812312312', '1', '110101199001010047', 1, '2021-05-06 17:20:07', '2022-08-23 08:19:25', 1, 1);
INSERT INTO `employee` VALUES (272745454545, 'YONGYAN LIU', 'admin2', '123456', '18698745896', '1', '440181200023123222', 2, '2022-09-04 22:04:07', '2022-09-04 22:04:20', 1, 1);
INSERT INTO `employee` VALUES (1561731585220128770, 'XUHAO GUO', 'MANAGER', 'e10adc3949ba59abbe56e057f20f883e', '15917899566', '0', '440181200023123222', 1, '2022-08-22 23:06:40', '2022-08-23 08:20:26', 1, 1);

SET FOREIGN_KEY_CHECKS = 1;
