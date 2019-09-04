package com.secretchat.sccore.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Data
public class UserConnectionLog {

    @Id
    private String id;
    private String userId;
    private String ip;
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;
    private String action;

}
