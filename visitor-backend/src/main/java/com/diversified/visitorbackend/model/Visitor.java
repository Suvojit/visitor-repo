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

    private String building_name;

    private Date visiting_date;

    private String firstname;

    private String lastname;

    private String organization;

    private String license_plate;

    private String type;

    private String meeting_room;

    private String explanation;

    private String remarks;

    private String contact_email;

    private String contact_telephone;

    private int badge_id;

    private Boolean checked_in;

    private Boolean checked_out;

    private Date checked_in_time;

    private Date checked_out_time;

    private byte[] image;

}
