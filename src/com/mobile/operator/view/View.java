package com.mobile.operator.view;


import com.mobile.operator.controller.MobileTariffFactoryController;
import com.mobile.operator.model.Bonus;
import com.mobile.operator.model.Client;
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

        Client client1 = new Client("Petr", "80975864581", TariffType.SMARTBASIC);
        Client client2 = new Client("Olga", "80978754587", TariffType.SMARTBUSINESS);
        Client client3 = new Client("Vita", "80978974525", TariffType.SMARTMAX);
        Client client4 = new Client("Vitaliy", "80508974525", TariffType.SMART);
        Client client5 = new Client("Jack", "80968974533", TariffType.SMARTPLUS);

        List<Client> listClient = new ArrayList<>();
        listClient.add(client1);
        listClient.add(client2);
        listClient.add(client3);
        listClient.add(client4);
        listClient.add(client5);

        System.out.println("Number of clients = " + listClient.size());
        System.out.println("--------------------------------------");
        for (Bonus mobileTariff : listTariff) {
            System.out.println(mobileTariff.orderBonus());
            System.out.println("--------------------------------------");
        }
    }
}
