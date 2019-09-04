package com.secretchat.sccore.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
public class Message {

    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private String messageId;
    private String userId;
    private String chatId;
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;
    @Lob
    private byte[] message;
    private Boolean deleted = false;

    public Message (){
        this.messageId = UUID.randomUUID().toString();
    }

}
