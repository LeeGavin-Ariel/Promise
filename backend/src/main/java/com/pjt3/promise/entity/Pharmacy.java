package com.pjt3.promise.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name="Pharmacy")
public class Pharmacy {
    @Id
    @Column(name="pharm_id")
    int pharmId;

    @Column(name="pharm_name")
    String pharmName;

    @Column(name="pharm_addr")
    String pharmAddr;

    @Column(name="pharm_tel")
    String pharmTel;

    @Column(name="mon_open_time")
    String monOpenTime;

    @Column(name="mon_close_time")
    String monCloseTime;

    @Column(name="tue_open_time")
    String tueOpenTime;

    @Column(name="tue_close_time")
    String tueCloseTime;

    @Column(name="wed_open_time")
    String wedOpenTime;

    @Column(name="wed_close_time")
    String wedCloseTime;

    @Column(name="thu_open_time")
    String thuOpenTime;

    @Column(name="thu_close_time")
    String thuCloseTime;

    @Column(name="fri_open_time")
    String friOpenTime;

    @Column(name="fri_close_time")
    String friCloseTime;

    @Column(name="sat_open_time")
    String satOpenTime;

    @Column(name="sat_close_time")
    String satCloseTime;

    @Column(name="sun_open_time")
    String sunOpenTime;

    @Column(name="sun_close_time")
    String sunCloseTime;

    @Column(name="pharm_lat")
    int pharmLat;

    @Column(name="pharm_long")
    String pharmLong;

    @Column(name="pharm_addr_city")
    String pharmAddrCity;

    @Column(name="pharm_addr_gu")
    String pharmAddrGu;

}
