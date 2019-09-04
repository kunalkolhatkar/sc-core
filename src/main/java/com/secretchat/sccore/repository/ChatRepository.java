package com.secretchat.sccore.repository;

import com.secretchat.sccore.entity.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat, String> {

    Chat findByChatIdAndUserId(String chatId, String userId);
}
