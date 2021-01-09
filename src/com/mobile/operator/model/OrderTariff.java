package com.mobile.operator.model;

public interface OrderTariff {

     MobileTariff orderTariff( int costPackage, int limitMinuteInNet, int limitSms, int limitMegabyte);

}
