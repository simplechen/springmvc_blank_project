springmvc_blank_project
=======================

spring mvc blank project

eclipse-j2ee v3.7.2 maven-v3.0.4

1. 修改编码为UTF-8
在项目名blank-web上右击打开 Properties 选择Resource 选择utf-8

2. 转换项目为J2EE项目
2.1 在项目名blank-web上右击打开 Properties 选择Project Facets->Convert to faceted form...
2.2 选择Dynamic web module (默认为3.0)
2.3 点击Apply->ok

3. 添加webapp 及 maven依赖包
3.1 在项目名blank-web上右击打开 Properties 这时会看到左侧多出一个Deployment assembly 并点击中
3.2 删除src/test/java src/test/resources webcontent 然后点击add... 在弹窗中选择 Folder src->main->webapp
3.3 点击Add... 选择Maven dep...
3.4 点击apply->ok


4.创建Server ->tomcat7

5. 验收查看
http://localhost:8080/blank-web/index