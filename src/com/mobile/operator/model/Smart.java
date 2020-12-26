package com.mobile.operator.model;

public class Smart extends MobileTariff implements Bonus {


    public Smart(int costPackage, int limitMinuteInNet, int limitMinuteInOtherNet, int limitSms, int limitMegabyte) {
        super(costPackage, limitMinuteInNet, limitMinuteInOtherNet, limitSms, limitMegabyte);
    }

    @Override
    protected MobileTariff createTariff(String type) {
        return Smart.this;
    }

    @Override
    public String orderBonus() {
        System.out.println("You get bonus 100 minutes");
        return toString();
    }
}