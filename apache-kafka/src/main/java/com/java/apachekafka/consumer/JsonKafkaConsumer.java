package com.java.apachekafka.consumer;

import com.java.apachekafka.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JsonKafkaConsumer {

    @KafkaListener(topics = "${kafka.topic.name}",groupId = "${spring.kafka.consumer.group-id}")
    public void consumeMessage(User user){
        log.info("Json message consumed: {}",user.toString());
    }
}
