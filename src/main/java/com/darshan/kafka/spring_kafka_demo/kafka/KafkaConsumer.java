package com.darshan.kafka.spring_kafka_demo.kafka;


import com.darshan.kafka.spring_kafka_demo.model.User;
import com.darshan.kafka.spring_kafka_demo.util.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    private final Logger logger =
            LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = Constants.READ_USER_TOPIC, groupId = Constants.USER_GROUP)
    public void consume(User user) {
        logger.info(
                String.format("Consumed Message 1 -> %s", user));

    }
}