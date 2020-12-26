package com.mobile.operator.model;

public class SmartBusinessPlus extends MobileTariff implements Bonus {

    public SmartBusinessPlus(int costPackage, int limitMinuteInNet, int limitMinuteInOtherNet, int limitSms, int limitMegabyte) {
        super(costPackage, limitMinuteInNet, limitMinuteInOtherNet, limitSms, limitMegabyte);
    }

    @Override
    protected MobileTariff createTariff(String type) {
        return SmartBusinessPlus.this;
    }

    @Override
    public String orderBonus() {
        System.out.println("You get bonus 300 minutes");
        return toString();
    }
}
