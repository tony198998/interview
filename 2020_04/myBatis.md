1、因为使用#{},mybatis使用connection.prepareStatement("select * from ?"),
把表名作为参数提交给数据库，而数据库不支持这种方式。

而使用${},mybatis是字符串拼专接，也就是connection.prepareStatement("select * from tabName"),
这是正常写法。

所以本质上是数据库不支持