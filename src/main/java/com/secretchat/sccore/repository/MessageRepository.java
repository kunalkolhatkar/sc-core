package com.secretchat.sccore.repository;

import com.secretchat.sccore.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, String> {
}