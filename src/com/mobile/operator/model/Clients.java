package com.mobile.operator.model;

public class Clients {
    private final String clientName;
    private final String clientPhoneNumber;
    private final TariffType tariffType;


    public Clients(String clientName, String clientPhoneNumber, TariffType tariffType) {
        this.clientName = clientName;
        this.clientPhoneNumber = clientPhoneNumber;
        this.tariffType=tariffType;
    }

    public String getClientName() {
        return clientName;
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
