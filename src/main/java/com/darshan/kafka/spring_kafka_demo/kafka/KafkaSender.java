package com.darshan.kafka.spring_kafka_demo.kafka;

import com.darshan.kafka.spring_kafka_demo.model.User;
import com.darshan.kafka.spring_kafka_demo.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    public void send(User user) {
        try {
//            kafkaTemplate.send(new ProducerRecord<>(Constants.READ_USER_TOPIC, "", user));
            kafkaTemplate.send(Constants.READ_USER_TOPIC, user);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}