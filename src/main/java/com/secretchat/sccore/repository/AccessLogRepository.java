package com.secretchat.sccore.repository;

import com.secretchat.sccore.entity.AccessLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccessLogRepository extends JpaRepository<AccessLog, String> {
}
