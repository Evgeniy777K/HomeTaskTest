package com.mobile.operator.model;

public class Client {
    private String clientName;
    private String clientPhoneNumber;
    private TariffType tariffType;

    public Client(){

    }

    public Client(String clientName, String clientPhoneNumber, TariffType tariffType) {
        this.clientName = clientName;
        this.clientPhoneNumber = clientPhoneNumber;
        this.tariffType = tariffType;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientPhoneNumber() {
        return clientPhoneNumber;
    }

    public void setClientPhoneNumber(String clientPhoneNumber) {
        this.clientPhoneNumber = clientPhoneNumber;
    }

    public TariffType getTariffType() {
        return tariffType;
    }

    public void setTariffType(TariffType tariffType) {
        this.tariffType = tariffType;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientName='" + clientName + '\'' +
                ", clientPhoneNumber='" + clientPhoneNumber + '\'' +
                ", tariffType=" + tariffType +
                '}';
    }
}
