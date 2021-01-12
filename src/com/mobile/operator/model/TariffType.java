package com.mobile.operator.model;


import java.io.IOException;

public enum TariffType {
    SMART("Smart"),
    SMARTBASIC("SmartBasic"),
    SMARTMAX("SmartMax"),
    SMARTPLUS("SmartPlus"),
    SMARTBUSINESS("SmartBusiness"),
    SMARTBUSINESSPLUS("SmartBusinessPlus");


    public String tariffName;


    TariffType(String tariffName) {
        this.tariffName = tariffName;
    }


    public String getTariffName() {
        return tariffName;
    }

    public static TariffType findTariff(String type) throws IOException {
        for (TariffType tariffType : TariffType.values()) {
            if (tariffType.getTariffName().equals(type)) {
                return tariffType;
            }
        }
        throw new IOException();
    }
}
