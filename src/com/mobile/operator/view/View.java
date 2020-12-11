package com.mobile.operator.view;


import com.mobile.operator.controller.MobileTariffFactoryController;
import com.mobile.operator.model.Bonus;
import com.mobile.operator.model.TariffType;

public class View {
    public static void main(String[] args) {

        MobileTariffFactoryController factory = new MobileTariffFactoryController();

        Bonus smart = factory.createTariff(TariffType.SMART);
        Bonus smartBasic = factory.createTariff(TariffType.SMARTBASIC);
        Bonus smartMax = factory.createTariff(TariffType.SMARTMAX);
        Bonus smartPlus = factory.createTariff(TariffType.SMARTPLUS);
        Bonus smartBusiness = factory.createTariff(TariffType.SMARTBUSINESS);
        Bonus smartBusinessPlus = factory.createTariff(TariffType.SMARTBUSINESSPLUS);

        System.out.println(smart.orderBonus());
        System.out.println("--------------------------------------------------------");
        System.out.println(smartBasic.orderBonus());
        System.out.println("--------------------------------------------------------");
        System.out.println(smartMax.orderBonus());
        System.out.println("--------------------------------------------------------");
        System.out.println(smartPlus.orderBonus());
        System.out.println("--------------------------------------------------------");
        System.out.println(smartBusiness.orderBonus());
        System.out.println("--------------------------------------------------------");
        System.out.println(smartBusinessPlus.orderBonus());


    }
}
