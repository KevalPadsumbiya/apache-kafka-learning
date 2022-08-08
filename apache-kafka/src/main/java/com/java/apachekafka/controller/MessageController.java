package com.java.apachekafka.controller;

import com.java.apachekafka.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {

    @Autowired
    private KafkaProducer kafkaProducer;

    //http://localhost:8888/api/v1/kafka/publish?topic=test-apache-kafka-topic&message=Test message!
    @GetMapping("/publish")
    public ResponseEntity<String> publishMessageToKafkaTopic(@RequestParam("topic") String topic,@RequestParam("message") String message){
        kafkaProducer.publishMessage(topic,message);
        return ResponseEntity.ok("Message successfully published to topic!");
    }
}
