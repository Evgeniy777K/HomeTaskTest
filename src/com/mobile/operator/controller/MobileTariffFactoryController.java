package com.mobile.operator.controller;

import com.mobile.operator.model.*;

public class MobileTariffFactoryController {
    //    Create ign my fabric method createTariff which takes in a variable -enum TariffType type
    public MobileTariff createTariff(TariffType type) {

        MobileTariff tariff = null;
// Write in body method block switch-case, in which I go through everything enum values and create the object class, corresponding to the enum value:
        switch (type) {
            case SMART:
                tariff = new Smart(100, 100, 60, 60, 6000);
                break;
            case SMARTBASIC:
                tariff = new SmartBasic(150, 120, 70, 80, 12000);
                break;
            case SMARTMAX:
                tariff = new SmartMax(300, 270, 150, 130, 25000);
                break;
            case SMARTPLUS:
                tariff = new SmartPlus(500, 800, 500, 600, 27000);
                break;
            case SMARTBUSINESS:
                tariff = new SmartBusiness(600, 1000, 700, 1000, 30000);
                break;
            case SMARTBUSINESSPLUS:
                tariff = new SmartBusinessPlus(1200, 2000, 1000, 1500, 40000);
                break;
            default:
                throw new IllegalArgumentException("Wrong mobileTariff type:" + type);

        }
        return tariff;


    }
}