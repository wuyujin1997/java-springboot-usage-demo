
三部分：
1. 从启动程序之后，Consumer 就一直报错（只要有 KafkaListener 标注的 consumer）
2. 调用过哪怕一次 kafkaTemplate.sendXxx API 之后， Producer 也报错。
3. ProducerListener 的实现类的 onError 方法被执行。

```log

2024-04-29 23:54:57.837  INFO 44528 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Node -1 disconnected.
2024-04-29 23:54:57.838  WARN 44528 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Connection to node -1 (localhost/127.0.0.1:9092) could not be established. Broker may not be available.
2024-04-29 23:54:57.841  WARN 44528 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Bootstrap broker localhost:9092 (id: -1 rack: null) disconnected

2024-04-29 23:54:58.623  INFO 44528 --- [ner_id_01-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-listener_id_01-1, groupId=listener_id_01] Node -1 disconnected.
2024-04-29 23:54:58.625  WARN 44528 --- [ner_id_01-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-listener_id_01-1, groupId=listener_id_01] Connection to node -1 (localhost/127.0.0.1:9092) could not be established. Broker may not be available.
2024-04-29 23:54:58.625  WARN 44528 --- [ner_id_01-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-listener_id_01-1, groupId=listener_id_01] Bootstrap broker localhost:9092 (id: -1 rack: null) disconnected

2024-04-29 23:54:58.720  INFO 44528 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Node -1 disconnected.
2024-04-29 23:54:58.721  WARN 44528 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Connection to node -1 (localhost/127.0.0.1:9092) could not be established. Broker may not be available.
2024-04-29 23:54:58.721  WARN 44528 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Bootstrap broker localhost:9092 (id: -1 rack: null) disconnected

2024-04-29 23:54:59.549  INFO 44528 --- [ner_id_01-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-listener_id_01-1, groupId=listener_id_01] Node -1 disconnected.
2024-04-29 23:54:59.550  WARN 44528 --- [ner_id_01-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-listener_id_01-1, groupId=listener_id_01] Connection to node -1 (localhost/127.0.0.1:9092) could not be established. Broker may not be available.
2024-04-29 23:54:59.550  WARN 44528 --- [ner_id_01-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-listener_id_01-1, groupId=listener_id_01] Bootstrap broker localhost:9092 (id: -1 rack: null) disconnected

2024-04-29 23:54:59.803  INFO 44528 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Node -1 disconnected.
2024-04-29 23:54:59.804  WARN 44528 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Connection to node -1 (localhost/127.0.0.1:9092) could not be established. Broker may not be available.
2024-04-29 23:54:59.804  WARN 44528 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Bootstrap broker localhost:9092 (id: -1 rack: null) disconnected

2024-04-29 23:54:59.956 ERROR 44528 --- [nio-8888-exec-1] c.w.demo.service.KafkaSendResultHandler  : kafka消息发送失败 ProducerRecord(topic=topic_yujin_demo_01, partition=null, headers=RecordHeaders(headers = [], isReadOnly = false), key=null, value=测试第三条消息, timestamp=null) topic_yujin_demo_01--1@-1 {}

org.apache.kafka.common.errors.TimeoutException: Topic topic_yujin_demo_01 not present in metadata after 60000 ms.

2024-04-29 23:54:59.987 ERROR 44528 --- [nio-8888-exec-1] o.a.c.c.C.[.[.[.[dispatcherServlet]      : Servlet.service() for servlet [dispatcherServlet] in context with path [/wuyujin] threw exception [Request processing failed; nested exception is org.springframework.kafka.KafkaException: Send failed; nested exception is org.apache.kafka.common.errors.TimeoutException: Topic topic_yujin_demo_01 not present in metadata after 60000 ms.] with root cause

org.apache.kafka.common.errors.TimeoutException: Topic topic_yujin_demo_01 not present in metadata after 60000 ms.


2024-04-29 23:55:00.428  INFO 44528 --- [ner_id_01-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-listener_id_01-1, groupId=listener_id_01] Node -1 disconnected.
2024-04-29 23:55:00.430  WARN 44528 --- [ner_id_01-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-listener_id_01-1, groupId=listener_id_01] Connection to node -1 (localhost/127.0.0.1:9092) could not be established. Broker may not be available.
2024-04-29 23:55:00.431  WARN 44528 --- [ner_id_01-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-listener_id_01-1, groupId=listener_id_01] Bootstrap broker localhost:9092 (id: -1 rack: null) disconnected

2024-04-29 23:55:00.883  INFO 44528 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Node -1 disconnected.
2024-04-29 23:55:00.885  WARN 44528 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Connection to node -1 (localhost/127.0.0.1:9092) could not be established. Broker may not be available.
2024-04-29 23:55:00.885  WARN 44528 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Bootstrap broker localhost:9092 (id: -1 rack: null) disconnected

2024-04-29 23:55:01.299  INFO 44528 --- [ner_id_01-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-listener_id_01-1, groupId=listener_id_01] Node -1 disconnected.
2024-04-29 23:55:01.301  WARN 44528 --- [ner_id_01-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-listener_id_01-1, groupId=listener_id_01] Connection to node -1 (localhost/127.0.0.1:9092) could not be established. Broker may not be available.
2024-04-29 23:55:01.302  WARN 44528 --- [ner_id_01-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-listener_id_01-1, groupId=listener_id_01] Bootstrap broker localhost:9092 (id: -1 rack: null) disconnected

2024-04-29 23:55:01.862  INFO 44528 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Node -1 disconnected.
2024-04-29 23:55:01.870  WARN 44528 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Connection to node -1 (localhost/127.0.0.1:9092) could not be established. Broker may not be available.
2024-04-29 23:55:01.871  WARN 44528 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Bootstrap broker localhost:9092 (id: -1 rack: null) disconnected

2024-04-29 23:55:02.484  INFO 44528 --- [ner_id_01-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-listener_id_01-1, groupId=listener_id_01] Node -1 disconnected.
2024-04-29 23:55:02.485  WARN 44528 --- [ner_id_01-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-listener_id_01-1, groupId=listener_id_01] Connection to node -1 (localhost/127.0.0.1:9092) could not be established. Broker may not be available.
2024-04-29 23:55:02.485  WARN 44528 --- [ner_id_01-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-listener_id_01-1, groupId=listener_id_01] Bootstrap broker localhost:9092 (id: -1 rack: null) disconnected

```