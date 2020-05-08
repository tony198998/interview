Shiro
首先Shiro较之 Spring Security，Shiro在保持强大功能的同时，还在简单性和灵活性方面拥有巨大优势。

Shiro是一个强大而灵活的开源安全框架，能够非常清晰的处理认证、授权、管理会话以及密码加密。如下是它所具有的特点：

易于理解的 Java Security API；
简单的身份认证（登录），支持多种数据源（LDAP，JDBC，Kerberos，ActiveDirectory 等）；
对角色的简单的签权（访问控制），支持细粒度的签权；
支持一级缓存，以提升应用程序的性能；
内置的基于 POJO 企业会话管理，适用于 Web 以及非 Web 的环境；
异构客户端会话访问；
非常简单的加密 API；
不跟任何的框架或者容器捆绑，可以独立运行。
 

Spring Security
除了不能脱离Spring，shiro的功能它都有。
而且Spring Security对Oauth、OpenID也有支持,Shiro则需要自己手动实现。
Spring Security的权限细粒度更高（笔者还未发现高在哪里）。