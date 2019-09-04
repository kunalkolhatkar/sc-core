package com.secretchat.sccore.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {

    @Id
    private String userId;
    @Column(columnDefinition = "VARCHAR(128)")
    private String emailId;
    private String pass;
    private Boolean active;
    private Boolean deleted;
    private Boolean verified;

    @OneToOne
    @JoinColumn(name="userId")
    private Account account;

}
