package com.secretchat.sccore.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Account {

    @Id
    private String userId;
    @Lob
    private byte[] pic;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthday;

}
