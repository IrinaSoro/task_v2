package com.company;

public abstract class AbstractChannel implements Channel{
    private Filter filter;

    public AbstractChannel (Filter filter){
        this.filter = filter;
    }
    public void sendMessage (Message message){
        Message messageCopy = getFilter().filterAttachments(message.getAttachments());
        sendMessage(messageCopy);
    }

    protected Filter getFilter(Message message){
        return filter;
    }
}
