## 构建多模块项目(同 npi 系统)
#### 1. 项目结构
项目名称nbi-portal-server

包含三个模块：common-platform/portal/data-center

##### common-platform：
包结构：com.only.nbi.platform
系统结构：common
包含包: model/util/vo/...

##### portal:
包结构：com.only.nbi
系统结构：portal.module.module_name_xxx
包含包：controller/service/model/util/vo/domain/mapper...

##### data-center
包结构：com.only.nbi
系统结构：auth.center
包含包：controller/service/model/util/vo/domain/mapper...

#### 2.需要实现的基本功能：
新建系统：V
新建模块： V
新建包： V
配置数据库： V
调试数据库：V
跨模块调用：V
全量打包maven配置：V (nbi-server-execute.jar)
增量打包maven配置：V (nbi-server-assembly.zip + nbi-server.jar)
保存到 github: V
发布到内网服务器maven仓库：(需要注册一个mvn账户) X
项目被其他项目依赖： V

#### 3. 其他非关键功能
配置 sql 日志打印；
配置 重启后编译修改的文件；

配置直接 URL 接口调用
配置 restApi 接口调用
配置 nacos 接口调用
配置 feign 接口调用



