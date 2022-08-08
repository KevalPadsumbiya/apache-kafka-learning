package com.java.apachekafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "${kafka.topic.name}",groupId = "${spring.kafka.consumer.group-id}")
    public void consumeMessage(String message){
        log.info("Message consumed: {}",message);
    }
}
