package com.secretchat.sccore.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class GeographicalData {

    @Id
    @Column(columnDefinition = "VARCHAR(128)")
    private String ip;
    @Column(columnDefinition = "VARCHAR(32)")
    private String type;
    @Column(columnDefinition = "VARCHAR(128)")
    private String value;
}
