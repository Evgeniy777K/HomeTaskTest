package com.mobile.operator.controller;

import com.mobile.operator.model.MobileTariff;
import com.mobile.operator.model.Smart;
import com.mobile.operator.model.SmartBasic;
import com.mobile.operator.model.SmartPlus;
import com.mobile.operator.model.SmartMax;
import com.mobile.operator.model.SmartBusinessPlus;
import com.mobile.operator.model.SmartBusiness;
import com.mobile.operator.model.TariffType;

public class MobileTariffController {

    public static MobileTariff orderTariff(int costPackage, int limitMinuteInNet, int limitSms, int limitMegabyte, TariffType type) {

        MobileTariff tariff;

        switch (type) {
            case SMART:
                Smart smart = new Smart();
                tariff = smart.orderTariff(costPackage, limitMinuteInNet, limitSms, limitMegabyte);
                tariff.setTariff(type);
                break;
            case SMARTBASIC:
                SmartBasic smartBasic = new SmartBasic();
                tariff = smartBasic.orderTariff(costPackage, limitMinuteInNet, limitSms, limitMegabyte);
                tariff.setTariff(type);
                break;
            case SMARTMAX:
                SmartMax smartMax = new SmartMax();
                tariff = smartMax.orderTariff(costPackage, limitMinuteInNet, limitSms, limitMegabyte);
                tariff.setTariff(type);
                break;
            case SMARTPLUS:
                SmartPlus smartPlus = new SmartPlus();
                tariff = smartPlus.orderTariff(costPackage, limitMinuteInNet, limitSms, limitMegabyte);
                tariff.setTariff(type);
                break;
            case SMARTBUSINESS:
                SmartBusiness smartBusiness = new SmartBusiness();
                tariff = smartBusiness.orderTariff(costPackage, limitMinuteInNet, limitSms, limitMegabyte);
                tariff.setTariff(type);
                break;
            case SMARTBUSINESSPLUS:
                SmartBusinessPlus smartBusinessPlus = new SmartBusinessPlus();
                tariff = smartBusinessPlus.orderTariff(costPackage, limitMinuteInNet, limitSms, limitMegabyte);
                tariff.setTariff(type);
                break;
            default:
                throw new IllegalArgumentException("Wrong mobileTariff type:" + type);

        }
        return tariff;


    }
}