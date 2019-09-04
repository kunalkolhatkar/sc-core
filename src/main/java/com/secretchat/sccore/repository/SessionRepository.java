package com.secretchat.sccore.repository;

import com.secretchat.sccore.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, String> {
}