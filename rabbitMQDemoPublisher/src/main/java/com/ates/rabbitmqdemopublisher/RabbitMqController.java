package com.ates.rabbitmqdemopublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/testrabbitmq")
public class RabbitMqController {

    @Autowired
    private QueueSender queueSender;

    @PostMapping
    public String send(@RequestBody Message message){
        queueSender.send(message);
        return "ok. done";
    }

}
