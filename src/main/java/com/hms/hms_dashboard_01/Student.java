package com.hms.hms_dashboard_01;

public class Student {
    private String studentUsername;
    private String studentPassword;
    private String name;
    private String rollNo;
    private String year;
    private String roomNo;
    private String roomType;
    private String roomPrice;
    private String roomStatus;

    public Student(String name, String rollNo, String branch, String year, String roomNo, String roomType, String roomPrice, String roomStatus) {
        this.name = name;
        this.rollNo = rollNo;
        this.year = year;
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.roomStatus = roomStatus;
    }

    Student(String studentUsername, String studentPassword) {
        this.studentUsername = studentUsername;
        this.studentPassword = studentPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(String roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }
}
