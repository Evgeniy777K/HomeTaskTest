package com.mobile.operator.model;

import com.mobile.operator.controller.MobileTariffFactoryController;

public class SmartBusiness extends MobileTariff implements Bonus {


    public SmartBusiness(int costPackage, int limitMinuteInNet, int limitMinuteInOtherNet, int limitSms, int limitMegabyte) {
        super(costPackage, limitMinuteInNet, limitMinuteInOtherNet, limitSms, limitMegabyte);
    }

    @Override
    protected MobileTariff createTariff(TariffType type) {
        return new MobileTariffFactoryController().createTariff(type);
    }

    @Override
    public String orderBonus() {
        System.out.println("You get bonus 200 minutes");
        return toString();
    }
}
