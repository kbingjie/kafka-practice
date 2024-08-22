package com.sherrykong.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

// This class is responsible for create topics
@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic catTopic () {
        return TopicBuilder.name("cat")
                .build();
    }
}
