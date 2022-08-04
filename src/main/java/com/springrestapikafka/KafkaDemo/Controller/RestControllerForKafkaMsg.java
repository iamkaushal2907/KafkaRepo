package com.springrestapikafka.KafkaDemo.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springrestapikafka.KafkaDemo.services.Producer;

@RestController
@RequestMapping("rest/api")
public class RestControllerForKafkaMsg {

@Autowired
Producer produce;

@GetMapping("/producerMsg")
public void getMessageFromClient(@RequestParam("message") String message){

    produce.sendMsgtoTopic(message);

}
    
}
