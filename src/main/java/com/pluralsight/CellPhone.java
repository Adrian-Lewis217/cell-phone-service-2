package com.pluralsight;

public class CellPhone {
    private int serialNum;
    private String model;
    private String carrier;
    private String phoneNum;
    private String owner;
}

// constructor
public CellPhone(){
    this.serialNum = 0;
    this.model = "";
    this.carrier = "";
    this.phoneNum = "";
    this.owner = "";
}

// Getter and Setter
public int getSerialNum(){
    return serialNum;
}

public void setSerialNum(int serialNum){
    return this.serialNum;
}

public String getModel(){
    return model;
}

public void setModel(String model){
    return this.model;
}

public String getCarrier(){
    return carrier;
}

public void setCarrier(String carrier){
    return this.carrier;
}

public String getPhoneNum(){
    return phoneNum;
}

public void setPhoneNum(String phoneNum){
    return this.phoneNum;
}

public String getOwner(){
    return owner;
}

public void setOwner(String owner){
    return this.owner;
}