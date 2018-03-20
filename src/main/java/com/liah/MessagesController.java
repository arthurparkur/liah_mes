package com.liah;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessagesController {
    @MessageMapping("/auth")
    @SendTo("/client")
    public Message auth(Message smessage) throws InterruptedException {
        System.out.println(smessage.getType());
        System.out.println(smessage.getMessageContent());
        Thread.sleep(1000);
        return new Message("auth", "Hello, " + smessage.getMessageContent() + "!");
    }

    /*@MessageMapping("/auth")
    @SendTo("/client")
    public Greeting greeting(Message message) throws Exception {
        Thread.sleep(1000);
        System.out.println(message.getContent());
        return new Greeting("Hello, " + message.getContent() + "!");
    }*/
}

