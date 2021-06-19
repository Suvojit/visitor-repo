package com.diversified.visitorbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Visitor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    private String firstName;

    private String lastName;

    private String organization;

    private String buildingName;

    private Date visitingDate;

    private String licensePlate;

    private String type;

    private String meetingRoom;

    private String explanation;

    private String remarks;

    private String contactEmail;

    private String contactTelephone;

    private int badgeId;

    private Boolean checkedIin;

    private Boolean checkedOut;

    private Date checkedInTime;

    private Date checkedOutTime;

    private byte[] image;

}
