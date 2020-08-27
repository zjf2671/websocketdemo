## WebSocket通信 学习项目
`1、所用技术`

    springboot2.1.4 + WebSocket + freemark实现简单的通信
    
`2、客户端连接测试`

    访问 http://localhost:8080/testdemo/im/20
    点击"开启socket"
    在console上能看到连接成功

`3、后台推送消息测试`

    http://localhost:8080/testdemo/pushListToWeb?cid=20&message=444444
    在客户端浏览器console上能看到消息
    
`4、注意点`
    
    websocket上下文是跟着 server.servlet.context-path 走的
    