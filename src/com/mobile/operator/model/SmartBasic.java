package com.mobile.operator.model;

public class SmartBasic extends MobileTariff {

    public SmartBasic(int costPackage, int limitMinuteInNet, int limitMinuteInOtherNet, int limitSms, int limitMegabyte) {
        super(costPackage, limitMinuteInNet, limitMinuteInOtherNet, limitSms, limitMegabyte);
    }

    @Override
    protected MobileTariff createTariff(String type) {
        return SmartBasic.this;

    }

    @Override
    public String orderBonus() {
        System.out.println("You get bonus 150 minutes");
        return toString();
    }
}
