package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Serial Number: ");
        int serialNum = input.nextInt();
        cellPhone1.setSerialNum(serialNum);
        input.nextLine(); // buffer

        System.out.print("Enter Model of Phone: ");
        String model = input.nextLine();
        cellPhone1.setModel(model);

        System.out.print("Enter the Carrier: ");
        String carrier = input.nextLine();
        cellPhone1.setCarrier(carrier);

        System.out.print("Enter the Phone Number: ");
        String phoneNum = input.nextLine();
        cellPhone1.setPhoneNum(phoneNum);

        System.out.print("Enter name of Owner: ");
        String owner = input.nextLine();
        cellPhone1.setOwner(owner);

        input.close();

        System.out.println("\nCellPhone");
        System.out.println("Serial Number: " + cellPhone1.getSerialNum());
        System.out.println("Model: " + cellPhone1.getModel());
        System.out.println("Carrier: " + cellPhone1.getCarrier());
        System.out.println("Phone Number: " + cellPhone1.getPhoneNum());
        System.out.println("Owner: " + cellPhone1.getOwner());


    }
}
