package com.mobile.operator.model;

public class SmartMax extends MobileTariff implements Bonus {


    public SmartMax(int costPackage, int limitMinuteInNet, int limitMinuteInOtherNet, int limitSms, int limitMegabyte) {
        super(costPackage, limitMinuteInNet, limitMinuteInOtherNet, limitSms, limitMegabyte);
    }

    @Override
    protected MobileTariff createTariff(String type) {
        return SmartMax.this;
    }

    @Override
    public String orderBonus() {
        System.out.println("You get bonus 180 minutes");
        return toString();
    }
}

