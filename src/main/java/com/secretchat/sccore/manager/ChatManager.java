package com.secretchat.sccore.manager;

import com.secretchat.sccore.entity.Chat;
import com.secretchat.sccore.exception.ResourceNotFoundException;
import com.secretchat.sccore.repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChatManager {

    @Autowired
    private ChatRepository chatRepository;

    public void createChat(String userIdOfRequestor, String userIdOfRequested){
        Chat chat = new Chat();
        chat.setUserId(userIdOfRequestor);
        chat.setIsDeleted(false);
        chatRepository.save(chat);

        Chat chatRequested = chat;
        chatRequested.setUserId(userIdOfRequested);
        chatRepository.save(chatRequested);

    }

    public void deleteChat(String chatID, String userId){
        Chat chat = chatRepository.findByChatIdAndUserId(chatID, userId);
        if(chat!=null){
            chat.setIsDeleted(true);
        }else
            throw new ResourceNotFoundException("Couldn't locate Chat with ID "+chatID);

    }

}
