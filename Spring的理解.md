## Spring的理解

### IOC&DI
- IOC(控制反转Inversion Of Control)意思是由原来new创建对象，改为spring反射创建对象
- DI的意思是拿到的依赖对象，已经由spring通过setter处理过了
### Bean的配置
- 通过xml配置创建bean/通过注解配置创建bean
- 通过xml声明依赖/通过注解声明依赖
### AOP
- 项目逻辑分为主业务逻辑和辅助业务逻辑，辅助业务逻辑就叫做切面，主业务逻辑就叫做切点
- 在配置中将切面和切点关联起来，就叫做面向切面编程
- 可以通过xml/注解配置AOP
- AOP使用的是代理模式
### 注意事项
- 如果报找不到类，可能是包扫描未配置
- 如果创建bean失败，可能是依赖bean命名错误
