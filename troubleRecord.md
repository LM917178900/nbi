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





