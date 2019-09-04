package com.secretchat.sccore.repository;

import com.secretchat.sccore.entity.UserConnectionLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserConnectionLogRepository extends JpaRepository<UserConnectionLog, String> {
}
