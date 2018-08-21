package com.example.CarSharing.model;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
public class Advertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String mark;
    private String carmodel;
    private Integer year;
    private String stateNumber;
    private String place;
    private String type;
    private String fuel;
    private Integer price;
    private String text;
    private String calendar;
    private boolean approve;

    private String photoFileName; // for files


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="user_id")
    private User author;

    public Advertisement(){}

    public Advertisement(String mark, String carmodel, Integer year,
                         String stateNumber, String place, String type,
                         String fuel, Integer price, String text,
                         String calendar, User user) {
        this.mark = mark;
        this.carmodel = carmodel;
        this.year = year;
        this.stateNumber = stateNumber;
        this.place = place;
        this.type = type;
        this.fuel = fuel;
        this.price = price;
        this.text = text;
        this.calendar = calendar;
        this.author = user;
    }

    public String getAuthorName () {
        return author != null ? author.getUsername() : "unknown";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getStateNumber() {
        return stateNumber;
    }

    public void setStateNumber(String stateNumber) {
        this.stateNumber = stateNumber;
    }

    public String getPhotoFileName() {
        return photoFileName;
    }

    public void setPhotoFileName(String photoFileName) {
        this.photoFileName = photoFileName;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCalendar() {
        return calendar;
    }

    public void setCalendar(String calendar) {
        this.calendar = calendar;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
    public boolean isApprove() {
        return approve;
    }

    public void setApprove(boolean approve) {
        this.approve = approve;
    }
}
