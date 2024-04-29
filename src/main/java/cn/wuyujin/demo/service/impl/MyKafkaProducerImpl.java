package cn.wuyujin.demo.service.impl;

import cn.wuyujin.demo.bean.constant.MyConstants;
import cn.wuyujin.demo.service.MyKafkaProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.concurrent.ExecutionException;


@Slf4j
@Service
public class MyKafkaProducerImpl implements MyKafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void sendStringMessage(String data) {
        String topic = MyConstants.KAFKA_TOPIC_YUJIN_DEMO_01;
        // 这个 topic 即使还不存在，library也会自动帮忙创建。
        // kafkaTemplate.setProducerListener(producerListenerImpl);
        ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send(topic, data);
        try {
            SendResult<String, String> sendResult = future.get();
            log.info("sendResult {}", sendResult);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    @KafkaListener(id = "listener_id_01", topics = MyConstants.KAFKA_TOPIC_YUJIN_DEMO_01)
    public void listen(String inputMessage) {
        log.info("监听器从kakfa读取到新消息： {}", inputMessage);
    }

}