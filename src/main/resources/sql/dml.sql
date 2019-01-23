
-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES (1, 'guest', '2019-01-23 15:30:55');
INSERT INTO `t_role` VALUES (2, 'user', '2019-01-23 15:30:55');
INSERT INTO `t_role` VALUES (3, 'admin', '2019-01-23 15:30:55');

-- ----------------------------
-- Records of t_permission
-- ----------------------------
INSERT INTO `t_permission` VALUES (1, 'Retrieve', '2019-01-23 15:30:39');
INSERT INTO `t_permission` VALUES (2, 'Create', '2019-01-23 15:30:39');
INSERT INTO `t_permission` VALUES (3, 'Update', '2019-01-23 15:30:39');
INSERT INTO `t_permission` VALUES (4, 'Delete', '2019-01-23 15:30:39');
-- ----------------------------
-- Records of t_role_permission
-- ----------------------------
INSERT INTO `t_role_permission` VALUES (1, 1, 1, '2019-01-23 15:33:00');
INSERT INTO `t_role_permission` VALUES (2, 2, 1, '2019-01-23 15:33:01');
INSERT INTO `t_role_permission` VALUES (3, 2, 2, '2019-01-23 15:33:01');
INSERT INTO `t_role_permission` VALUES (4, 2, 3, '2019-01-23 15:33:01');
INSERT INTO `t_role_permission` VALUES (5, 3, 1, '2019-01-23 15:33:01');
INSERT INTO `t_role_permission` VALUES (6, 3, 2, '2019-01-23 15:33:01');
INSERT INTO `t_role_permission` VALUES (7, 3, 3, '2019-01-23 15:33:01');
INSERT INTO `t_role_permission` VALUES (8, 3, 4, '2019-01-23 15:33:01');