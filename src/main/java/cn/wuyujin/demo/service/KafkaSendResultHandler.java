package cn.wuyujin.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.kafka.support.ProducerListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaSendResultHandler implements ProducerListener {

    /**
     * @param producerRecord ProducerRecord(topic=topic_yujin_demo_01, partition=null, headers=RecordHeaders(headers = [], isReadOnly = true), key=null, value=测试第三条消息, timestamp=null)
     * @param recordMetadata topic_yujin_demo_01-0@3
     */
    @Override
    public void onSuccess(ProducerRecord producerRecord, RecordMetadata recordMetadata) {
        log.info("kafka消息发送成功 {} {}", producerRecord, recordMetadata);
    }

    /**
     * @param producerRecord ProducerRecord(topic=topic_yujin_demo_01, partition=null, headers=RecordHeaders(headers = [], isReadOnly = false), key=null, value=yujin_hello, timestamp=null)
     * @param recordMetadata topic_yujin_demo_01--1@-1
     * @param exception org.apache.kafka.common.errors.TimeoutException: Topic topic_yujin_demo_01 not present in metadata after 60000 ms.
     */
    @Override
    public void onError(ProducerRecord producerRecord, RecordMetadata recordMetadata, Exception exception) {
        log.error("kafka消息发送失败 {} {} {}", producerRecord, recordMetadata, exception);
    }

}
