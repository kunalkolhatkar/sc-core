package com.secretchat.sccore.manager;

import com.secretchat.sccore.entity.Message;
import com.secretchat.sccore.repository.MessageRepository;
import org.springframework.stereotype.Component;

@Component
public class MessageManager {

    private MessageRepository messageRepository;

    public void sendMessage(String userId, String message, String chatId){
        Message messageObj = new Message();
        messageObj.setChatId(chatId);
        messageObj.setUserId(userId);
        messageObj.setMessage(message.getBytes());

        messageRepository.save(messageObj);
    }
}
