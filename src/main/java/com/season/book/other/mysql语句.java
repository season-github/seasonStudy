package com.season.book.other;select GROUP_CONCAT(column_name) from information_schema.columns where table_name='user' and table_schema='test';

SELECT UNIX_TIMESTAMP('2014-03-23 10:10:40')��
SELECT FROM_UNIXTIME( 1388776825, '%Y-%m-%d %H:%m:%s');
select FROM_UNIXTIME( createtime/1000, '%Y-%m-%d %H:%m:%s') from hh_user_referee;


ALTER TABLE `hh_user`
ADD INDEX `hh_user_openid` (`openid`) USING BTREE ;

update payment_record t set t.patient_name =  (select p.cname from patient p where t.patient_id = p.id);

update payment_record t set t.chan_trade_no =  (select p.chan_trade_no from trade_order_record p where t.trade_no = p.trade_no);
