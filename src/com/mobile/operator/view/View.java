package com.mobile.operator.view;


import com.mobile.operator.controller.MobileTariffFactoryController;
import com.mobile.operator.model.Bonus;
import com.mobile.operator.model.Clients;
import com.mobile.operator.model.TariffType;

import java.util.ArrayList;
import java.util.List;

public class View {
    public static void main(String[] args) {

        MobileTariffFactoryController factory = new MobileTariffFactoryController();

        Bonus smart = factory.createTariff(TariffType.SMART);
        Bonus smartBasic = factory.createTariff(TariffType.SMARTBASIC);
        Bonus smartMax = factory.createTariff(TariffType.SMARTMAX);
        Bonus smartPlus = factory.createTariff(TariffType.SMARTPLUS);
        Bonus smartBusiness = factory.createTariff(TariffType.SMARTBUSINESS);
        Bonus smartBusinessPlus = factory.createTariff(TariffType.SMARTBUSINESSPLUS);

        List<Bonus> listTariff = new ArrayList<>();
        listTariff.add(smart);
        listTariff.add(smartBasic);
        listTariff.add(smartMax);
        listTariff.add(smartPlus);
        listTariff.add(smartBusiness);
        listTariff.add(smartBusinessPlus);

        Clients clients1 = new Clients("Petr", "80975864581", TariffType.SMARTBASIC);
        Clients clients2 = new Clients("Olga", "80978754587", TariffType.SMARTBUSINESS);
        Clients clients3 = new Clients("Vita", "80978974525", TariffType.SMARTMAX);
        Clients clients4 = new Clients("Vitaliy", "80508974525", TariffType.SMART);
        Clients clients5 = new Clients("Jack", "80968974533", TariffType.SMARTPLUS);

        List<Clients> listClients = new ArrayList<>();
        listClients.add(clients1);
        listClients.add(clients2);
        listClients.add(clients3);
        listClients.add(clients4);
        listClients.add(clients5);

        System.out.println("Number of clients = " + listClients.size());
        System.out.println("--------------------------------------");

        for (Bonus mobileTariff : listTariff) {
            System.out.println(mobileTariff.orderBonus());
            System.out.println("--------------------------------------");
        }
    }
}
