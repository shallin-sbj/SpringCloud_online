getway-service 服务网关

通过zuul 形成链路追踪功能
zipkin-server      网关服务 
user-service       服务提供者
getway-service     调用服务

调用关系是：
getway-service  -》user-service   
通过zipkin-server  可以发现服务。

问题：链路追踪时，需要先调用服务提供者，然后在通过链路调用服务提供者，才能够正常显示。