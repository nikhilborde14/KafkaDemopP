package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Consumer;
import com.example.demo.service.Producer;

@RestController
@RequestMapping("/kafkaapp")
public class KafkaController {
	
	@Autowired
	Producer producer;
	@Autowired
	Consumer consumer;
	
	@PostMapping(value="/publish")
	public void sendMessageToTopic(@RequestParam("message") String message) {
		producer.publishTopic(message);
		
	}
	
	@GetMapping(value="/get")
	public String getMessagefromTopic() {
		 return "Welcome Hello";
		
	}
	

}
