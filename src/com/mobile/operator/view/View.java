package com.mobile.operator.view;


import com.mobile.operator.controller.MobileTariffFactoryController;
import com.mobile.operator.model.Bonus;
import com.mobile.operator.model.Clients;
import com.mobile.operator.model.CostTariffComparator;
import com.mobile.operator.model.MobileTariff;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class View {
    public static void main(String[] args) {

        MobileTariffFactoryController factory = new MobileTariffFactoryController();

        MobileTariff smart = factory.createTariff("Smart");
        MobileTariff smartBasic = factory.createTariff("SmartBasic");
        MobileTariff smartMax = factory.createTariff("SmartMax");
        MobileTariff smartPlus = factory.createTariff("SmartPlus");
        MobileTariff smartBusiness = factory.createTariff("SmartBusiness");
        MobileTariff smartBusinessPlus = factory.createTariff("SmartBusinessPlus");

        List<Bonus> listTariff = new ArrayList<>();
        listTariff.add(smartBasic);
        listTariff.add(smart);
        listTariff.add(smartPlus);
        listTariff.add(smartMax);
        listTariff.add(smartBusinessPlus);
        listTariff.add(smartBusiness);


        Clients clientDiscount = new Clients("Petr", "80975864581", "Smart");
        Clients clientSecurity = new Clients("Olga", "80978754587", "SmartMax");
        Clients clientEconomies = new Clients("Vita", "80978974525", "SmartBasic");
        Clients clientAnalyst = new Clients("Vitaliy", "80508974525", "SmartPlus");
        Clients clientPremium = new Clients("Jack", "80968974533", "SmartBusiness");

        List<Clients> listClients = new LinkedList<>();
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
        CostTariffComparator comparator = new CostTariffComparator();
        Set<MobileTariff> tariffTypes = new TreeSet<>(comparator);
        tariffTypes.add(smart);
        tariffTypes.add(smartBasic);
        tariffTypes.add(smartBusiness);
        tariffTypes.add(smartMax);
        tariffTypes.add(smartBusinessPlus);
        tariffTypes.add(smartPlus);
        for (MobileTariff mobileTariff : tariffTypes) {
            System.out.println(mobileTariff.getCostPackage());
        }
    }
}
