/*
SQLyog Ultimate v11.3 (64 bit)
MySQL - 5.7.32-log : Database - xuexixitong
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`xuexixitong` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `xuexixitong`;

/*Table structure for table `config` */

DROP TABLE IF EXISTS `config`;

CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';

/*Data for the table `config` */

insert  into `config`(`id`,`name`,`value`) values (1,'picture1','http://localhost:8080/xuexixitong/upload/1635996418451.jpg'),(2,'picture2','http://localhost:8080/xuexixitong/upload/1635996431751.jpg'),(3,'picture3','http://localhost:8080/xuexixitong/upload/1635996440158.jpg'),(6,'homepage',NULL);

/*Table structure for table `dictionary` */

DROP TABLE IF EXISTS `dictionary`;

CREATE TABLE `dictionary` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `dic_code` varchar(200) DEFAULT NULL COMMENT '字段',
  `dic_name` varchar(200) DEFAULT NULL COMMENT '字段名',
  `code_index` int(11) DEFAULT NULL COMMENT '编码',
  `index_name` varchar(200) DEFAULT NULL COMMENT '编码名字  Search111 ',
  `super_id` int(11) DEFAULT NULL COMMENT '父字段id',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=85 DEFAULT CHARSET=utf8 COMMENT='字典表';

/*Data for the table `dictionary` */

insert  into `dictionary`(`id`,`dic_code`,`dic_name`,`code_index`,`index_name`,`super_id`,`beizhu`,`create_time`) values (65,'sex_types','性别',1,'男',NULL,NULL,'2021-11-02 16:13:43'),(66,'sex_types','性别',2,'女',NULL,NULL,'2021-11-02 16:13:43'),(67,'kecheng_types','课程类型名称',1,'语文',NULL,NULL,'2021-11-02 16:13:43'),(68,'kecheng_types','课程类型名称',2,'数学',NULL,NULL,'2021-11-02 16:13:44'),(69,'banji_types','班级名称',1,'班级1',NULL,NULL,'2021-11-02 16:13:44'),(70,'banji_types','班级名称',2,'班级2',NULL,NULL,'2021-11-02 16:13:44'),(71,'kaoqin_types','考勤状态',1,'正常',NULL,NULL,'2021-11-02 16:13:44'),(72,'kaoqin_types','考勤状态',2,'请假',NULL,NULL,'2021-11-02 16:13:44'),(73,'kaoqinqingjia_types','审核状态',1,'未审核',NULL,NULL,'2021-11-02 16:13:44'),(74,'kaoqinqingjia_types','考勤状态',2,'审核通过',NULL,NULL,'2021-11-02 16:13:44'),(75,'kaoqinqingjia_types','考勤状态',3,'审核驳回',NULL,NULL,'2021-11-02 16:13:44'),(76,'exampaper_types','试卷状态',1,'启用',NULL,NULL,'2021-11-02 16:13:44'),(77,'exampaper_types','试卷状态',2,'禁用',NULL,NULL,'2021-11-02 16:13:44'),(78,'examquestion_types','试题类型',1,'单选题',NULL,NULL,'2021-11-02 16:13:44'),(79,'examquestion_types','试题类型',2,'多选题',NULL,NULL,'2021-11-02 16:13:44'),(80,'examquestion_types','试题类型',3,'判断题',NULL,NULL,'2021-11-02 16:13:44'),(81,'examquestion_types','试题类型',4,'填空题',NULL,NULL,'2021-11-02 16:13:44'),(82,'forum_types','帖子类型名称',1,'留言',NULL,NULL,'2021-11-02 16:13:44'),(83,'forum_types','帖子类型名称',2,'学习讨论',NULL,NULL,'2021-11-02 16:13:44'),(84,'forum_types','帖子类型名称',3,'日常摸鱼',NULL,NULL,'2021-11-02 16:13:44');

/*Table structure for table `exampaper` */

DROP TABLE IF EXISTS `exampaper`;

