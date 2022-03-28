/*
Navicat MySQL Data Transfer

Source Server         : main
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : arknight

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2022-03-28 18:47:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for checkpoint
-- ----------------------------
DROP TABLE IF EXISTS `checkpoint`;
CREATE TABLE `checkpoint` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `number` int(10) NOT NULL,
  `title` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of checkpoint
-- ----------------------------
INSERT INTO `checkpoint` VALUES ('1', '1', '7-9');
INSERT INTO `checkpoint` VALUES ('2', '2', '7-16');
INSERT INTO `checkpoint` VALUES ('3', '3', 'H5-1');
INSERT INTO `checkpoint` VALUES ('4', '4', 'H5-3');
INSERT INTO `checkpoint` VALUES ('5', '5', 'H6-1');
INSERT INTO `checkpoint` VALUES ('6', '6', 'H6-3');
INSERT INTO `checkpoint` VALUES ('7', '7', 'H7-2');
INSERT INTO `checkpoint` VALUES ('8', '8', 'H7-3');
INSERT INTO `checkpoint` VALUES ('9', '9', 'H8-1');
INSERT INTO `checkpoint` VALUES ('10', '10', 'H8-2');
INSERT INTO `checkpoint` VALUES ('11', '11', 'OF-EX-4(火蓝之心)');
INSERT INTO `checkpoint` VALUES ('12', '12', 'OF-EX-6(火蓝之心)');
INSERT INTO `checkpoint` VALUES ('13', '13', 'CB-EX-7(喧闹法则)');
INSERT INTO `checkpoint` VALUES ('14', '14', 'CB-EX-8(喧闹法则)');
INSERT INTO `checkpoint` VALUES ('15', '15', 'DM-EX-5(生于黑夜)');
INSERT INTO `checkpoint` VALUES ('16', '16', 'DM-EX-6(生于黑夜)');
INSERT INTO `checkpoint` VALUES ('17', '17', 'WD-EX-7(遗尘漫步)');
INSERT INTO `checkpoint` VALUES ('18', '18', 'WD-EX-8(遗尘漫步)');
INSERT INTO `checkpoint` VALUES ('19', '19', 'SV-EX-4(覆潮之下)');
INSERT INTO `checkpoint` VALUES ('20', '20', 'SV-EX-6(覆潮之下)');

-- ----------------------------
-- Table structure for disadvantaged
-- ----------------------------
DROP TABLE IF EXISTS `disadvantaged`;
CREATE TABLE `disadvantaged` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `number` int(10) NOT NULL,
  `title` varchar(20) NOT NULL,
  `content` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of disadvantaged
-- ----------------------------
INSERT INTO `disadvantaged` VALUES ('1', '1', '坏猫咪', '招募与好友助战同名的干员消耗的点数+1(禁止刷新助战列表)');
INSERT INTO `disadvantaged` VALUES ('2', '2', '未知的故事', '招募罗德岛干员消耗的点数+2');
INSERT INTO `disadvantaged` VALUES ('3', '3', '盲目平衡', '招募相同职业的干员时，该职业消耗的点数加倍');
INSERT INTO `disadvantaged` VALUES ('4', '4', '\"撞色\"', '禁止招募相同发色的干员/仅允许招募发色相同的干员(二选一)');
INSERT INTO `disadvantaged` VALUES ('5', '5', '专员抽调', '禁止招募六星干员');
INSERT INTO `disadvantaged` VALUES ('6', '6', '补给受限', '禁止招募部署费用超过 20 的干员(包括等待再部署的干员)');
INSERT INTO `disadvantaged` VALUES ('7', '7', '超重行李', '至多招募 6 名干员');
INSERT INTO `disadvantaged` VALUES ('8', '8', '战场课题', '至少招募 4 名相同职业的干员');
INSERT INTO `disadvantaged` VALUES ('9', '9', '从一而终', '至少招募 4 名使用一技能的干员');
INSERT INTO `disadvantaged` VALUES ('10', '10', '背水一战', '干员每次部署仅能发动 1 次技能(自动触发型技能不受此劣势影响)');
INSERT INTO `disadvantaged` VALUES ('11', '11', '每逢佳节', '干员部署费用+3');
INSERT INTO `disadvantaged` VALUES ('12', '12', '峡谷作战', '近战部署上限减少至3');
INSERT INTO `disadvantaged` VALUES ('13', '13', '冬旅营火', '部署上限减少至 3，在场上干员的周围四格部署干员时不消耗部署位(召唤物不受此劣势影响)');
INSERT INTO `disadvantaged` VALUES ('14', '14', '战争迷雾', '部署上限减少至 3，在场上干员的攻击范围内部署干员时不消耗部署位(召唤物不受此劣势影响)');
INSERT INTO `disadvantaged` VALUES ('15', '15', '生人勿近', '禁止在干员周围四格部署干员(关系网连线干员&召唤物不受此劣势影响)');
INSERT INTO `disadvantaged` VALUES ('16', '16', '闪击战', '禁止部署部署费用最高&最低的干员(包括等待再部署的干员；召唤物不受此劣势影响)');
INSERT INTO `disadvantaged` VALUES ('17', '17', '可露希尔特价', '招募六星干员消耗的点数+2');
INSERT INTO `disadvantaged` VALUES ('18', '18', '节衣缩食', '招募点数-6');
INSERT INTO `disadvantaged` VALUES ('19', '19', '\"一点\"加班费', 'Roll，使用相同的队伍，额外挑战一个关卡');
INSERT INTO `disadvantaged` VALUES ('20', '20', '祸不单行', 'Roll，获得两项额外的劣势');

-- ----------------------------
-- Table structure for superiority
-- ----------------------------
DROP TABLE IF EXISTS `superiority`;
CREATE TABLE `superiority` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `number` int(10) NOT NULL,
  `title` varchar(20) NOT NULL,
  `content` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of superiority
-- ----------------------------
INSERT INTO `superiority` VALUES ('1', '1', '好猫咪', '招募与好友助战同名的干员消耗的点数减半(向下取整；禁止刷新助战列表)');
INSERT INTO `superiority` VALUES ('2', '2', '轻量化', '招募部署费用超过 20 的干员消耗的点数减半(向下取整)');
INSERT INTO `superiority` VALUES ('3', '3', '值周生', '招募当期活动卡池&轮换卡池内的干员不消耗点数');
INSERT INTO `superiority` VALUES ('4', '4', '时装周', '招募身着时装的干员消耗的点数减半(向下取整)');
INSERT INTO `superiority` VALUES ('5', '5', '杜林理发券·蓝白', '招募蓝发&白发的干员消耗的点数减半(向下取整)');
INSERT INTO `superiority` VALUES ('6', '6', '杜林理发券·红黑', '招募红发&黑发的干员消耗的点数减半(向下取整)');
INSERT INTO `superiority` VALUES ('7', '7', '大祭司转转转', '招募男性干员消耗的点数减半(向下取整)');
INSERT INTO `superiority` VALUES ('8', '8', '一捧铃兰花', '招募罗德岛干员消耗的点数减半(向下取整)');
INSERT INTO `superiority` VALUES ('9', '9', '魏公酬礼', '招募龙门干员不消耗点数');
INSERT INTO `superiority` VALUES ('10', '10', '瓦莱丽优惠券', '招募维多利亚干员不消耗点数');
INSERT INTO `superiority` VALUES ('11', '11', '《海中深色》', '招募哥伦比亚干员不消耗点数');
INSERT INTO `superiority` VALUES ('12', '12', '庇护之地', '招募萨卡兹&萨科塔干员不消耗点数');
INSERT INTO `superiority` VALUES ('13', '13', '顺风', '招募黎博利干员不消耗点数');
INSERT INTO `superiority` VALUES ('14', '14', '毛线球', '招募菲林干员消耗的点数减半(向下取整)');
INSERT INTO `superiority` VALUES ('15', '15', '家族会议', '招募佩洛&鲁珀&沃尔珀干员不消耗点数');
INSERT INTO `superiority` VALUES ('16', '16', '及时雨', '招募四星及以下干员不消耗点数');
INSERT INTO `superiority` VALUES ('17', '17', '战术优势', '招募六星&五星&四星干员消耗的点数减半(向下取整)');
INSERT INTO `superiority` VALUES ('18', '18', '免费午餐', '招募点数+10，并返还购入优势骰消耗的点数');
INSERT INTO `superiority` VALUES ('19', '19', '执棋者', '去除所有劣势');
INSERT INTO `superiority` VALUES ('20', '20', '动作如潮', 'Roll，获得两项额外的优势');
