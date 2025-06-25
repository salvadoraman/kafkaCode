package com.delieveryapp.controller;

import com.delieveryapp.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class KafkaProducerController {

    @Autowired
    private KafkaProducerService producerService;
    @PostMapping("/update")
    public ResponseEntity<?> updateLocation()
    {
        producerService.updateLocation("("+Math.random()*100+")");
        return new ResponseEntity<>(Map.of("message","locationUpdated"), HttpStatus.OK);
    }
}
