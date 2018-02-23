

----mysql
CREATE TABLE sales_fact_sample (
  PRODUCT_ID int(11) ,
  TIME_ID int(11) ,
  CUSTOMER_ID int(11) ,
  PROMOTION_ID int(11) ,
  STORE_ID int(11) ,
  STORE_SALES decimal(10,4) ,
  STORE_COST decimal(10,4) ,
  UNIT_SALES decimal(10,4) ,
  rand double  DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8

----hive new
CREATE TABLE if not exists hellodb.sales_fact_sample_hdata (
  PRODUCT_ID bigint ,
  TIME_ID bigint ,
  CUSTOMER_ID bigint ,
  PROMOTION_ID bigint ,
  STORE_ID bigint ,
  STORE_SALES decimal(10,4)  comment '销售金额',
  STORE_COST decimal(10,4) comment '销售成本',
  UNIT_SALES decimal(10,4) comment '单品销量'
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n'
STORED AS TEXTFILE;


----hive old
CREATE TABLE if not exists hellodb.sales_fact_sample (
  PRODUCT_ID bigint ,
  TIME_ID bigint ,
  CUSTOMER_ID bigint ,
  PROMOTION_ID bigint ,
  STORE_ID bigint ,
  STORE_SALES decimal(10,4)  comment '销售金额',
  STORE_COST decimal(10,4) comment '销售成本',
  UNIT_SALES decimal(10,4) comment '单品销量',
  rand double
)
