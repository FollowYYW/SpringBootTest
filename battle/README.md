#项目结构
battle<br>
&nbsp;&nbsp; --api &nbsp;&nbsp; 对外接口模块<br> 
&nbsp;&nbsp; --auth &nbsp;&nbsp; 权限模块<br>
&nbsp;&nbsp; --battlestart &nbsp;&nbsp; 父项目启动模块<br>
&nbsp;&nbsp; --common &nbsp;&nbsp; 公共工具服务模块<br>
&nbsp;&nbsp; --data-source &nbsp;&nbsp; 数据源模块<br>
&nbsp;&nbsp; --gateway &nbsp;&nbsp; 网关模块<br>
&nbsp;&nbsp; --serve &nbsp;&nbsp; 业务模块<br>
&nbsp;&nbsp;&nbsp;&nbsp; --battle-system 系统业务模块<br>
&nbsp;&nbsp;&nbsp;&nbsp; --battle-user 业务用户模块<br>
----

##已完成集成组件与实现功能
+ 对外接口模块
+ gateway网关模块
+ common redis 集成
+ MySQL 集成
+ feign 集成
+ Nacos 集成

##待完成组件与功能
+ rocketMQ
+ 鉴权(接口鉴权+用户鉴权)
+ 过滤器
+ 全局异常定义与捕获(状态码定义)
+ swagger 
+ 安全服务
+ 服务监控降级 Sentinel
+ 分布式事务 Seata
+ 邮件+短信 服务
+ 调度服务(定时+实时)

----
#服务介绍