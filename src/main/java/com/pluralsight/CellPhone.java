package com.pluralsight;

import java.util.Scanner;

public class CellPhone {
    Scanner input = new Scanner(System.in);

    private int serialNum;
    private String model;
    private String carrier;
    private String phoneNum;
    private String owner;
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
        System.out.print("Serial Number: ");
        serialNum = input.nextInt();
        input.nextLine();
        this.serialNum = serialNum;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        System.out.print("Phone Model: ");
        model = input.nextLine();
        this.model = model;
    }

    public String getCarrier(){
        return carrier;
    }

    public void setCarrier(String carrier){
        System.out.print("Carrier: ");
        carrier = input.nextLine();
        this.carrier = carrier;
    }

    public String getPhoneNum(){
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum){
        System.out.print("Phone Number: ");
        phoneNum = input.nextLine();
        this.phoneNum = phoneNum;
    }

    public String getOwner(){
        return owner;
    }

    public void setOwner(String owner){
        System.out.print("Owner: ");
        owner = input.nextLine();
        this.owner = owner;
    }}