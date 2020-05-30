CREATE TABLE `t_product_info` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `channel_id` bigint(20) DEFAULT NULL COMMENT '所属栏目id',
  `product_name` varchar(100) NOT NULL DEFAULT '' COMMENT '物品名称',
  `third_goods_id` varchar(100) NOT NULL DEFAULT '' COMMENT '三方商品id',
  `unit` varchar(50) NOT NULL DEFAULT '' COMMENT '单位',
  `product_desc` varchar(50) NOT NULL DEFAULT '' COMMENT '规格描述',
  `trademark` varchar(50) NOT NULL DEFAULT '' COMMENT '品牌',
  `barcode` varchar(50) NOT NULL DEFAULT '' COMMENT '条形码',
  `shelf_life` varchar(50) NOT NULL DEFAULT '' COMMENT '保质期',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_product_price` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `pid` bigint(20) NOT NULL COMMENT '商品id',
  `taxation` decimal(10,2) NULL DEFAULT 0 COMMENT '税费',
  `price` decimal(10,2) NULL DEFAULT 0 COMMENT '商品价格（含税）',
  `last_price` decimal(10,2) NULL DEFAULT 0 COMMENT '上次价格（数据更新前价格）',
  `single_price` decimal(10,2) NULL DEFAULT 0 COMMENT '商品单价',
  `validity_period` varchar(50) NOT NULL DEFAULT '' COMMENT '效期',
  `spec` varchar(50) NOT NULL DEFAULT '' COMMENT '规格',
  `refresh_query` varchar(1000) NOT NULL DEFAULT '' COMMENT '价格更新参数',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `t_third_goods_info` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `pid` bigint(20) NOT NULL COMMENT '商品id',
  `third_platform` varchar(100) NOT NULL DEFAULT '' COMMENT '所属平台',
  `link_href` varchar(200) NOT NULL DEFAULT '' COMMENT '目标地址',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;