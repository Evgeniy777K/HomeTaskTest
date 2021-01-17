package com.mobile.operator.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropWriteAndRead {
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

    public static String getValueFromProperties(String path, String name) {
        Properties properties = new Properties();
        FileInputStream in = null;
        try {
            in = new FileInputStream(path);
            properties.load(in);
            in.close();
            return properties.getProperty(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "default";
    }
}
