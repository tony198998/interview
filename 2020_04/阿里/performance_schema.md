1、.查看数据库知否支持INFORMATION_SCHEMA引擎:
select * from information_schema.engines where engine='performance_schema';
 
2、查看性能是否开启：
show variables like 'performance_schema';  

3、关于SQL维度的统计信息主要集中在events_statements_summary_by_digest表中，
通过将SQL语句抽象出digest，
可以统计某类SQL语句在各个维度的统计信息“

4、哪个SQL执行最多：
SELECT SCHEMA_NAME,DIGEST_TEXT,COUNT_STAR,SUM_ROWS_SENT,SUM_ROWS_EXAMINED,FIRST_SEEN,LAST_SEEN 
FROM events_statements_summary_by_digest ORDER BY COUNT_STAR desc LIMIT 1

5、哪个SQL平均响应时间最多：
  SELECT SCHEMA_NAME,DIGEST_TEXT,COUNT_STAR,AVG_TIMER_WAIT,
  SUM_ROWS_SENT,SUM_ROWS_EXAMINED,FIRST_SEEN,LAST_SEEN FROM events_statements_summary_by_digest ORDER BY
   AVG_TIMER_WAIT desc LIMIT 1
