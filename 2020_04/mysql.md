
Access数据库，mysql和oracle的不支持【可不管】
二二、oracle中 rownum与rowid的理解，一千条记录我查200到300的记录怎么查？ (Access数据库，mysql和oracle的不支持)
答：详见：链接
如何查200到300行的记录，可以通过top关键字辅助：
select top 100 * from table where id is not in (select top 200 id from table);
查询n到m行记录的通用公式：select top m * from table where id is not in (select top n * from table)