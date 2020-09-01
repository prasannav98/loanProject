package com.Team3.loanProject.entities;

import javax.persistence.*;

@Entity
@Table(name="mytable",schema = "loangiver")
public class Data {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name = "delinq_2yrs")
    private int d2y;
    @Column(name = "inq_last_6mths")
    private int il6m;
    @Column(name = "mths_since_last_delinq")
    private int msld;
    @Column(name = "mths_since_last_record")
    private int mslr;
    @Column(name = "open_acc")
    private int openaccount;
    @Column(name = "pub_rec")
    private int publicrecord;
    @Column(name = "revol_bal")
    private int revolbalance;
    @Column(name = "revol_util")
    private double revolutil;
    @Column(name = "total_acc")
    private int totalaccounts;
    @Column(name = "earliest_cr_line")
    private String eacr;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getD2y() {
        return d2y;
    }

    public void setD2y(int d2y) {
        this.d2y = d2y;
    }

    public int getIl6m() {
        return il6m;
    }

    public void setIl6m(int il6m) {
        this.il6m = il6m;
    }

    public int getMsld() {
        return msld;
    }

    public void setMsld(int msld) {
        this.msld = msld;
    }

    public int getMslr() {
        return mslr;
    }

    public void setMslr(int mslr) {
        this.mslr = mslr;
    }

    public int getOpenaccount() {
        return openaccount;
    }

    public void setOpenaccount(int openaccount) {
        this.openaccount = openaccount;
    }

    public int getPublicrecord() {
        return publicrecord;
    }

    public void setPublicrecord(int publicrecord) {
        this.publicrecord = publicrecord;
    }

    public int getRevolbalance() {
        return revolbalance;
    }

    public void setRevolbalance(int revolbalance) {
        this.revolbalance = revolbalance;
    }

    public double getRevolutil() {
        return revolutil;
    }

    public void setRevolutil(double revolutil) {
        this.revolutil = revolutil;
    }

    public int getTotalaccounts() {
        return totalaccounts;
    }

    public void setTotalaccounts(int totalaccounts) {
        this.totalaccounts = totalaccounts;
    }

    public String getEacr() {
        return eacr;
    }

    public void setEacr(String eacr) {
        this.eacr = eacr;
    }



}
