package com.secretchat.sccore.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
@IdClass(ChatID.class)
public class Chat {
    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private String chatId;
    @Id
    private String userId;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date deleted;
    private Boolean isDeleted = true;

    public Chat(){
        this.chatId = UUID.randomUUID().toString();
    }

}

class ChatID implements Serializable{

    private String chatId;
    private String userId;

}