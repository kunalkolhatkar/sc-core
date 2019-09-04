package com.secretchat.sccore.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
public class AccessLog {

    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private String id;
    @Column(columnDefinition = "VARCHAR(36)")
    private String url;
    @Column(columnDefinition = "VARCHAR(128)")
    private String ip;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    public AccessLog() {
        this.id = UUID.randomUUID().toString();;
    }
}
