package com.java.apachekafka.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public void publishMessage(String topic,String message){
        kafkaTemplate.send(topic,message);
        log.info("Message: {} published to topic: {}",message,topic);
    }
}
