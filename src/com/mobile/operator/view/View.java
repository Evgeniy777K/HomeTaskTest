package com.mobile.operator.view;

import com.mobile.operator.controller.MobileTariffController;
import com.mobile.operator.exception.MyException;
import com.mobile.operator.model.Clients;
import com.mobile.operator.model.MobileTariff;
import com.mobile.operator.model.TariffType;
import com.mobile.operator.utils.ReadFromProp;
import com.mobile.operator.utils.ReadingFromFile;
import com.mobile.operator.utils.WriteToProp;
import com.mobile.operator.utils.WritingToFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class View {
    public void viewMenu() throws Exception {

        System.out.println("======Welcome to the Kyivstar ======\n\tPlease tell me how can I help you:");
        System.out.println("Press 1 - get info tariffs.\nPress 2 - get info clients.\nPress 3 - surprise.");
        System.out.print("Please make you choice: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        MobileTariff smart = MobileTariffController.orderTariff(100, 90, 60, 70, TariffType.SMART);
        MobileTariff smartBasic = MobileTariffController.orderTariff(150, 120, 70, 80, TariffType.SMARTBASIC);
        MobileTariff smartMax = MobileTariffController.orderTariff(300, 270, 150, 130, TariffType.SMARTMAX);
        MobileTariff smartPlus = MobileTariffController.orderTariff(500, 800, 500, 600, TariffType.SMARTPLUS);
        MobileTariff smartBusiness = MobileTariffController.orderTariff(600, 1000, 700, 1000, TariffType.SMARTBUSINESS);
        MobileTariff smartBusinessPlus = MobileTariffController.orderTariff(1200, 2000, 1000, 1500, TariffType.SMARTBUSINESSPLUS);


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

        List<Clients> listClients = new LinkedList<>();
        listClients.add(clientDiscount);
        listClients.add(clientSecurity);
        listClients.add(clientEconomies);
        listClients.add(clientAnalyst);
        listClients.add(clientPremium);

        switch (reader.readLine()) {
            case "1":
                for (MobileTariff tariffs : listTariff) {
                    System.out.println(tariffs.getTariff());
                }
                break;
            case "2":
                for (Clients clients : listClients) {
                    System.out.println(clients);
                }
                break;
            case "3":
                System.out.println("Try again");
                return;
        }

        System.out.println("Input tariff name");
        String tariffName = null;
        try {
            tariffName = reader.readLine();
        } catch (
                IOException e) {
            System.out.println(e.getMessage());


        }
        List<String> tariffFromClient = new ArrayList<>();
        for (MobileTariff tariff : listTariff) {
            TariffType type = tariff.getTariff();
            if (tariffName != null)
                if (tariffName.equals(type.tariffName)) {
                    tariffFromClient.add(tariff.toString());
                    WritingToFile.writeToFile(tariffFromClient);
                    ReadingFromFile.readFile();
                }
        }

        System.out.println("Input client name");
        String nameClient = null;
        try {
            nameClient = reader.readLine();

        } catch (
                IOException e) {
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

        for (Clients clients : listClients) {
            String name = clients.getClientName();
            if (tariffName != null)
                if (nameClient.equals(name)) {
                    tariffFromClient.add(clients.toString());
                    WritingToFile.writeToFile(tariffFromClient);
                    ReadingFromFile.readFile();
                }
        }
        WriteToProp.setValueToProperties("app.properties", "Petr", "Smart");
        ReadFromProp.getValueFromProperties("app.properties", "Petr");
    }
}
