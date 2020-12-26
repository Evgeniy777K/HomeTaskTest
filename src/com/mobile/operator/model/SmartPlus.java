package com.mobile.operator.model;

public class SmartPlus extends MobileTariff implements Bonus {

    public SmartPlus(int costPackage, int limitMinuteInNet, int limitMinuteInOtherNet, int limitSms, int limitMegabyte) {
        super(costPackage, limitMinuteInNet, limitMinuteInOtherNet, limitSms, limitMegabyte);
    }

    @Override
    protected MobileTariff createTariff(String type) {
        return SmartPlus.this;

    }

    @Override
    public String orderBonus() {
        System.out.println("You get bonus 200 minutes");
        return toString();
    }
}
