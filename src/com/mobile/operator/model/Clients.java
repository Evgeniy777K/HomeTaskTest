package com.mobile.operator.model;

public class Clients {
    private final String clientName;
    private final String clientPhoneNumber;
    private String tariffType;


    public Clients(String clientName, String clientPhoneNumber, String tariffType) {
        this.clientName = clientName;
        this.clientPhoneNumber = clientPhoneNumber;
        this.tariffType=tariffType;
    }


    @Override
    public String toString() {
        return "Clients{" +
                "clientName='" + clientName + '\'' +
                ", clientPhoneNumber='" + clientPhoneNumber + '\'' +
                ", tariffType='" + tariffType + '\'' +
                '}';
    }
}
