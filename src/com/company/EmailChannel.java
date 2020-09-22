package com.company;

import lombok.Data;

@Data
public class EmailChannel implements Channel {

    private AttachmentType attachment;
    @Override
    public void sendMessage(Message message) {

    }

}
