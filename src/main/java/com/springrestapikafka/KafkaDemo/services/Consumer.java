package com.springrestapikafka.KafkaDemo.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "codeDecode_Topic",groupId = "codedecodegroup")
    public void listenToTopic(String rcvdMsg)
    {
        System.out.println("The messager received is" + rcvdMsg);
    }
    
}
