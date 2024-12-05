package com.darshan.kafka.spring_kafka_demo.controller;

import com.darshan.kafka.spring_kafka_demo.model.User;
import com.darshan.kafka.spring_kafka_demo.kafka.KafkaSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    @Autowired
    KafkaSender kafkaSender;

    @PostMapping(value = "/producer")
    public String producer(@RequestBody User user){
        System.out.println("user info : "+user);
        kafkaSender.send(user);
        return "Message sent to the Kafka Topic java_in_use_topic Successfully";
    }

    @GetMapping(value = "/test")
    public  String test(){
        return "test";
    }

}