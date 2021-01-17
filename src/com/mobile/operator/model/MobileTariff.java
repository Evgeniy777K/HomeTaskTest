package com.mobile.operator.model;

public class MobileTariff  {
    private int costPackage;
    private int limitMinuteInNet;
    private int limitSms;
    private int limitMegabyte;
    private TariffType tariff;

    public MobileTariff() {

    }

    public MobileTariff(int costPackage, int limitMinuteInNet, int limitSms, int limitMegabyte) {
        this.costPackage = costPackage;
        this.limitMinuteInNet = limitMinuteInNet;
        this.limitSms = limitSms;
        this.limitMegabyte = limitMegabyte;
    }

    public void setTariff(TariffType tariff) {
        this.tariff = tariff;
    }

    public TariffType getTariff() {
        return tariff;
    }


    @Override
    public String toString() {
        return "MobileTariff{" +
                "costPackage=" + costPackage +
                ", limitMinuteInNet=" + limitMinuteInNet +
                ", limitSms=" + limitSms +
                ", limitMegabyte=" + limitMegabyte +
                '}';
    }
}
