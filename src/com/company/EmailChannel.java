package com.company;

import lombok.Data;

@Data
public class EmailChannel extends AbstractChannel {


    private AttachmentType attachment;
    @Override
    public void sendMessage(Message message) {

    }

}
