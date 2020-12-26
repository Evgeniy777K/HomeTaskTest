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

        Bonus smart = factory.createTariff("Smart");
        Bonus smartBasic = factory.createTariff("SmartBasic");
        Bonus smartMax = factory.createTariff("SmartMax");
        Bonus smartPlus = factory.createTariff("SmartPlus");
        Bonus smartBusiness = factory.createTariff("SmartBusiness");
        Bonus smartBusinessPlus = factory.createTariff("SmartBusinessPlus");

        List<Bonus> listTariff = new ArrayList<>();
        listTariff.add(smart);
        listTariff.add(smartBasic);
        listTariff.add(smartMax);
        listTariff.add(smartPlus);
        listTariff.add(smartBusiness);
        listTariff.add(smartBusinessPlus);

        Clients clientDiscount = new Clients("Petr", "80975864581", "Smart");
        Clients clientSecurity = new Clients("Olga", "80978754587", "SmartMax");
        Clients clientEconomies = new Clients("Vita", "80978974525", "SmartBasic");
        Clients clientAnalyst = new Clients("Vitaliy", "80508974525", "SmartPlus");
        Clients clientPremium = new Clients("Jack", "80968974533", "SmartBusiness");

        List<Clients> listClients = new ArrayList<>();
        listClients.add(clientDiscount);
        listClients.add(clientSecurity);
        listClients.add(clientEconomies);
        listClients.add(clientAnalyst);
        listClients.add(clientPremium);

        System.out.println("--------------------------------------");
        System.out.println("Number of clients = " + listClients.size());
        System.out.println("--------------------------------------");

        for (Bonus mobileTariff : listTariff) {
            System.out.println(mobileTariff.orderBonus());
            System.out.println("--------------------------------------");
        }
    }
}
