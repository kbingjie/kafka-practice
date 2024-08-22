package com.sherrykong.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "cat", groupId = "groupId-111")
    void listener (String data) {
        System.out.println("Listner received:" + data );

    }
}
