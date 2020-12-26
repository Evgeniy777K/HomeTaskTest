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


    protected abstract MobileTariff createTariff(String type);


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
