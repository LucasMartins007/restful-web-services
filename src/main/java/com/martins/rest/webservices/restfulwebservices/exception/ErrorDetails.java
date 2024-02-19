package com.martins.rest.webservices.restfulwebservices.exception;

import java.time.LocalDateTime;
import java.util.List;

public class ErrorDetails {

    private LocalDateTime timestamp;

    private List<String> messages;

    private String details;

    public ErrorDetails(LocalDateTime timestamp, List<String> messages, String details) {
        this.timestamp = timestamp;
        this.messages = messages;
        this.details = details;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
