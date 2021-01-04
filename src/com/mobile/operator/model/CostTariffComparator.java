package com.mobile.operator.model;

import java.util.Comparator;

public class CostTariffComparator implements Comparator<MobileTariff> {
    @Override
    public int compare(MobileTariff o1, MobileTariff o2) {
        if (o1.getCostPackage() == o2.getCostPackage()) {
            return 0;
        }
        if (o1.getCostPackage() > o2.getCostPackage()) {
            return 1;
        } else {
            return -1;
        }
    }
}
