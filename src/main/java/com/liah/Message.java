package com.liah;

public class Message {

    private String type;
    private String messageContent;

    public Message() {}

    public Message(String type, String messageContent) {
        this.type = type;
        this.messageContent = messageContent;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void getContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getType() {
        return type;
    }
}
