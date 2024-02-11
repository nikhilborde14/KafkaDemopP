package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
	
	public static final String TOPIC = "samplekafka";
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemp;
	
	public void publishTopic(String message) {
		this.kafkaTemp.send(TOPIC, message);
	}

}
