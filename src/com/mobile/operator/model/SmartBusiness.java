package com.mobile.operator.model;

public class SmartBusiness extends MobileTariff implements Bonus {


    public SmartBusiness(int costPackage, int limitMinuteInNet, int limitMinuteInOtherNet, int limitSms, int limitMegabyte) {
        super(costPackage, limitMinuteInNet, limitMinuteInOtherNet, limitSms, limitMegabyte);
    }

    @Override
    protected MobileTariff createTariff(String type) {
        return SmartBusiness.this;
    }

    @Override
    public String orderBonus() {
        System.out.println("You get bonus 220 minutes");
        return toString();
    }
}
