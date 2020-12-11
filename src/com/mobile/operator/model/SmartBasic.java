package com.mobile.operator.model;

import com.mobile.operator.controller.MobileTariffFactoryController;

public class SmartBasic extends MobileTariff {

    public SmartBasic(int costPackage, int limitMinuteInNet, int limitMinuteInOtherNet, int limitSms, int limitMegabyte) {
        super(costPackage, limitMinuteInNet, limitMinuteInOtherNet, limitSms, limitMegabyte);
    }

    @Override
    protected MobileTariff createTariff(TariffType type) {
        return new MobileTariffFactoryController().createTariff(type);

    }

    @Override
    public String orderBonus() {
        return toString();
    }
}
