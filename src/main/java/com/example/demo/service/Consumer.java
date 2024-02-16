package com.example.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	@KafkaListener(topics="samplekafka",groupId="sampleabc")
	public void consumeMessage(String message) {
		System.out.println("Consumed Message from P"+ message);
		System.out.println( message);
		
		
	}

}
