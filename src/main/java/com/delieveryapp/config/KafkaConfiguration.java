package com.delieveryapp.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfiguration {

    @Bean
    public NewTopic topic()
    {
        return TopicBuilder
                .name("locations_updates")
              //  .partitions()
              //  .replicas()
                .build();

    }
}
