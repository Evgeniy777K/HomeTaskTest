package com.mobile.operator.model;

public class SmartBasic implements OrderTariff {


    @Override
    public MobileTariff orderTariff(int costPackage, int limitMinuteInNet, int limitSms, int limitMegabyte) {
        return new MobileTariff(costPackage,limitMinuteInNet,limitSms,limitMegabyte);
    }
}
