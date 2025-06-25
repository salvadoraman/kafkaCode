package com.delieveryapp.service;

import com.delieveryapp.config.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;


    public boolean updateLocation(String location)
    {
        this.kafkaTemplate.send(AppConstants.LOCATION_UPDATE_TOPIC,location);
        return true;
    }
}
