package com.springrestapikafka.KafkaDemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class Producer {

    @Autowired
    KafkaTemplate<String, String> kafkaTemp;

    public void sendMsgtoTopic(String message){

        kafkaTemp.send("codeDecode_Topic",message);

    }


    
}
