package com.mobile.operator.controller;



import com.mobile.operator.model.MobileTariff;
import com.mobile.operator.model.Smart;
import com.mobile.operator.model.SmartBasic;
import com.mobile.operator.model.SmartMax;
import com.mobile.operator.model.SmartPlus;
import com.mobile.operator.model.SmartBusiness;
import com.mobile.operator.model.SmartBusinessPlus;


import static com.mobile.operator.model.TariffType.SMART;
import static com.mobile.operator.model.TariffType.SMARTBASIC;
import static com.mobile.operator.model.TariffType.SMARTPLUS;
import static com.mobile.operator.model.TariffType.SMARTBUSINESS;
import static com.mobile.operator.model.TariffType.SMARTBUSINESSPLUS;
import static com.mobile.operator.model.TariffType.SMARTMAX;


public class MobileTariffFactoryController {
    //    Create my fabric method createTariff which takes in a variable -enum TariffType type
    public MobileTariff createTariff(String type) {

        MobileTariff tariff;
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