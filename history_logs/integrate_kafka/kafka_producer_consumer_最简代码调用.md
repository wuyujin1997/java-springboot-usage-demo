
```java
// 生产者，发送消息到kafka
@Component
class MyselfKafkaProducer {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    public void sendMessage(String topic, String message) {
        kafkaTemplate.send(topic, message);
    }
}

// 消费者，从kafka读取消息
@Component
class MyselfKafkaConsumer {
    @KafkaListener(topics = {"test-topic-name"})
    public void receiveMessage(String message) {
        System.out.println("message: " + message);
    }
}
```

发送消息之后如何知道消息是否发送成功？

```java
@Slf4j
@Component
public class KafkaSendResultHandler implements ProducerListener {
    @Override
    public void onSuccess(ProducerRecord producerRecord, RecordMetadata recordMetadata) {
        log.info("kafka消息发送成功 {} {}", producerRecord, recordMetadata);
    }
    @Override
    public void onError(ProducerRecord producerRecord, RecordMetadata recordMetadata, Exception exception) {
        log.error("kafka消息发送失败 {} {} {}", producerRecord, recordMetadata, exception);
    }
}
```