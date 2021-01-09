package com.mobile.operator.view;

import com.mobile.operator.controller.MobileTariffController;
import com.mobile.operator.model.Clients;
import com.mobile.operator.model.MobileTariff;
import com.mobile.operator.model.MyException;
import com.mobile.operator.model.TariffType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class View {
    public static void main(String[] args) throws MyException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        MobileTariff smart = null;
        MobileTariff smartBasic = null;
        MobileTariff smartMax = null;
        MobileTariff smartPlus = null;
        MobileTariff smartBusiness = null;
        MobileTariff smartBusinessPlus = null;

        System.out.println("Input correct name tariff");

        try {
            smart = MobileTariffController.orderTariff(100, 90, 60, 70, TariffType.findTariff(reader.readLine()));
            smartBasic = MobileTariffController.orderTariff(150, 120, 70, 80, TariffType.findTariff(reader.readLine()));
            smartMax = MobileTariffController.orderTariff(300, 270, 150, 130, TariffType.findTariff(reader.readLine()));
            smartPlus = MobileTariffController.orderTariff(500, 800, 500, 600, TariffType.findTariff(reader.readLine()));
            smartBusiness = MobileTariffController.orderTariff(600, 1000, 700, 1000, TariffType.findTariff(reader.readLine()));
            smartBusinessPlus = MobileTariffController.orderTariff(1200, 2000, 1000, 1500, TariffType.findTariff(reader.readLine()));

        } catch (Exception e) {
            System.out.println("Input is not correct");
        }


        System.out.println("Input tariff name");
        String tariffName = null;
        try {
            tariffName = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        List<MobileTariff> listTariff = new LinkedList<>();
        listTariff.add(smartBasic);
        listTariff.add(smart);
        listTariff.add(smartPlus);
        listTariff.add(smartMax);
        listTariff.add(smartBusinessPlus);
        listTariff.add(smartBusiness);


        Clients clientDiscount = new Clients("Petr", "80975864581", TariffType.SMART);
        Clients clientSecurity = new Clients("Olga", "80978754587", TariffType.SMARTMAX);
        Clients clientEconomies = new Clients("Vita", "80978974525", TariffType.SMARTBASIC);
        Clients clientAnalyst = new Clients("Vitaliy", "80508974525", TariffType.SMARTPLUS);
        Clients clientPremium = new Clients("Jack", "80968974533", TariffType.SMARTBUSINESS);

        System.out.println("Input client name");
        String nameClient = null;
        try {
            nameClient = reader.readLine();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        if (nameClient.equals("")) {
            throw new MyException("String can not be empty!");
        }
        List<Clients> listClients = new LinkedList<>();
        listClients.add(clientDiscount);
        listClients.add(clientSecurity);
        listClients.add(clientEconomies);
        listClients.add(clientAnalyst);
        listClients.add(clientPremium);


        for (MobileTariff tariff : listTariff) {
            for (Clients clients : listClients) {

                if (tariff.getTariff().tariffName.equals(tariffName) && clients.getClientName().equals(nameClient)) {
                    System.out.println(tariff + " " + clients);
                    System.out.println("--------------------------------------");

                }
            }
        }
    }
}
