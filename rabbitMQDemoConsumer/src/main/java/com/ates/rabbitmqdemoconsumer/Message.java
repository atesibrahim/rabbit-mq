package com.ates.rabbitmqdemoconsumer;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class Message implements Serializable {
    private String text;
}