CREATE TABLE `exampaper` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `exampaper_name` varchar(200) DEFAULT NULL COMMENT '试卷名称 Search111',
  `exampaper_date` int(11) DEFAULT NULL COMMENT '考试时长(分钟)',
  `exampaper_myscore` int(20) DEFAULT '0' COMMENT '试卷总分数',
  `exampaper_types` int(11) DEFAULT '0' COMMENT '试卷状态 Search111',
  `exampaper_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '考试结束时间',
  `exampaper_delete` int(255) DEFAULT '0' COMMENT '逻辑删除（0代表未删除 1代表已删除）',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间 show1 photoShow',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='试卷表';

/*Data for the table `exampaper` */

insert  into `exampaper`(`id`,`exampaper_name`,`exampaper_date`,`exampaper_myscore`,`exampaper_types`,`exampaper_time`,`exampaper_delete`,`create_time`) values (1,'驾校科目1考题',123,58,2,'2021-11-04 10:45:18',1,'2021-09-16 14:44:20'),(5,'简单数学题',50,100,1,'2021-11-05 11:01:00',1,'2021-10-15 14:52:43');

/*Table structure for table `examquestion` */

DROP TABLE IF EXISTS `examquestion`;

CREATE TABLE `examquestion` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `exampaper_id` int(20) NOT NULL COMMENT '所属试卷id（外键）',
  `examquestion_name` varchar(200) NOT NULL COMMENT '试题名称 Search111',
  `examquestion_options` longtext COMMENT '选项，json字符串',
  `examquestion_score` int(20) DEFAULT '0' COMMENT '分值 Search111',
  `examquestion_answer` varchar(200) DEFAULT NULL COMMENT '正确答案',
  `examquestion_analysis` longtext COMMENT '答案解析',
  `examquestion_types` int(20) DEFAULT '0' COMMENT '试题类型',
  `examquestion_sequence` int(20) DEFAULT '100' COMMENT '试题排序，值越大排越前面',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8 COMMENT='试题表';

/*Data for the table `examquestion` */

insert  into `examquestion`(`id`,`exampaper_id`,`examquestion_name`,`examquestion_options`,`examquestion_score`,`examquestion_answer`,`examquestion_analysis`,`examquestion_types`,`examquestion_sequence`,`create_time`) values (11,1,'按照物流系统的作用,属性及作用的空间范围,可从不同角度对物流进行分类,按照物流活动的空间范围分类,可分为( )','[{\"text\":\"地区物流\",\"code\":\"A\"},{\"text\":\"供应物流\",\"code\":\"B\"},{\"text\":\"销售物流\",\"code\":\"C\"},{\"text\":\"国内物流\",\"code\":\"D\"}]',10,'A,C','暂无解析',2,1,'2021-09-16 14:44:20'),(17,1,'公安机关交通管理部门对累积记分达到规定分值的驾驶人怎样处理？','[{\"text\":\"A.依法追究刑事责任\",\"code\":\"A\"},{\"text\":\"B.处15日以下拘留\",\"code\":\"B\"},{\"text\":\"C.终生禁驾\",\"code\":\"C\"},{\"text\":\"D.进行法律法规教育，重新考试\",\"code\":\"D\"}]',15,'D','《道路交通安全法》第二十四条：公安机关交通管理部门对累积记分达到规定分值的机动车驾驶人，扣留机动车驾驶证，对其进行道路交通安全法律、法规教育，重新考试；考试合格的，发还其机动车驾驶证。',1,2,'2021-09-16 14:44:20'),(18,1,'机动车驾驶人在一个记分周期内有两次以上达到12分或者累积记分达到24分以上的，在驾校参加科目一理论知识考试，合格后即可发还机动车驾驶证。','[{\"text\":\"A.对\",\"code\":\"A\"},{\"text\":\"B.错\",\"code\":\"B\"}]',10,'B','《机动车驾驶证申领和使用规定》第六十八条：机动车驾驶人在一个记分周期内有两次以上达到12分或者累积记分达到24分以上的，车辆管理所还应当在道路交通安全法律、法规和相关知识考试合格后十日内对其进行道路驾驶技能考试。',3,3,'2021-09-16 14:44:20'),(19,1,'驾驶证丢失后，驾驶人可以继续驾驶机动车吗？','[]',10,'不能','《道路交通安全法实施条例》第二十八条：机动车驾驶人在机动车驾驶证丢失、损毁、超过有效期或者被依法扣留、暂扣期间以及记分达到12分的，不得驾驶机动车。',4,4,'2021-09-16 14:44:20'),(20,1,'地球和月球距离多远？','[]',2,'38万公里','222222222',4,3,'2021-09-16 14:44:20'),(21,1,'胡歌是女演员嘛？','[{\"text\":\"A.对\",\"code\":\"A\"},{\"text\":\"B.错\",\"code\":\"B\"}]',3,'B','他是男人',3,2,'2021-10-15 10:50:32'),(22,1,'科目一满分多少？','[]',8,'100分','2',4,1,'2021-10-15 10:48:44'),(24,5,'1+1=?','[{\"text\":\"1\",\"code\":\"A\"},{\"text\":\"2\",\"code\":\"B\"},{\"text\":\"3\",\"code\":\"C\"},{\"text\":\"4\",\"code\":\"D\"}]',10,'B','1+1=2',1,100,'2021-10-15 14:53:51'),(25,5,'2+2=?','[]',10,'4','2+2=4',4,99,'2021-10-15 14:52:43'),(26,5,'3+3=5','[{\"text\":\"A.对\",\"code\":\"A\"},{\"text\":\"B.错\",\"code\":\"B\"}]',10,'B','3+3=6',3,100,'2021-10-15 14:52:43'),(27,5,'1*2*3*4*5*6*7*8*9*0=?','[{\"text\":\"123\",\"code\":\"A\"},{\"text\":\"456\",\"code\":\"B\"},{\"text\":\"以上都错\",\"code\":\"C\"},{\"text\":\"全不对\",\"code\":\"D\"}]',20,'C,D','全错',2,97,'2021-10-15 14:52:43'),(28,5,'1-1+2+3=1','[{\"text\":\"A.对\",\"code\":\"A\"},{\"text\":\"B.错\",\"code\":\"B\"}]',10,'B','无解析',3,96,'2021-10-15 15:14:09'),(29,5,'987-987=？','[{\"text\":\"1\",\"code\":\"A\"},{\"text\":\"2\",\"code\":\"B\"},{\"text\":\"3\",\"code\":\"C\"},{\"text\":\"0\",\"code\":\"D\"}]',10,'D','无解析',1,95,'2021-10-15 15:14:42'),(30,5,'111111-1111111-3123231+451111119*0=？','[{\"text\":\"123\",\"code\":\"A\"},{\"text\":\"3333\",\"code\":\"B\"},{\"text\":\"44444\",\"code\":\"C\"},{\"text\":\"555555\",\"code\":\"D\"}]',20,'A,D','无解析',2,94,'2021-10-15 14:52:43'),(31,5,'9-9=？','[]',10,'0','无解析',4,101,'2021-10-15 14:52:43');

/*Table structure for table `examrecord` */

DROP TABLE IF EXISTS `examrecord`;

CREATE TABLE `examrecord` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `examrecord_uuid_number` varchar(200) DEFAULT NULL COMMENT '考试编号',
  `xuesheng_id` int(20) NOT NULL COMMENT '考试用户',
  `exampaper_id` int(20) NOT NULL COMMENT '所属试卷id（外键）',
  `total_score` int(200) DEFAULT NULL COMMENT '所得总分',
  `insert_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '考试时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COMMENT='考试记录表';

