package com.mobile.operator.utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToProp {
    public static void setValueToProperties(String path, String name, String tariff) {
        Properties properties = new Properties();
        try {
            FileOutputStream out = new FileOutputStream(path);
            properties.setProperty(name, tariff);
            properties.store(out, null);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
