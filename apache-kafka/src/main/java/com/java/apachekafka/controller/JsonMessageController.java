package com.java.apachekafka.controller;

import com.java.apachekafka.model.User;
import com.java.apachekafka.producer.JsonKafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

    @Value("${kafka.topic.name}")
    private String kafkaTopic;

    @Autowired
    private JsonKafkaProducer jsonKafkaProducer;

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user){
        jsonKafkaProducer.publishMessage(kafkaTopic,user);
        return ResponseEntity.ok("Json message successfully published!");
    }
}