/*Data for the table `examrecord` */

insert  into `examrecord`(`id`,`examrecord_uuid_number`,`xuesheng_id`,`exampaper_id`,`total_score`,`insert_time`,`create_time`) values (5,'1635994128178',1,5,80,'2021-11-04 10:48:48','2021-11-04 10:48:48'),(6,'1636011418222',5,5,60,'2021-11-04 15:36:58','2021-11-04 15:36:58'),(20,'1636017886748',5,5,0,'2021-11-04 17:24:47','2021-11-04 17:24:47');

/*Table structure for table `examredetails` */

DROP TABLE IF EXISTS `examredetails`;

CREATE TABLE `examredetails` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `examredetails_uuid_number` varchar(200) DEFAULT NULL COMMENT '试卷编号',
  `xuesheng_id` int(20) NOT NULL COMMENT '用户id',
  `examquestion_id` int(20) NOT NULL COMMENT '试题id（外键）',
  `examredetails_myanswer` varchar(200) DEFAULT NULL COMMENT '考生答案',
  `examredetails_myscore` int(20) NOT NULL DEFAULT '0' COMMENT '试题得分',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8 COMMENT='答题详情表';

/*Data for the table `examredetails` */

insert  into `examredetails`(`id`,`examredetails_uuid_number`,`xuesheng_id`,`examquestion_id`,`examredetails_myanswer`,`examredetails_myscore`,`create_time`) values (1,'1635994128178',1,31,'0',10,'2021-11-04 10:48:52'),(2,'1635994128178',1,24,'B',10,'2021-11-04 10:48:55'),(3,'1635994128178',1,26,'B',10,'2021-11-04 10:48:59'),(4,'1635994128178',1,25,'4',10,'2021-11-04 10:49:02'),(5,'1635994128178',1,27,'C,D',20,'2021-11-04 10:49:08'),(6,'1635994128178',1,28,'B',10,'2021-11-04 10:49:13'),(7,'1635994128178',1,29,'D',10,'2021-11-04 10:49:17'),(8,'1635994128178',1,30,'D,B',0,'2021-11-04 10:49:22'),(9,'1636011418222',5,31,'123',0,'2021-11-04 15:37:02'),(10,'1636011418222',5,24,'D',0,'2021-11-04 15:37:05'),(11,'1636011418222',5,26,'B',10,'2021-11-04 15:37:08'),(12,'1636011418222',5,25,'4',10,'2021-11-04 15:37:11'),(13,'1636011418222',5,27,'C,D',20,'2021-11-04 15:37:15'),(14,'1636011418222',5,28,'A',0,'2021-11-04 15:37:18'),(15,'1636011418222',5,29,'B',0,'2021-11-04 15:37:19'),(16,'1636011418222',5,30,'A,D',20,'2021-11-04 15:37:22'),(25,'1636017886748',5,24,'未作答',0,'2021-11-04 17:24:48'),(26,'1636017886748',5,25,'未作答',0,'2021-11-04 17:24:48'),(27,'1636017886748',5,26,'未作答',0,'2021-11-04 17:24:48'),(28,'1636017886748',5,27,'未作答',0,'2021-11-04 17:24:48'),(29,'1636017886748',5,28,'未作答',0,'2021-11-04 17:24:48'),(30,'1636017886748',5,29,'未作答',0,'2021-11-04 17:24:48'),(31,'1636017886748',5,30,'未作答',0,'2021-11-04 17:24:48'),(32,'1636017886748',5,31,'未作答',0,'2021-11-04 17:24:48');

