package com.ates.rabbitmqdemopublisher;

import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@ToString
public class Message implements Serializable {
    private String text;
}
