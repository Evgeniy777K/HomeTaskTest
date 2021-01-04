package com.mobile.operator.view;


import com.mobile.operator.controller.MobileTariffFactoryController;
import com.mobile.operator.model.Clients;
import com.mobile.operator.model.CostTariffComparator;
import com.mobile.operator.model.MobileTariff;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.LinkedList;
import java.util.Set;


public class View {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MobileTariffFactoryController factory = new MobileTariffFactoryController();

        MobileTariff smart = factory.createTariff("Smart");
        MobileTariff smartBasic = factory.createTariff("SmartBasic");
        MobileTariff smartMax = factory.createTariff("SmartMax");
        MobileTariff smartPlus = factory.createTariff("SmartPlus");
        MobileTariff smartBusiness = factory.createTariff("SmartBusiness");
        MobileTariff smartBusinessPlus = factory.createTariff("SmartBusinessPlus");

        List<String> listTariff = new ArrayList<>();
        System.out.println("Input tariff");
        String input = scanner.next();
        listTariff.add(smartBasic.toString());
        listTariff.add(smart.toString());
        listTariff.add(smartPlus.toString());
        listTariff.add(smartMax.toString());
        listTariff.add(smartBusinessPlus.toString());
        listTariff.add(smartBusiness.toString());
        listTariff.add(input);

        Clients clientDiscount = new Clients("Petr", "80975864581", "Smart");
        Clients clientSecurity = new Clients("Olga", "80978754587", "SmartMax");
        Clients clientEconomies = new Clients("Vita", "80978974525", "SmartBasic");
        Clients clientAnalyst = new Clients("Vitaliy", "80508974525", "SmartPlus");
        Clients clientPremium = new Clients("Jack", "80968974533", "SmartBusiness");

        List<String> listClients = new LinkedList<>();
        System.out.println("Input client name");
        String inputs = scanner.next();
        listClients.add(clientDiscount.toString());
        listClients.add(clientSecurity.toString());
        listClients.add(clientEconomies.toString());
        listClients.add(clientAnalyst.toString());
        listClients.add(clientPremium.toString());
        listClients.add(inputs);


        if (input.equals("Smart"))
            System.out.println(smart);

        if (inputs.equals("Petr"))
            System.out.println(listClients.get(0));
        else
            System.out.println("This is not Petr");

        System.out.println("--------------------------------------");


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