/*Table structure for table `examrewrongquestion` */

DROP TABLE IF EXISTS `examrewrongquestion`;

CREATE TABLE `examrewrongquestion` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `xuesheng_id` int(20) NOT NULL COMMENT '用户id',
  `exampaper_id` int(20) NOT NULL COMMENT '试卷（外键）',
  `examquestion_id` int(20) NOT NULL COMMENT '试题id（外键）',
  `examredetails_myanswer` varchar(200) DEFAULT NULL COMMENT '考生作答',
  `insert_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间 show3',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COMMENT='错题表';

/*Data for the table `examrewrongquestion` */

insert  into `examrewrongquestion`(`id`,`xuesheng_id`,`exampaper_id`,`examquestion_id`,`examredetails_myanswer`,`insert_time`,`create_time`) values (1,1,5,30,'D,B','2021-11-04 10:49:22','2021-11-04 10:49:22'),(2,5,5,31,'123','2021-11-04 15:37:02','2021-11-04 15:37:02'),(3,5,5,24,'D','2021-11-04 15:37:05','2021-11-04 15:37:05'),(4,5,5,28,'A','2021-11-04 15:37:18','2021-11-04 15:37:18'),(5,5,5,29,'B','2021-11-04 15:37:19','2021-11-04 15:37:19'),(6,1,5,24,'未作答','2021-11-04 17:06:28','2021-11-04 17:06:28'),(7,1,5,25,'未作答','2021-11-04 17:06:28','2021-11-04 17:06:28'),(8,1,5,26,'未作答','2021-11-04 17:06:28','2021-11-04 17:06:28'),(9,1,5,27,'未作答','2021-11-04 17:06:28','2021-11-04 17:06:28'),(10,1,5,28,'未作答','2021-11-04 17:06:28','2021-11-04 17:06:28'),(11,1,5,29,'未作答','2021-11-04 17:06:28','2021-11-04 17:06:28'),(12,1,5,30,'未作答','2021-11-04 17:06:28','2021-11-04 17:06:28'),(13,1,5,31,'未作答','2021-11-04 17:06:28','2021-11-04 17:06:28'),(14,5,5,24,'未作答','2021-11-04 17:24:48','2021-11-04 17:24:48'),(15,5,5,25,'未作答','2021-11-04 17:24:48','2021-11-04 17:24:48'),(16,5,5,26,'未作答','2021-11-04 17:24:48','2021-11-04 17:24:48'),(17,5,5,27,'未作答','2021-11-04 17:24:48','2021-11-04 17:24:48'),(18,5,5,28,'未作答','2021-11-04 17:24:48','2021-11-04 17:24:48'),(19,5,5,29,'未作答','2021-11-04 17:24:48','2021-11-04 17:24:48'),(20,5,5,30,'未作答','2021-11-04 17:24:48','2021-11-04 17:24:48'),(21,5,5,31,'未作答','2021-11-04 17:24:48','2021-11-04 17:24:48');

/*Table structure for table `forum` */

DROP TABLE IF EXISTS `forum`;

CREATE TABLE `forum` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `forum_name` varchar(200) DEFAULT NULL COMMENT '帖子标题  Search111 ',
  `xuesheng_id` int(11) DEFAULT NULL COMMENT '学生',
  `forum_content` text COMMENT '发布内容',
  `super_ids` int(11) DEFAULT NULL COMMENT '父id',
  `forum_types` int(11) DEFAULT NULL COMMENT '帖子类型',
  `forum_state_types` int(11) DEFAULT NULL COMMENT '帖子状态',
  `insert_time` timestamp NULL DEFAULT NULL COMMENT '发帖时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '修改时间',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间 show2',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='论坛';

/*Data for the table `forum` */

insert  into `forum`(`id`,`forum_name`,`xuesheng_id`,`forum_content`,`super_ids`,`forum_types`,`forum_state_types`,`insert_time`,`update_time`,`create_time`) values (1,'123',1,'123',NULL,3,1,'2021-11-04 14:57:15',NULL,'2021-11-04 14:57:15'),(2,NULL,1,'123',1,NULL,2,'2021-11-04 14:57:22',NULL,'2021-11-04 14:57:22'),(3,'可以发布帖子',5,'其他登录用户可以回复',NULL,3,1,'2021-11-04 15:38:01',NULL,'2021-11-04 15:38:01'),(4,NULL,5,'我是第一条回复',3,NULL,2,'2021-11-04 15:38:19',NULL,'2021-11-04 15:38:19'),(5,NULL,5,'我是第二条回复',1,NULL,2,'2021-11-04 15:38:37',NULL,'2021-11-04 15:38:37');

/*Table structure for table `jiaoshi` */

DROP TABLE IF EXISTS `jiaoshi`;

CREATE TABLE `jiaoshi` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(200) DEFAULT NULL COMMENT '账户',
  `password` varchar(200) DEFAULT NULL COMMENT '密码',
  `jiaoshi_name` varchar(200) DEFAULT NULL COMMENT '教师姓名  Search111',
  `sex_types` int(11) DEFAULT NULL COMMENT '性别 Search111',
  `jiaoshi_id_number` varchar(200) DEFAULT NULL COMMENT '身份证号',
  `jiaoshi_phone` varchar(200) DEFAULT NULL COMMENT '手机号',
  `jiaoshi_photo` varchar(200) DEFAULT NULL COMMENT '照片',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间 ',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='教师';

/*Data for the table `jiaoshi` */

insert  into `jiaoshi`(`id`,`username`,`password`,`jiaoshi_name`,`sex_types`,`jiaoshi_id_number`,`jiaoshi_phone`,`jiaoshi_photo`,`create_time`) values (1,'333','123456',' 教师1',1,'410882200011212121','17788899542','http://localhost:8080/xuexixitong/upload/1635902683242.jpg','2021-11-03 09:18:40'),(2,'444','123456','教师2',2,'410882200011212120','17322222222','http://localhost:8080/xuexixitong/upload/1635902736239.jpg','2021-11-03 09:25:47');

/*Table structure for table `kaoqinqingjia` */

DROP TABLE IF EXISTS `kaoqinqingjia`;

CREATE TABLE `kaoqinqingjia` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `kechnegkaoqin_uuid_number` varchar(200) DEFAULT NULL COMMENT '编号',
  `xuesheng_id` int(11) DEFAULT NULL COMMENT '学生',
  `kaoqinqingjia_text` varchar(200) DEFAULT NULL COMMENT '理由',
  `kaoqinqingjia_types` int(11) DEFAULT NULL COMMENT '审批结果 Search111',
  `kechnegkaoqin_id` int(11) DEFAULT NULL COMMENT '课程考勤请假',
  `insert_time` timestamp NULL DEFAULT NULL COMMENT '请假时间',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间 ',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='考勤请假';

/*Data for the table `kaoqinqingjia` */

insert  into `kaoqinqingjia`(`id`,`kechnegkaoqin_uuid_number`,`xuesheng_id`,`kaoqinqingjia_text`,`kaoqinqingjia_types`,`kechnegkaoqin_id`,`insert_time`,`create_time`) values (1,'1635909755002',1,'学习累了 请假一星期 旅游放松一下',2,9,'2021-11-03 14:59:41','2021-11-03 14:59:41'),(2,'1635991001788',1,'123',3,10,'2021-11-04 09:59:33','2021-11-04 09:59:33'),(3,'1636014227427',1,'123',2,16,'2021-11-04 16:25:32','2021-11-04 16:25:32');

/*Table structure for table `kaoqinxiangqing` */

DROP TABLE IF EXISTS `kaoqinxiangqing`;

CREATE TABLE `kaoqinxiangqing` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `kechnegkaoqin_uuid_number` varchar(200) DEFAULT NULL COMMENT '编号',
  `xuesheng_id` int(11) DEFAULT NULL COMMENT '考勤学生',
  `kaoqin_types` int(11) DEFAULT NULL COMMENT '考勤状态 Search111',
  `insert_time` timestamp NULL DEFAULT NULL COMMENT '考勤时间',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间 ',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='课程考勤详情';

/*Data for the table `kaoqinxiangqing` */

insert  into `kaoqinxiangqing`(`id`,`kechnegkaoqin_uuid_number`,`xuesheng_id`,`kaoqin_types`,`insert_time`,`create_time`) values (5,'1636014227427',5,1,'2021-11-04 16:24:21','2021-11-04 16:24:21'),(6,'1636014227427',1,2,'2021-11-04 16:28:08','2021-11-04 16:28:08'),(7,'1636014227427',4,1,'2021-11-04 16:28:38','2021-11-04 16:28:38');

/*Table structure for table `kecheng` */

DROP TABLE IF EXISTS `kecheng`;

CREATE TABLE `kecheng` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `kecheng_name` varchar(200) DEFAULT NULL COMMENT '课程名称 Search111',
  `kecheng_types` int(11) DEFAULT NULL COMMENT '课程类型 Search111',
  `jiaoshi_id` int(11) DEFAULT NULL COMMENT '教师',
  `banji_types` int(11) DEFAULT NULL COMMENT '上课班级 Search111 ',
  `shangke_time` time DEFAULT NULL COMMENT '上课时间',
  `xiake_time` time DEFAULT NULL COMMENT '下课时间',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='课程信息';

/*Data for the table `kecheng` */

insert  into `kecheng`(`id`,`kecheng_name`,`kecheng_types`,`jiaoshi_id`,`banji_types`,`shangke_time`,`xiake_time`,`create_time`) values (1,'课程名称1',2,1,1,'06:30:00','07:00:00','2021-11-03 09:42:10'),(2,'课程2',2,1,2,'07:15:00','08:00:00','2021-11-03 09:53:36'),(3,'课程3',1,2,1,'06:30:00','07:45:00','2021-11-03 09:25:47'),(4,'课程4',2,2,2,'10:00:00','13:00:00','2021-11-03 09:59:34');

/*Table structure for table `kechengzuoye` */

DROP TABLE IF EXISTS `kechengzuoye`;

CREATE TABLE `kechengzuoye` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `kechengzuoye_name` varchar(200) DEFAULT NULL COMMENT '作业标题 Search111',
  `kecheng_types` int(11) DEFAULT NULL COMMENT '作业类型 Search111',
  `jiaoshi_id` int(11) DEFAULT NULL COMMENT '发布教师',
  `banji_types` int(11) DEFAULT NULL COMMENT '班级 Search111',
  `kechengzuoye_file` varchar(200) DEFAULT NULL COMMENT '文件',
  `kechengzuoye_content` varchar(200) DEFAULT NULL COMMENT '详情',
  `kechengzuoye_time` timestamp NULL DEFAULT NULL COMMENT '交付时间',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间 ',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='课程作业';

/*Data for the table `kechengzuoye` */

insert  into `kechengzuoye`(`id`,`kechengzuoye_name`,`kecheng_types`,`jiaoshi_id`,`banji_types`,`kechengzuoye_file`,`kechengzuoye_content`,`kechengzuoye_time`,`create_time`) values (1,'作业标题1',1,1,1,'http://localhost:8080/xuexixitong/upload/1635996111121.jpg','<p><span style=\"color: rgb(96, 98, 102);\">详情1</span></p>','2021-11-05 00:00:00','2021-11-04 11:22:01'),(2,'作业标题2',2,1,2,'http://localhost:8080/xuexixitong/upload/1635996305301.webp','<p><span style=\"color: rgb(96, 98, 102);\">详情1</span></p>','2021-11-27 00:00:00','2021-11-04 11:25:14'),(3,'作业标题3',1,2,1,'http://localhost:8080/xuexixitong/upload/1635996358663.mp3','<p>详情3</p>','2021-11-20 00:00:00','2021-11-04 11:26:07'),(4,'作业标题4',2,2,2,'http://localhost:8080/xuexixitong/upload/1635996393807.mp4','<p>详情4</p>','2021-11-05 00:00:00','2021-11-04 11:26:46');

/*Table structure for table `kechnegkaoqin` */

DROP TABLE IF EXISTS `kechnegkaoqin`;

CREATE TABLE `kechnegkaoqin` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `kechnegkaoqin_uuid_number` varchar(200) DEFAULT NULL COMMENT '编号',
  `kecheng_id` int(11) DEFAULT NULL COMMENT '课程',
  `zongrenshu` int(11) DEFAULT NULL COMMENT '班级人数',
  `yidaorenshu` int(11) DEFAULT NULL COMMENT '已到人数',
  `qingjiarenshu` int(11) DEFAULT NULL COMMENT '请假人数',
  `kaoqin_time` timestamp NULL DEFAULT NULL COMMENT '考勤时间',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间 ',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='课程考勤';

/*Data for the table `kechnegkaoqin` */

insert  into `kechnegkaoqin`(`id`,`kechnegkaoqin_uuid_number`,`kecheng_id`,`zongrenshu`,`yidaorenshu`,`qingjiarenshu`,`kaoqin_time`,`create_time`) values (16,'1636014227427',1,3,2,1,'2021-11-05 00:00:00','2021-11-04 16:23:47');

/*Table structure for table `token` */

DROP TABLE IF EXISTS `token`;

CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='token表';

/*Data for the table `token` */

insert  into `token`(`id`,`userid`,`username`,`tablename`,`role`,`token`,`addtime`,`expiratedtime`) values (1,1,'admin','users','管理员','it3oxgzk4ldjrso9uj4ptod3kew4dgm3','2021-09-16 14:33:29','2021-11-04 18:25:58'),(2,1,'111','yonghu','用户','267lay1c74r01ze8ap58ij9x5lcbkkpg','2021-09-23 17:19:56','2021-10-15 16:27:20'),(3,1,'111','xuesheng','学生','uaiess7bkfl4t4yofqps8bv636y9zg9u','2021-11-02 13:45:43','2021-11-04 17:51:48'),(4,1,'333','jiaoshi','教师','aq2bdts90k5nwbsznngnywvhqvxi356m','2021-11-04 09:55:51','2021-11-04 17:25:41'),(5,2,'222','xuesheng','学生','23ir0b7pbzxv9vivcztmu7ll72p3h584','2021-11-04 09:58:12','2021-11-04 17:23:04'),(6,5,'1122','xuesheng','学生','q578r4kf31nuzpsbsrbvqnbud9ozqroo','2021-11-04 15:35:31','2021-11-04 18:24:13'),(7,4,'321','xuesheng','学生','w1h9n4u49ngyjjwx6ypfg67y9bqze067','2021-11-04 16:20:17','2021-11-04 17:28:29'),(8,3,'123','xuesheng','学生','zenpjfzyztk1iphb4zt5yvu7hnzy213o','2021-11-04 16:20:26','2021-11-04 17:20:27');

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';

/*Data for the table `users` */

insert  into `users`(`id`,`username`,`password`,`role`,`addtime`) values (1,'admin','admin','管理员','2021-02-25 15:59:12');

/*Table structure for table `xuesheng` */

DROP TABLE IF EXISTS `xuesheng`;

CREATE TABLE `xuesheng` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(200) DEFAULT NULL COMMENT '账户',
  `password` varchar(200) DEFAULT NULL COMMENT '密码',
  `xuesheng_name` varchar(200) DEFAULT NULL COMMENT '学生姓名  Search111',
  `sex_types` int(11) DEFAULT NULL COMMENT '性别 Search111',
  `xuesheng_id_number` varchar(200) DEFAULT NULL COMMENT '身份证号',
  `xuesheng_phone` varchar(200) DEFAULT NULL COMMENT '手机号',
  `xuesheng_photo` varchar(200) DEFAULT NULL COMMENT '照片',
  `banji_types` int(11) DEFAULT NULL COMMENT '班级 Search111',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间 ',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='学生';

/*Data for the table `xuesheng` */

insert  into `xuesheng`(`id`,`username`,`password`,`xuesheng_name`,`sex_types`,`xuesheng_id_number`,`xuesheng_phone`,`xuesheng_photo`,`banji_types`,`create_time`) values (1,'111','123456','学生1',2,'410882200011211144','17785566941','http://localhost:8080/xuexixitong/upload/1635902815641.jpg',1,'2021-11-02 13:45:36'),(2,'222','123456','学生2',1,'410882199401010101','17785599621','http://localhost:8080/xuexixitong/upload/1635902801999.jpg',2,'2021-11-03 09:26:45'),(3,'123','123456','学生123',2,'410882189711211100','17785599680','http://localhost:8080/xuexixitong/upload/1635909638237.jpg',2,'2021-11-03 11:20:40'),(4,'321','123456','学生321',1,'410882198911111111','17785599641','http://localhost:8080/xuexixitong/upload/1635909717589.jpg',1,'2021-11-03 11:22:12'),(5,'1122','123456','学生12333333',1,'410882198911111133','17785599682','http://localhost:8080/xuexixitong/upload/1636011535580.jpg',1,'2021-11-04 15:35:23');

/*Table structure for table `xuexishipin` */

DROP TABLE IF EXISTS `xuexishipin`;

CREATE TABLE `xuexishipin` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `xuexishipin_name` varchar(200) DEFAULT NULL COMMENT '标题 Search111',
  `kecheng_types` int(11) DEFAULT NULL COMMENT '类型 Search111',
  `xuexishipin_photo` varchar(200) DEFAULT NULL COMMENT '图片',
  `xuexishipin_video` varchar(200) DEFAULT NULL COMMENT '视频',
  `xuexishipin_text` varchar(200) DEFAULT NULL COMMENT '详情',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间  show1 show2 photoShow',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='学习视频';

/*Data for the table `xuexishipin` */

insert  into `xuexishipin`(`id`,`xuexishipin_name`,`kecheng_types`,`xuexishipin_photo`,`xuexishipin_video`,`xuexishipin_text`,`create_time`) values (1,' 学习视频1',2,'http://localhost:8080/xuexixitong/upload/1635903281771.jpg','http://localhost:8080/xuexixitong/upload/1635903294557.mp4','1122334455667788','2021-11-03 09:35:02');

/*Table structure for table `xuexiziliao` */

DROP TABLE IF EXISTS `xuexiziliao`;

CREATE TABLE `xuexiziliao` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `xuexiziliao_name` varchar(200) DEFAULT NULL COMMENT '标题 Search111',
  `kecheng_types` int(11) DEFAULT NULL COMMENT '类型 Search111',
  `xuexiziliao_photo` varchar(200) DEFAULT NULL COMMENT '图片',
  `xuexiziliao_file` varchar(200) DEFAULT NULL COMMENT '学习文件',
  `xuexiziliao_text` varchar(200) DEFAULT NULL COMMENT '详情',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间  show1 show2 photoShow',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='学习资料';

/*Data for the table `xuexiziliao` */

insert  into `xuexiziliao`(`id`,`xuexiziliao_name`,`kecheng_types`,`xuexiziliao_photo`,`xuexiziliao_file`,`xuexiziliao_text`,`create_time`) values (1,'学习资料1',1,'http://localhost:8080/xuexixitong/upload/1635903416945.jpg','http://localhost:8080/xuexixitong/upload/1635903414763.jpg','123123','2021-11-03 09:37:00');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
