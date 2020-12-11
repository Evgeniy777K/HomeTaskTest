package com.mobile.operator.model;

public abstract class MobileTariff implements Bonus {

    private int costPackage;
    private int limitMinuteInNet;
    private int limitMinuteInOtherNet;
    private int limitSms;
    private int limitMegabyte;

    public MobileTariff() {

    }


    public MobileTariff(int costPackage, int limitMinuteInNet, int limitMinuteInOtherNet, int limitSms, int limitMegabyte) {
        this.costPackage = costPackage;
        this.limitMinuteInNet = limitMinuteInNet;
        this.limitMinuteInOtherNet = limitMinuteInOtherNet;
        this.limitSms = limitSms;
        this.limitMegabyte = limitMegabyte;
    }


    protected abstract MobileTariff createTariff(TariffType type);


    public void setCostPackage(int costPackage) {
        this.costPackage = costPackage;
    }

    public void setLimitMinuteInNet(int limitMinuteInNet) {
        this.limitMinuteInNet = limitMinuteInNet;
    }

    public void setLimitMinuteInOtherNet(int limitMinuteInOtherNet) {
        this.limitMinuteInOtherNet = limitMinuteInOtherNet;
    }

    public void setLimitSms(int limitSms) {
        this.limitSms = limitSms;
    }

    public void setLimitMegabyte(int limitMegabyte) {
        this.limitMegabyte = limitMegabyte;
    }

    public int getCostPackage() {
        return costPackage;
    }

    public int getLimitMinuteInNet() {
        return limitMinuteInNet;
    }

    public int getLimitMinuteInOtherNet() {
        return limitMinuteInOtherNet;
    }

    public int getLimitSms() {
        return limitSms;
    }

    public int getLimitMegabyte() {
        return limitMegabyte;
    }


    @Override
    public String toString() {
        return "MobileTariff{" +
                ", costPackage=" + costPackage +
                ", limitMinuteInNet=" + limitMinuteInNet +
                ", limitMinuteInOtherNet=" + limitMinuteInOtherNet +
                ", limitSms=" + limitSms +
                ", limitMegabyte=" + limitMegabyte +
                '}';
    }
}
