package com.mobile.operator.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProp {
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
