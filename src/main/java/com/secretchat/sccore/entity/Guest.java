package com.secretchat.sccore.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
public class Guest {

    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private String guestId;
    @Column(columnDefinition = "VARCHAR(128)")
    private String ip;
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Temporal(TemporalType.TIMESTAMP)
    private Date deleted;
    private Boolean isDeleted;

    public Guest(){
        this.guestId = UUID.randomUUID().toString();
    }

}
