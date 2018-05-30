该项目工程是spring cloud微服务的一个简单示例。
集成了eureka, ribbon,feign, hystrix熔断器, zuul网关， sleuth zipkin 服务调用链跟踪,actuator 和turbine 聚合监控，和spring cloud config配置中心。 

工程结构介绍：

eureka-server：服务注册中心;

eureka-client: 服务示例，注册到服务注册中心;

eureka-feign-client: 集成feign 进行服务发现并远程调用，同时集成hystrix 熔断器;

eureka-ribbon-client: 集成ribbon进行服务发现并远程调用，同时集成hystrix 熔断器;

ribbon-client: 集成ribbon ,通过配置，不通过注册中心获取注册列表;

config-server: spring cloud config 配置中心;

config-client: spring cloud config 获取配置中心的示例;

eureka-monitor-client: 监控服务 集成了turbine。
