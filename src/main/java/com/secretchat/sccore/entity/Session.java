package com.secretchat.sccore.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
public class Session {

    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private String sessionId;
    private String userId; //GuestId
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    public Session(){
        this.sessionId = UUID.randomUUID().toString();
    }
}
