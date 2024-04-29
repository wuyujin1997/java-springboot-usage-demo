
```log

2024-04-30 00:10:20.206  INFO 45353 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Node -1 disconnected.
2024-04-30 00:10:20.207  WARN 45353 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Connection to node -1 (localhost/127.0.0.1:9092) could not be established. Broker may not be available.
2024-04-30 00:10:20.207  WARN 45353 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Bootstrap broker localhost:9092 (id: -1 rack: null) disconnected

2024-04-30 00:10:20.218  INFO 45353 --- [ner_id_01-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-listener_id_01-1, groupId=listener_id_01] Node -1 disconnected.
2024-04-30 00:10:20.220  WARN 45353 --- [ner_id_01-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-listener_id_01-1, groupId=listener_id_01] Connection to node -1 (localhost/127.0.0.1:9092) could not be established. Broker may not be available.
2024-04-30 00:10:20.221  WARN 45353 --- [ner_id_01-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-listener_id_01-1, groupId=listener_id_01] Bootstrap broker localhost:9092 (id: -1 rack: null) disconnected

2024-04-30 00:10:21.135  INFO 45353 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Node -1 disconnected.
2024-04-30 00:10:21.136  WARN 45353 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Connection to node -1 (localhost/127.0.0.1:9092) could not be established. Broker may not be available.
2024-04-30 00:10:21.136  WARN 45353 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Bootstrap broker localhost:9092 (id: -1 rack: null) disconnected

2024-04-30 00:10:21.140  INFO 45353 --- [ner_id_01-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-listener_id_01-1, groupId=listener_id_01] Node -1 disconnected.
2024-04-30 00:10:21.140  WARN 45353 --- [ner_id_01-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-listener_id_01-1, groupId=listener_id_01] Connection to node -1 (localhost/127.0.0.1:9092) could not be established. Broker may not be available.
2024-04-30 00:10:21.140  WARN 45353 --- [ner_id_01-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-listener_id_01-1, groupId=listener_id_01] Bootstrap broker localhost:9092 (id: -1 rack: null) disconnected
2024-04-30 00:10:22.534  WARN 45353 --- [ner_id_01-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-listener_id_01-1, groupId=listener_id_01] Error while fetching metadata with correlation id 2 : {topic_yujin_demo_01=UNKNOWN_TOPIC_OR_PARTITION}
2024-04-30 00:10:22.538  INFO 45353 --- [ner_id_01-0-C-1] org.apache.kafka.clients.Metadata        : [Consumer clientId=consumer-listener_id_01-1, groupId=listener_id_01] Cluster ID: u_7FU6jATFi06Pczr4EfGA

2024-04-30 00:10:22.568  WARN 45353 --- [ad | producer-1] org.apache.kafka.clients.NetworkClient   : [Producer clientId=producer-1] Error while fetching metadata with correlation id 1 : {topic_yujin_demo_01=LEADER_NOT_AVAILABLE}
2024-04-30 00:10:22.569  INFO 45353 --- [ad | producer-1] org.apache.kafka.clients.Metadata        : [Producer clientId=producer-1] Cluster ID: u_7FU6jATFi06Pczr4EfGA

2024-04-30 00:10:22.574  INFO 45353 --- [ner_id_01-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-listener_id_01-1, groupId=listener_id_01] Discovered group coordinator localhost:9092 (id: 2147483647 rack: null)
2024-04-30 00:10:22.580  INFO 45353 --- [ner_id_01-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-listener_id_01-1, groupId=listener_id_01] (Re-)joining group

2024-04-30 00:10:22.619  INFO 45353 --- [ad | producer-1] o.a.k.c.p.internals.TransactionManager   : [Producer clientId=producer-1] ProducerId set to 1000 with epoch 0

2024-04-30 00:10:22.628  INFO 45353 --- [ner_id_01-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-listener_id_01-1, groupId=listener_id_01] Request joining group due to: need to re-join with the given member-id
2024-04-30 00:10:22.629  INFO 45353 --- [ner_id_01-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-listener_id_01-1, groupId=listener_id_01] (Re-)joining group
2024-04-30 00:10:22.634  INFO 45353 --- [ner_id_01-0-C-1] org.apache.kafka.clients.Metadata        : [Consumer clientId=consumer-listener_id_01-1, groupId=listener_id_01] Resetting the last seen epoch of partition topic_yujin_demo_01-0 to 0 since the associated topicId changed from null to _iY6wvG6TdOWjKqGlHerrQ

2024-04-30 00:10:22.689  INFO 45353 --- [ad | producer-1] org.apache.kafka.clients.Metadata        : [Producer clientId=producer-1] Resetting the last seen epoch of partition topic_yujin_demo_01-0 to 0 since the associated topicId changed from null to _iY6wvG6TdOWjKqGlHerrQ


2024-04-30 00:10:22.827  INFO 45353 --- [ad | producer-1] c.w.demo.service.KafkaSendResultHandler  : kafka消息发送成功 ProducerRecord(topic=topic_yujin_demo_01, partition=null, headers=RecordHeaders(headers = [], isReadOnly = true), key=null, value=asdsads, timestamp=null) topic_yujin_demo_01-0@5

```