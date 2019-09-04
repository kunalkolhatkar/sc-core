package com.secretchat.sccore.repository;

import com.secretchat.sccore.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, String> {
}