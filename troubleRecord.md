1. boot fail
错误: 找不到或无法加载主类 com.only.nbi.NbiApplication
解决办法：<resources> 重新配置
2. clean fail
'build.resources.resource.directory' is missing.
解决办法：<resources> 重新配置

3. api fail
测试接口代码没有问题，但是无法调通
解决办法：mnv clean install

4. 为啥有且只有一个模块保留(Application/resource/)
Application 和resource 需要放置的层级结构，决定了application 需要保留到某一个模块中，且只保留一个利于管理
5. 为啥每个模块保留（pom.xml）
maven 的pom.xml 用于编译生成运行、测试用的class 文件，所以每个模块必须有

6. A component required a bean of type 'com.only.nbi.portal.module.alfa.mapper.AlfaMapper' that could not be found.
启动类添加注解 @MapperScan({"com.only.nbi.**.mapper"})


7. Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.
Reason: Failed to determine a suitable driver class
原因：resources 包没有被编译到target
子模块 resources 需要单独配置，不能继承；
注意配置类型 <include>**/*.yml</include>

8.跨模块api:mvn clean install failed
Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project data-center: Compilation failure: Compilation failure:
程序包com.only.nbi.platform.common.model不存在
原因：spring-boot-maven-plugin 用这个插件打包的Jar包可以直接运行，但是不可依赖
每个插件修改为如下配置：
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <classifier>execute</classifier>
                </configuration>
                <executions>
                    <execution>
                        <phase>none</phase>
                        <goals>
                            <goal>repackage</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>

9.feign 消费者启动失败
java.lang.NoClassDefFoundError: org/springframework/cloud/context/named/NamedContextFactory$Specification
缓存问题，重新编译

10.feign 服务者启动失败
java.lang.NoClassDefFoundError: org/springframework/boot/bind/RelaxedDataBinder
此依赖导致：
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-netflix-core</artifactId>
            <version>1.4.7.RELEASE</version>
        </dependency>
更换包，只在client-pom 添加依赖

11.引入的 feign 类 报红；
依赖的 jar 包有问题，可以引入其他项目的 jar 验证；
jar包中存在BOOT-INF目录，导致无法被依赖；

12. 打的包没有被成功安装；
添加打包配置（assembly.xml/upgrade-assembly.xml）





