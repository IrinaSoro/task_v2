package com.company;
import lombok.Data;

import java.time.LocalTime;
import java.util.ArrayList;

@Data
public class Message {
private String sender_name;
private LocalTime time;
private String text;
private ArrayList<Attachments> attachments;
}
